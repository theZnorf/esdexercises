//       $Id: pfc_windows.h 30177 2015-12-23 19:21:30Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/NearestNeighborSearch/src/pfc_windows.h $
// $Revision: 30177 $
//     $Date: 2015-12-23 20:21:30 +0100 (Mi., 23 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_WINDOWS_H
#define      PFC_WINDOWS_H

// -------------------------------------------------------------------------------------------------

#undef  NOMINMAX
#define NOMINMAX

#undef  STRICT
#define STRICT

#undef  VC_EXTRALEAN
#define VC_EXTRALEAN

#undef  WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN

#include <windows.h>

#undef  PFC_WINDOWS_H_INCLUDED
#define PFC_WINDOWS_H_INCLUDED

// -------------------------------------------------------------------------------------------------

#endif   // PFC_WINDOWS_H
