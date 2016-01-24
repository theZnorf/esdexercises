//       $Id: pfc_cuda_macros.h 30201 2015-12-25 17:37:20Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_cuda_macros.h $
// $Revision: 30201 $
//     $Date: 2015-12-25 18:37:20 +0100 (Fr., 25 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $
//
// macros defined by host_defines.h
// --------------------------------
// CUDARTAPI, NV_CLANG_ATOMIC_NOEXCEPT, __align__, __annotate__, __builtin_align__, __constant__, __cudart_builtin__,
// __device__, __device_builtin__, __device_builtin_surface_type__, __device_builtin_texture_type__, __export__,
// __forceinline__, __global__, __host__, __import__, __inline__, __launch_bounds__, __location__, __managed__,
// __no_return__, __noinline__, __restrict__, __shared__, __specialization_static, __thread__, __volatile__

#if !defined PFC_CUDA_MACROS_H
#define      PFC_CUDA_MACROS_H

#include <cuda_runtime.h>
#include <device_launch_parameters.h>

// -------------------------------------------------------------------------------------------------

#undef COMP_CL
#undef COMP_GCC
#undef COMP_NVCC

#undef CARCH
#undef CARCH_100
#undef CARCH_110
#undef CARCH_120
#undef CARCH_130
#undef CARCH_200
#undef CARCH_210
#undef CARCH_300
#undef CARCH_320
#undef CARCH_350
#undef CARCH_500
#undef CARCH_520

#undef CATTR_CONST
#undef CATTR_DEV_CONST
#undef CATTR_DEVICE
#undef CATTR_FINLINE
#undef CATTR_GLOBAL
#undef CATTR_HOST
#undef CATTR_HOST_DEV
#undef CATTR_HOST_DEV_INL
#undef CATTR_KERNEL
#undef CATTR_LBOUNDS
#undef CATTR_RESTRICT
#undef CATTR_SHARED

// -------------------------------------------------------------------------------------------------

#if defined _MSC_VER
   #define COMP_CL
#endif

#if defined __GNUC__
   #define COMP_GCC
#endif

#if defined __CUDACC__
   #define COMP_NVCC
#endif

// -------------------------------------------------------------------------------------------------

#if defined __CARCH__
   #define CARCH

   #if   __CARCH__ >= 530
      #define CARCH_530

   #elif __CARCH__ >= 520
      #define CARCH_520

   #elif __CARCH__ >= 500
      #define CARCH_500

   #elif __CARCH__ >= 370
      #define CARCH_370

   #elif __CARCH__ >= 350
      #define CARCH_350

   #elif __CARCH__ >= 320
      #define CARCH_320

   #elif __CARCH__ >= 300
      #define CARCH_300

   #elif __CARCH__ >= 210
      #define CARCH_210

   #elif __CARCH__ >= 200
      #define CARCH_200

   #elif __CARCH__ >= 130
      #define CARCH_130

   #elif __CARCH__ >= 120
      #define CARCH_120

   #elif __CARCH__ >= 110
      #define CARCH_110

   #elif __CARCH__ >= 100
      #define CARCH_100

   #endif
#endif

// -------------------------------------------------------------------------------------------------

#if defined COMP_NVCC && defined __constant__
   #define CATTR_CONST __constant__
#else
   #define CATTR_CONST
#endif

#if defined COMP_NVCC && defined __device__
   #define CATTR_DEVICE __device__
#else
   #define CATTR_DEVICE
#endif

#if defined COMP_NVCC && defined __forceinline__
   #define CATTR_FINLINE __forceinline__
#else
   #define CATTR_FINLINE inline
#endif

#if defined COMP_NVCC && defined __global__
   #define CATTR_GLOBAL __global__
#else
   #define CATTR_GLOBAL
#endif

#if defined COMP_NVCC && defined __host__
   #define CATTR_HOST __host__
#else
   #define CATTR_HOST
#endif

#if defined COMP_NVCC && defined __launch_bounds__
   #define CATTR_LBOUNDS(tpb, bpm) __launch_bounds__ (tpb, bpm)   /* tpb ... max. threads per block         */
#else                                                             /* bpm ... min. blocks per multiprocessor */
   #define CATTR_LBOUNDS(tpb, bpm)
#endif

#if defined COMP_NVCC && defined __restrict__
   #define CATTR_RESTRICT __restrict__
#else
   #define CATTR_RESTRICT __restrict
#endif

#if defined COMP_NVCC && defined __shared__
   #define CATTR_SHARED __shared__
#else
   #define CATTR_SHARED
#endif

// -------------------------------------------------------------------------------------------------

#define CATTR_DEV_CONST    CATTR_DEVICE CATTR_CONST
#define CATTR_HOST_DEV     CATTR_HOST CATTR_DEVICE
#define CATTR_HOST_DEV_INL CATTR_HOST CATTR_DEVICE CATTR_FINLINE
#define CATTR_KERNEL       CATTR_GLOBAL

// -------------------------------------------------------------------------------------------------

#endif   // PFC_CUDA_MACROS_H
