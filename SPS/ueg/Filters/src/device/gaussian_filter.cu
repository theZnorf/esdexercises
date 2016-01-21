//       $Id: gaussian_filter.cu 30314 2016-01-03 15:42:34Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/device/gaussian_filter.cu $
// $Revision: 30314 $
//     $Date: 2016-01-03 16:42:34 +0100 (So., 03 Jän 2016) $
//   Creator: Ch. Angerer, NVIDIA, J. Demouth, NVIDIA, peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#include "./gaussian_filter.h"

// -------------------------------------------------------------------------------------------------

__constant__ int const filter_v1 [7][7] = {
   {1, 2,  3,  4,  3, 2, 1},
   {2, 4,  6,  8,  6, 4, 2},
   {3, 6,  9, 12,  9, 6, 3},
   {4, 8, 12, 16, 12, 8, 4},
   {3, 6,  9, 12,  9, 6, 3},
   {2, 4,  6,  8,  6, 4, 2},
   {1, 2,  3,  4,  3, 2, 1}
};

__global__ void gaussian_filter_kernel_v1 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {

// position of the thread in the image

   int const x = pfc::global_thread_idx_x ();
   int const y = pfc::global_thread_idx_y ();

   if (pfc::inside_rect (x, y, w, h)) {   // early exit if the thread is not in the image

//    load my 48 neighbors and myself

      int n [7][7];   // = {}   // initialization costs time

      for (int j = -3; j <= 3; ++j) {
         for (int i = -3; i <= 3; ++i) {
            n[j + 3][i + 3] = pfc::inside_rect (x + i, y + j, w, h) ? dp_src[(y + j) * w + (x + i)] : 0;
         }
      }

//    compute the convolution

      int p = 0;

      for (int j = 0; j < 7; ++j) {
         for (int i = 0; i < 7; ++i) {
            p += filter_v1[j][i] * n[j][i];
         }
      }

//    store the result

      dp_dst[y * w + x] = p / 256;
   }
}

// -------------------------------------------------------------------------------------------------

#undef LBOUNDS

#if   defined CUDA_ARCH_300
   #define LBOUNDS __launch_bounds__ (128, 10)   /* max. threads per block, min. blocks per multiprocessor */

#elif defined CUDA_ARCH_200
   #define LBOUNDS __launch_bounds__ (128,  8)   /* max. threads per block, min. blocks per multiprocessor */

#else
   #define LBOUNDS
#endif

LBOUNDS __global__ void gaussian_filter_kernel_v2 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {

// position of the thread in the image

   int const x = pfc::global_thread_idx_x ();
   int const y = pfc::global_thread_idx_y ();

   if (pfc::inside_rect (x, y, w, h)) {   // early exit if the thread is not in the image

//    load my 48 neighbors and myself

      int n [7][7];   // = {}   // initialization costs time

      for (int j = -3; j <= 3; ++j) {
         for (int i = -3; i <= 3; ++i) {
            n[j + 3][i + 3] = pfc::inside_rect (x + i, y + j, w, h) ? dp_src[(y + j) * w + (x + i)] : 0;
         }
      }

//    compute the convolution

      int p = 0;

      for (int j = 0; j < 7; ++j) {
         for (int i = 0; i < 7; ++i) {
            p += filter_v1[j][i] * n[j][i];
         }
      }

//    store the result

      dp_dst[y * w + x] = p / 256;
   }
}

// -------------------------------------------------------------------------------------------------

__global__ void gaussian_filter_kernel_v3 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {
   __shared__ pfc::byte_t adj [10][64];   // allocate static shared memory

// position of the thread in the image

   int const x = pfc::global_thread_idx_x ();
   int const y = pfc::global_thread_idx_y ();

// load adjacent pixels into shared memory

   pfc::byte_t * p_pel = &adj[threadIdx.y][threadIdx.x];

   for (int i = y - 3; i <= blockIdx.y * blockDim.y + 6; i += 4, p_pel += 4 * 64) {
      p_pel[ 0] = pfc::inside_rect (x      - 3, i, w, h) ? dp_src[i * w + (x      - 3)] : 0;
      p_pel[32] = pfc::inside_rect (x + 32 - 3, i, w, h) ? dp_src[i * w + (x + 32 - 3)] : 0;
   }

   __syncthreads ();   // wait for all threads to finish loading

// load my 48 neighbors and myself

   int n [7][7];   // = {}   // initialization costs time

   for (int j = 0; j < 7; ++j) {
      for (int i = 0; i < 7; ++i) {
         n[j][i] = adj[threadIdx.y + j][threadIdx.x + i];
      }
   }

// compute the convolution

   int p = 0;

   for (int j = 0; j < 7; ++j) {
      for (int i = 0; i < 7; ++i) {
         p += filter_v1[j][i] * n[j][i];
      }
   }

// store the result

   if (pfc::inside_rect (x, y, w, h)) dp_dst[y * w + x] = p / 256;
}

// -------------------------------------------------------------------------------------------------

__global__ void gaussian_filter_kernel_v4 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::byte_t const * __restrict__ const dp_src) {
   __shared__ float adj [32][40];   // allocate static shared memory

// position of the thread in the image

   int const x = 1 * (blockIdx.x * blockDim.x) + threadIdx.x;
   int const y = 2 * (blockIdx.y * blockDim.y) + threadIdx.y;

// each thread loads 2 * 4 pixels into a temporary buffer

   int const read_x = blockIdx.x * blockDim.x + 2 * threadIdx.x - 4;   // index of pixel to load (-4 for alignment, should be -3?)

   uchar2 const p0 = pfc::inside_rect (read_x, y -  3, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y -  3) * w + read_x)) : make_uchar2 (0, 0);
   uchar2 const p1 = pfc::inside_rect (read_x, y +  5, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y +  5) * w + read_x)) : make_uchar2 (0, 0);
   uchar2 const p2 = pfc::inside_rect (read_x, y + 13, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y + 13) * w + read_x)) : make_uchar2 (0, 0);
   uchar2 const p3 = pfc::inside_rect (read_x, y + 21, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y + 21) * w + read_x)) : make_uchar2 (0, 0);

// only the first 20 threads of a block load the pixels from the buffers into shared memory

   if (threadIdx.x < 20) {
      reinterpret_cast <float2 *> (adj[threadIdx.y +  0])[threadIdx.x] = make_float2 (p0.x, p0.y);
      reinterpret_cast <float2 *> (adj[threadIdx.y +  8])[threadIdx.x] = make_float2 (p1.x, p1.y);
      reinterpret_cast <float2 *> (adj[threadIdx.y + 16])[threadIdx.x] = make_float2 (p2.x, p2.y);
      reinterpret_cast <float2 *> (adj[threadIdx.y + 24])[threadIdx.x] = make_float2 (p3.x, p3.y);
   }

   __syncthreads ();   // wait for all threads to finish loading

// load my 48 neighbors and myself

   float n [8][7];   // = {}   // initialization costs time

   for (int j = 0; j <= 7; ++j) {
      for (int i = 0; i < 7; ++i) {
         n[j][i] = adj[2 * threadIdx.y + j][threadIdx.x + i];
      }
   }

// compute the convolution

// float p [2] = {};
   float q0    = {};
   float q1    = {};

   for (int j = 0; j < 7; ++j) {
      for (int i = 0; i < 7; ++i) {
         q0 += filter_v1[j][i] * n[j + 0][i];
         q1 += filter_v1[j][i] * n[j + 1][i];
      }
   }

// store the results

   int const write_y = y + threadIdx.y;

   if (pfc::inside_rect (x, write_y + 0, w, h)) dp_dst[(write_y + 0) * w + x] = int (q0) >> 8;
   if (pfc::inside_rect (x, write_y + 1, w, h)) dp_dst[(write_y + 1) * w + x] = int (q1) >> 8;
}

// -------------------------------------------------------------------------------------------------

__global__ void gaussian_filter_kernel_v5 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::byte_t const * __restrict__ const dp_src) {
   __shared__ int adj [16][38];   // allocate static shared memory

// position of the thread in the image

   int const x = pfc::global_thread_idx_x ();
   int const y = pfc::global_thread_idx_y ();

// each thread loads two pixels into a temporary buffer

   int const p0 = pfc::inside_rect (x - 3, y - 3, w, h) ? dp_src[(y - 3) * w + x - 3] : 0;
   int const p1 = pfc::inside_rect (x - 3, y + 5, w, h) ? dp_src[(y + 5) * w + x - 3] : 0;

// load extra pixels per row

   int const p2 = (pfc::inside_rect (x + 29, y - 3, w, h) && threadIdx.x < 6) ? dp_src[(y - 3) * w + x + 29] : 0;
   int const p3 = (pfc::inside_rect (x + 29, y + 5, w, h) && threadIdx.x < 6) ? dp_src[(y + 5) * w + x + 29] : 0;

// load adjacent pixels into shared memory

   adj[threadIdx.y + 0][threadIdx.x] = p0;
   adj[threadIdx.y + 8][threadIdx.x] = p1;

// load extra pixels into shared memory

   if (threadIdx.x < 6) {
      adj[threadIdx.y + 0][threadIdx.x + 32] = p2;
      adj[threadIdx.y + 8][threadIdx.x + 32] = p3;
   }

   __syncthreads ();   // wait for all threads to finish loading

// compute the horizontal convolution

   int n0 [7];   // = {}   // initialization costs time
   int n1 [7];   // = {}   // initialization costs time

   for (int i = 0; i < 7; ++i) {
      n0[i] = adj[threadIdx.y + 0][threadIdx.x + i];
      n1[i] = adj[threadIdx.y + 8][threadIdx.x + i];
   }

// int p [2] = {};
   int q0    = {};
   int q1    = {};

   for (int i = 0; i < 7; ++i) {
      q0 += filter_v1[0][i] * n0[i];
      q1 += filter_v1[0][i] * n1[i];
   }

   __syncthreads ();   // make sure the results are in shared memory

// write the results back to shared memory

   adj[threadIdx.y + 0][threadIdx.x] = q0;
   adj[threadIdx.y + 8][threadIdx.x] = q1;

   __syncthreads ();   // make sure the results are in shared memory

// compute the vertical convolution

   int n [7];   // = {}   // initialization costs time

   for (int i = 0; i < 7; ++i) {
      n[i] = adj[threadIdx.y + i][threadIdx.x];
   }

   int q = 0;

   for (int i = 0; i < 7; ++i) {
      q += filter_v1[i][0] * n[i];
   }

// store the results

   if (pfc::inside_rect (x, y, w, h)) dp_dst[y * w + x] = q >> 8;
}

// -------------------------------------------------------------------------------------------------

__global__ void gaussian_filter_kernel_v6 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::byte_t const * __restrict__ const dp_src) {
   __shared__ int adj [32][40];   // allocate static shared memory

// position of the thread in the image

   int const x = 1 * (blockIdx.x * blockDim.x) + threadIdx.x;
   int const y = 2 * (blockIdx.y * blockDim.y) + threadIdx.y;

// each thread loads 2 * 4 pixels into a temporary buffer

   int const read_x = blockIdx.x * blockDim.x + 2 * threadIdx.x - 4;   // index of pixel to load (-4 for alignment, should be -3?)

   uchar2 const p0 = pfc::inside_rect (read_x, y -  3, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y -  3) * w + read_x)) : make_uchar2 (0, 0);
   uchar2 const p1 = pfc::inside_rect (read_x, y +  5, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y +  5) * w + read_x)) : make_uchar2 (0, 0);
   uchar2 const p2 = pfc::inside_rect (read_x, y + 13, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y + 13) * w + read_x)) : make_uchar2 (0, 0);
   uchar2 const p3 = pfc::inside_rect (read_x, y + 21, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y + 21) * w + read_x)) : make_uchar2 (0, 0);

// only the first 20 threads of a block load the pixels from the buffers into shared memory

   if (threadIdx.x < 20) {
      reinterpret_cast <int2 *> (adj[threadIdx.y +  0])[threadIdx.x] = make_int2 (p0.x, p0.y);
      reinterpret_cast <int2 *> (adj[threadIdx.y +  8])[threadIdx.x] = make_int2 (p1.x, p1.y);
      reinterpret_cast <int2 *> (adj[threadIdx.y + 16])[threadIdx.x] = make_int2 (p2.x, p2.y);
      reinterpret_cast <int2 *> (adj[threadIdx.y + 24])[threadIdx.x] = make_int2 (p3.x, p3.y);
   }

   __syncthreads ();   // wait for all threads to finish loading

// compute the horizontal convolution

   int n0 [7];   // = {}   // initialization costs time
   int n1 [7];   // = {}   // initialization costs time
   int n2 [7];   // = {}   // initialization costs time
   int n3 [7];   // = {}   // initialization costs time

   for (int i = 0; i < 7; ++i) {
      n0[i] = adj[threadIdx.y +  0][threadIdx.x + i + 1];   // +1 because of alignment constraints when loading pixels
      n1[i] = adj[threadIdx.y +  8][threadIdx.x + i + 1];   //
      n2[i] = adj[threadIdx.y + 16][threadIdx.x + i + 1];   //
      n3[i] = adj[threadIdx.y + 24][threadIdx.x + i + 1];   //
   }

   int p [4] = {};

   for (int i = 0; i < 7; ++i) {
      p[0] += filter_v1[0][i] * n0[i];
      p[1] += filter_v1[0][i] * n1[i];
      p[2] += filter_v1[0][i] * n2[i];
      p[3] += filter_v1[0][i] * n3[i];
   }

   __syncthreads ();   // make sure the results are in shared memory

// write the results back to shared memory

   adj[threadIdx.y +  0][threadIdx.x] = p[0];
   adj[threadIdx.y +  8][threadIdx.x] = p[1];
   adj[threadIdx.y + 16][threadIdx.x] = p[2];
   adj[threadIdx.y + 24][threadIdx.x] = p[3];

   __syncthreads ();   // make sure the results are in shared memory

// compute the vertical convolution

   int n [8];   // = {}   // initialization costs time

   for (int i = 0; i <= 7; ++i) {
      n[i] = adj[2 * threadIdx.y + i][threadIdx.x];
   }

// int q [2] = {};
   int q0    = {};
   int q1    = {};

   for (int i = 0; i < 7; ++i) {
      q0 += filter_v1[i][0] * n[i + 0];
      q1 += filter_v1[i][0] * n[i + 1];
   }

// store the results

   int const write_y = y + threadIdx.y;

   if (pfc::inside_rect (x, write_y + 0, w, h)) dp_dst[(write_y + 0) * w + x] = q0 >> 8;
   if (pfc::inside_rect (x, write_y + 1, w, h)) dp_dst[(write_y + 1) * w + x] = q1 >> 8;
}

// -------------------------------------------------------------------------------------------------

__constant__ float const filter_v2 [7] = {
   1, 2, 3, 4, 3, 2, 1
};

__global__ void gaussian_filter_kernel_v7 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::byte_t const * __restrict__ const dp_src) {
   __shared__ float adj [32][40];   // allocate static shared memory

// position of the thread in the image

   int const x = 1 * (blockIdx.x * blockDim.x) + threadIdx.x;
   int const y = 2 * (blockIdx.y * blockDim.y) + threadIdx.y;

// each thread loads 2 * 4 pixels into a temporary buffer

   int const read_x = blockIdx.x * blockDim.x + 2 * threadIdx.x - 4;   // index of pixel to load (-4 for alignment, should be -3?)

   uchar2 const p0 = pfc::inside_rect (read_x, y -  3, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y -  3) * w + read_x)) : make_uchar2 (0, 0);
   uchar2 const p1 = pfc::inside_rect (read_x, y +  5, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y +  5) * w + read_x)) : make_uchar2 (0, 0);
   uchar2 const p2 = pfc::inside_rect (read_x, y + 13, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y + 13) * w + read_x)) : make_uchar2 (0, 0);
   uchar2 const p3 = pfc::inside_rect (read_x, y + 21, w, h) ? *reinterpret_cast <uchar2 const *> (dp_src + ((y + 21) * w + read_x)) : make_uchar2 (0, 0);

// only the first 20 threads of a block load the pixels from the buffers into shared memory

   if (threadIdx.x < 20) {
      reinterpret_cast <float2 *> (adj[threadIdx.y +  0])[threadIdx.x] = make_float2 (p0.x, p0.y);
      reinterpret_cast <float2 *> (adj[threadIdx.y +  8])[threadIdx.x] = make_float2 (p1.x, p1.y);
      reinterpret_cast <float2 *> (adj[threadIdx.y + 16])[threadIdx.x] = make_float2 (p2.x, p2.y);
      reinterpret_cast <float2 *> (adj[threadIdx.y + 24])[threadIdx.x] = make_float2 (p3.x, p3.y);
   }

   __syncthreads ();   // wait for all threads to finish loading

// compute the horizontal convolution

   float n0 [7];   // = {}   // initialization costs time
   float n1 [7];   // = {}   // initialization costs time
   float n2 [7];   // = {}   // initialization costs time
   float n3 [7];   // = {}   // initialization costs time

   for (int i = 0; i < 7; ++i) {
      n0[i] = adj[threadIdx.y +  0][threadIdx.x + i + 1];   // +1 because of alignment constraints when loading pixels
      n1[i] = adj[threadIdx.y +  8][threadIdx.x + i + 1];   //
      n2[i] = adj[threadIdx.y + 16][threadIdx.x + i + 1];   //
      n3[i] = adj[threadIdx.y + 24][threadIdx.x + i + 1];   //
   }

   float p [4] = {};

   for (int i = 0; i < 7; ++i) {
      p[0] += filter_v2[i] * n0[i];
      p[1] += filter_v2[i] * n1[i];
      p[2] += filter_v2[i] * n2[i];
      p[3] += filter_v2[i] * n3[i];
   }

   __syncthreads ();   // make sure the results are in shared memory

// write the results back to shared memory

   adj[threadIdx.y +  0][threadIdx.x] = p[0];
   adj[threadIdx.y +  8][threadIdx.x] = p[1];
   adj[threadIdx.y + 16][threadIdx.x] = p[2];
   adj[threadIdx.y + 24][threadIdx.x] = p[3];

   __syncthreads ();   // make sure the results are in shared memory

// compute the vertical convolution

   float n [8];   // = {}   // initialization costs time

   for (int i = 0; i <= 7; ++i) {
      n[i] = adj[2 * threadIdx.y + i][threadIdx.x];
   }

// float q [2] = {};
   float q0    = {};
   float q1    = {};

   for (int i = 0; i < 7; ++i) {
      q0 += filter_v2[i] * n[i + 0];
      q1 += filter_v2[i] * n[i + 1];
   }

// store the results

   int const write_y = y + threadIdx.y;

   if (pfc::inside_rect (x, write_y + 0, w, h)) dp_dst[(write_y + 0) * w + x] = int (q0) >> 8;
   if (pfc::inside_rect (x, write_y + 1, w, h)) dp_dst[(write_y + 1) * w + x] = int (q1) >> 8;
}

// -------------------------------------------------------------------------------------------------

void gaussian_filter_kernel_v1_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {
   PFC_CUDA_CHECK (cudaFuncSetCacheConfig (gaussian_filter_kernel_v1, cudaFuncCachePreferL1));

   gaussian_filter_kernel_v1
      <<<pfc::grid_size (pfc::config::block_size_blur ()), pfc::config::block_size_blur ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());
}

void gaussian_filter_kernel_v2_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {
   PFC_CUDA_CHECK (cudaFuncSetCacheConfig (gaussian_filter_kernel_v2, cudaFuncCachePreferL1));

   gaussian_filter_kernel_v2
      <<<pfc::grid_size (pfc::config::block_size_blur ()), pfc::config::block_size_blur ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());
}

void gaussian_filter_kernel_v3_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {
   PFC_CUDA_CHECK (cudaFuncSetCacheConfig (gaussian_filter_kernel_v3, cudaFuncCachePreferShared));

   gaussian_filter_kernel_v3
      <<<pfc::grid_size (pfc::config::block_size_blur ()), pfc::config::block_size_blur ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());
}

void gaussian_filter_kernel_v4_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * __restrict__ const dp_src) {
   auto const tmp      = pfc::grid_size (pfc::config::block_size_blur ());
   auto const grid_dim = dim3 (tmp.x, tmp.y / 2);

   PFC_CUDA_CHECK (cudaFuncSetCacheConfig (gaussian_filter_kernel_v4, cudaFuncCachePreferShared));

   gaussian_filter_kernel_v4
      <<<grid_dim, pfc::config::block_size_blur ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());
}

void gaussian_filter_kernel_v5_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * __restrict__ const dp_src) {
   PFC_CUDA_CHECK (cudaFuncSetCacheConfig (gaussian_filter_kernel_v5, cudaFuncCachePreferShared));

   gaussian_filter_kernel_v5
      <<<pfc::grid_size (pfc::config::block_size_blur ()), pfc::config::block_size_blur ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());
}

void gaussian_filter_kernel_v6_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * __restrict__ const dp_src) {
   PFC_CUDA_CHECK (cudaFuncSetCacheConfig     (gaussian_filter_kernel_v6, cudaFuncCachePreferShared));
   PFC_CUDA_CHECK (cudaFuncSetSharedMemConfig (gaussian_filter_kernel_v6, cudaSharedMemBankSizeDefault));

   if (pfc::config::code_version ().is (9)) {
      PFC_CUDA_CHECK (cudaFuncSetSharedMemConfig (gaussian_filter_kernel_v6, cudaSharedMemBankSizeEightByte));
   };

   auto const tmp      = pfc::grid_size (pfc::config::block_size_blur ());
   auto const grid_dim = dim3 (tmp.x, tmp.y / 2);

   gaussian_filter_kernel_v6
      <<<grid_dim, pfc::config::block_size_blur ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());
}

void gaussian_filter_kernel_v7_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * __restrict__ const dp_src) {
   PFC_CUDA_CHECK (cudaFuncSetCacheConfig     (gaussian_filter_kernel_v7, cudaFuncCachePreferShared));
   PFC_CUDA_CHECK (cudaFuncSetSharedMemConfig (gaussian_filter_kernel_v7, cudaSharedMemBankSizeEightByte));

   auto const tmp      = pfc::grid_size (pfc::config::block_size_blur ());
   auto const grid_dim = dim3 (tmp.x, tmp.y / 2);

   gaussian_filter_kernel_v7
      <<<grid_dim, pfc::config::block_size_blur ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());

   PFC_CUDA_CHECK (cudaFuncSetSharedMemConfig (gaussian_filter_kernel_v7, cudaSharedMemBankSizeDefault));
}
