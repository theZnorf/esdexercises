//       $Id: sobel_filter.cu 30314 2016-01-03 15:42:34Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/device/sobel_filter.cu $
// $Revision: 30314 $
//     $Date: 2016-01-03 16:42:34 +0100 (So., 03 Jän 2016) $
//   Creator: Ch. Angerer, NVIDIA, J. Demouth, NVIDIA, peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#include "./sobel_filter.h"

// -------------------------------------------------------------------------------------------------

namespace {
   __constant__ int const filter_v1_x [3][3] = {
      {-1,  0,  1},
      {-2,  0,  2},
      {-1,  0,  1}
   };

   __constant__ int const filter_v1_y [3][3] = {
      { 1,  2,  1},
      { 0,  0,  0},
      {-1, -2, -1}
   };
}

__global__ void sobel_filter_kernel_v1 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {

// position of the thread in the image

   int const x = pfc::global_thread_idx_x ();
   int const y = pfc::global_thread_idx_y ();

   if (pfc::inside_rect (x, y, w, h)) {   // early exit if the thread is not in the image

//    load my eight neighbors and myself

      int n [3][3];   // = {}   // initialization costs time

      for (int j = -1; j <= 1 ; ++j) {
         for (int i = -1; i <= 1; ++i) {
            n[j + 1][i + 1] = pfc::inside_rect (x + i, y + j, w, h) ? dp_src[(y + j) * w + (x + i)] : 0;
         }
      }

//    compute the convolution

      int gx = 0;
      int gy = 0;

      for (int j = 0; j < 3; ++j) {
         for (int i = 0; i < 3; ++i) {
            gx += filter_v1_x [j][i] * n[j][i];
            gy += filter_v1_y [j][i] * n[j][i];
         }
      }

//    compute the gradient and store the result

      dp_dst[y * w + x] = pfc::min (255.0f, sqrtf (gx * gx + gy * gy));
   }
}

// -------------------------------------------------------------------------------------------------

namespace {
   __constant__ float const filter_v2_x [3][3] = {
      {-1,  0,  1},
      {-2,  0,  2},
      {-1,  0,  1}
   };

   __constant__ float const filter_v2_y [3][3] = {
      { 1,  2,  1},
      { 0,  0,  0},
      {-1, -2, -1}
   };
}

__global__ void sobel_filter_kernel_v2 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {

// position of the thread in the image

   int const x = pfc::global_thread_idx_x ();
   int const y = pfc::global_thread_idx_y ();

   if (pfc::inside_rect (x, y, w, h)) {   // early exit if the thread is not in the image

//    load my eight neighbors and myself

      float n [3][3];   // = {}   // initialization costs time

      for (int j = -1; j <= 1 ; ++j) {
         for (int i = -1; i <= 1; ++i) {
            n[j + 1][i + 1] = pfc::inside_rect (x + i, y + j, w, h) ? dp_src[(y + j) * w + (x + i)] : 0;
         }
      }

//    compute the convolution

      float gx = 0;
      float gy = 0;

      for (int j = 0; j < 3; ++j) {
         for (int i = 0; i < 3; ++i) {
            gx = __fmaf_rd (filter_v2_x[j][i], n[j][i], gx);
            gy = __fmaf_rd (filter_v2_y[j][i], n[j][i], gy);
         }
      }

//    compute the gradient and store the result

      dp_dst[y * w + x] = pfc::min (255.0f, __fsqrt_rn (gx * gx + gy * gy));
   }
}

// -------------------------------------------------------------------------------------------------

void sobel_filter_kernel_v1_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {
   sobel_filter_kernel_v1
      <<<pfc::grid_size (pfc::config::block_size_sobel ()), pfc::config::block_size_sobel ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());
}

void sobel_filter_kernel_v2_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {
   sobel_filter_kernel_v2
      <<<pfc::grid_size (pfc::config::block_size_sobel ()), pfc::config::block_size_sobel ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());
}
