//       $Id: sobel_filter.h 30180 2015-12-24 10:44:08Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/device/sobel_filter.h $
// $Revision: 30180 $
//     $Date: 2015-12-24 11:44:08 +0100 (Do., 24 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined SOBEL_FILTER_H
#define      SOBEL_FILTER_H

#include "../host/pfc_helper.h"

void sobel_filter_kernel_v1_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src);
void sobel_filter_kernel_v2_wrapper (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src);

#endif   // SOBEL_FILTER_H
