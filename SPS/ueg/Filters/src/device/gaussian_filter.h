//       $Id: gaussian_filter.h 30308 2016-01-03 11:21:14Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/device/gaussian_filter.h $
// $Revision: 30308 $
//     $Date: 2016-01-03 12:21:14 +0100 (So., 03 Jän 2016) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined GAUSSIAN_FILTER_H
#define      GAUSSIAN_FILTER_H

#include "../host/pfc_helper.h"

void gaussian_filter_kernel_v1_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src);
void gaussian_filter_kernel_v2_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src);
void gaussian_filter_kernel_v3_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src);
void gaussian_filter_kernel_v4_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * CATTR_RESTRICT const dp_src);
void gaussian_filter_kernel_v5_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * CATTR_RESTRICT const dp_src);
void gaussian_filter_kernel_v6_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * CATTR_RESTRICT const dp_src);
void gaussian_filter_kernel_v7_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * CATTR_RESTRICT const dp_src);

#endif   // GAUSSIAN_FILTER_H
