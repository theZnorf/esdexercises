//       $Id: pfc_filters.h 30276 2015-12-31 15:46:29Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_filters.h $
// $Revision: 30276 $
//     $Date: 2015-12-31 16:46:29 +0100 (Do., 31 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_FILTERS_H
#define      PFC_FILTERS_H

#include "./pfc_helper.h"

namespace pfc {

void           cleanup        ();
pfc::pixel_t * cuda_calculate (pfc::pixel_t * const dp_dst);

}   // namespace pfc

#endif   // PFC_FILTERS_H
