//       $Id: rgba_to_gray.cu 30314 2016-01-03 15:42:34Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/device/rgba_to_gray.cu $
// $Revision: 30314 $
//     $Date: 2016-01-03 16:42:34 +0100 (So., 03 Jän 2016) $
//   Creator: Ch. Angerer, NVIDIA, J. Demouth, NVIDIA, peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#include "./rgba_to_gray.h"

// -------------------------------------------------------------------------------------------------

__global__ void rgba_to_gray_kernel_v1 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::pixel_t const * const dp_src) {

// position of the thread in the image

   int const x = pfc::global_thread_idx_x ();
   int const y = pfc::global_thread_idx_y ();

   if (pfc::inside_rect (x, y, w, h)) {   // early exit if the thread is not in the image

//    load the pixel in RGBA format

      pfc::pixel_t const p = dp_src[y * w + x];

//    extract the three components in FP32

      float const r = p.x;
      float const g = p.y;
      float const b = p.z;

//    compute the gray value store the result

      dp_dst[y * w + x] = pfc::gray_value (r, g, b);   // make_uchar4 (gray, gray, gray, 0)
   }
}

// -------------------------------------------------------------------------------------------------

__global__ void rgba_to_gray_kernel_v2 (int const w, int const h, pfc::byte_t * const dp_dst, pfc::pixel_t const * const dp_src) {

// position of the thread in the image, compute two pixels at the same time

   int const x =     pfc::global_thread_idx_x ();
   int const y = 2 * pfc::global_thread_idx_y ();

// load the pixels in RGBA format

   pfc::pixel_t const p0 = pfc::inside_rect (x, y, w, h) ? dp_src[(y + 0) * w + x] : make_uchar4 (0, 0, 0, 0);
   pfc::pixel_t const p1 = pfc::inside_rect (x, y, w, h) ? dp_src[(y + 1) * w + x] : make_uchar4 (0, 0, 0, 0);

// extract the three components in FP32

   float const r0 = p0.x;
   float const g0 = p0.y;
   float const b0 = p0.z;

   float const r1 = p1.x;
   float const g1 = p1.y;
   float const b1 = p1.z;

// compute the gray values and store the results

   if (pfc::inside_rect (x, y + 0, w, h)) dp_dst[(y + 0) * w + x] = pfc::gray_value (r0, g0, b0);
   if (pfc::inside_rect (x, y + 1, w, h)) dp_dst[(y + 1) * w + x] = pfc::gray_value (r1, g1, b1);
}

// -------------------------------------------------------------------------------------------------

void rgba_to_gray_kernel_v1_wrapper (pfc::byte_t * const dp_dst, pfc::pixel_t const * const dp_src) {
   rgba_to_gray_kernel_v1
      <<<pfc::grid_size (pfc::config::block_size_gray ()), pfc::config::block_size_gray ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());
}

void rgba_to_gray_kernel_v2_wrapper (pfc::byte_t * const dp_dst, pfc::pixel_t const * const dp_src) {
   rgba_to_gray_kernel_v2
      <<<pfc::grid_size (pfc::config::block_size_gray ()), pfc::config::block_size_gray ()>>>
      (PFC_CONFIG.img_w, PFC_CONFIG.img_h, dp_dst, dp_src);

   PFC_CUDA_CHECK (cudaGetLastError ());
}
