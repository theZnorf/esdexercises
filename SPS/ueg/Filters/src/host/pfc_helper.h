//       $Id: pfc_helper.h 30314 2016-01-03 15:42:34Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_helper.h $
// $Revision: 30314 $
//     $Date: 2016-01-03 16:42:34 +0100 (So., 03 Jän 2016) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_HELPER_H
#define      PFC_HELPER_H

#include "./pfc_config.h"
#include "./pfc_opengl_exception.h"
#include "./pfc_cuda_device_info.h"
#include "./pfc_cuda_timer.h"

#include <cassert>
#include <cstdint>
#include <iostream>
#include <memory>

namespace pfc {

// -------------------------------------------------------------------------------------------------

using byte_t   = std::uint8_t;
using pixel3_t = uchar3;
using pixel4_t = uchar4;
using pixel_t  = pfc::pixel4_t;

// -------------------------------------------------------------------------------------------------

CATTR_FINLINE int ceil_div (int const a, int const b) {
   assert ((a >= 0) && (b > 0)); return (a + b - 1) / b;
}

CATTR_HOST_DEV_INL int global_thread_idx_x () {
   #if defined COMP_NVCC
      return blockIdx.x * blockDim.x + threadIdx.x;
   #else
      return 0;
   #endif
}

CATTR_HOST_DEV_INL int global_thread_idx_y () {
   #if defined COMP_NVCC
      return blockIdx.y * blockDim.y + threadIdx.y;
   #else
      return 0;
   #endif
}

template <typename T> CATTR_HOST_DEV_INL T const & min (T const & a, T const & b) {
   return (a < b) ? a : b;
}

CATTR_HOST_DEV_INL pfc::byte_t gray_value (float const r, float const g, float const b) {
   return pfc::byte_t (pfc::min (255, int (.299f * r + .587f * g + .114f * b)));
}

inline dim3 grid_size (dim3 const & block_size) {
   return dim3 (pfc::ceil_div (PFC_CONFIG.img_w, block_size.x),
                pfc::ceil_div (PFC_CONFIG.img_h, block_size.y)
   );
}

inline dim3 grid_size (dim3 const & block_size, dim3 const & size) {
   return dim3 (pfc::ceil_div (size.x, block_size.x),
                pfc::ceil_div (size.y, block_size.y),
                pfc::ceil_div (size.z, block_size.z)
   );
}

inline dim3 grid_size (dim3 const & block_size, int const x_size, int const y_size = 1, int const z_size = 1) {
   return dim3 (pfc::ceil_div (x_size, block_size.x),
                pfc::ceil_div (y_size, block_size.y),
                pfc::ceil_div (z_size, block_size.z)
   );
}

CATTR_HOST_DEV_INL int inside_rect (int const x, int const y, int const x_size, int const y_size) {
   return (x >= 0) && (x < x_size) && (y >= 0) && (y < y_size);
}

// -------------------------------------------------------------------------------------------------

inline pfc::pixel_t * copy_rgb_to_rgba (pfc::pixel_t * p_dst, pfc::byte_t const * p_src, int const size) {
   for (int i = 0 ; i < size; ++i) {
      *p_dst++ = make_uchar4 (*p_src++, *p_src++, *p_src++, 0);   // !pwk: order of evaluation matters here
   }

   return p_dst;
}

inline std::string to_string (dim3 const & block_size) {
   std::string str;

   str += std::to_string (block_size.x);
   str += " x ";
   str += std::to_string (block_size.y);
   str += " x ";
   str += std::to_string (block_size.z);

   return str;
}

inline std::string to_string (int const block_size [3]) {
   std::string str;

   str += std::to_string (block_size[0]);
   str += " x ";
   str += std::to_string (block_size[1]);
   str += " x ";
   str += std::to_string (block_size[2]);

   return str;
}

template <typename T> inline std::unique_ptr <T> & copy_rgb_to_rgba (std::unique_ptr <T> & p_dst, pfc::byte_t const * p_src, int const size) {
   pfc::copy_rgb_to_rgba (p_dst.get (), p_src, size); return p_dst;
}

// -------------------------------------------------------------------------------------------------

inline pfc::byte_t * to_p_byte_t (pfc::pixel_t * const p) {
   return reinterpret_cast <pfc::byte_t *> (p);
}

inline pfc::byte_t const * to_p_byte_t (pfc::pixel_t const * const p) {
   return reinterpret_cast <pfc::byte_t const *> (p);
}

inline pfc::pixel_t * to_p_pixel_t (pfc::byte_t * const p) {
   return reinterpret_cast <pfc::pixel_t *> (p);
}

inline pfc::pixel_t const * to_p_pixel_t (pfc::byte_t const * const p) {
   return reinterpret_cast <pfc::pixel_t const *> (p);
}

template <typename T> inline void * * to_pp_void (T * * const p) {
   return reinterpret_cast <void * *> (p);
}

// -------------------------------------------------------------------------------------------------

}   // namespace pfc

#endif   // PFC_HELPER_H
