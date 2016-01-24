//       $Id: rgba_to_gray.h 30180 2015-12-24 10:44:08Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/device/rgba_to_gray.h $
// $Revision: 30180 $
//     $Date: 2015-12-24 11:44:08 +0100 (Do., 24 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined RGBA_TO_GRAY_H
#define      RGBA_TO_GRAY_H

#include "../host/pfc_helper.h"

void rgba_to_gray_kernel_v1_wrapper (pfc::byte_t * const dp_dst, pfc::pixel_t const * const dp_src);
void rgba_to_gray_kernel_v2_wrapper (pfc::byte_t * const dp_dst, pfc::pixel_t const * const dp_src);

#endif   // RGBA_TO_GRAY_H
