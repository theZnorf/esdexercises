//       $Id: pfc_cuda_memory.h 30177 2015-12-23 19:21:30Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/NearestNeighborSearch/src/pfc_cuda_memory.h $
// $Revision: 30177 $
//     $Date: 2015-12-23 20:21:30 +0100 (Mi., 23 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_CUDA_MEMORY_H
#define      PFC_CUDA_MEMORY_H

#include "./pfc_cuda_exception.h"

#include <memory>

// -------------------------------------------------------------------------------------------------

#undef  PFC_CUDA_FREE
#define PFC_CUDA_FREE(dp_memory) \
   pfc::cuda::free (dp_memory, __FILE__, __LINE__)

#undef  PFC_CUDA_MALLOC
#define PFC_CUDA_MALLOC(T, size) \
   pfc::cuda::malloc <T> (size, __FILE__, __LINE__)

#undef  PFC_CUDA_MEMCPY
#define PFC_CUDA_MEMCPY(p_dst, p_src, size, kind) \
   pfc::cuda::memcpy (p_dst, p_src, size, kind, __FILE__, __LINE__)

// -------------------------------------------------------------------------------------------------

namespace pfc { namespace cuda {

template <typename T> inline T * & free (T * & dp_memory, std::string const & file = "", int const line = 0) {
   if (dp_memory != nullptr) {
      pfc::cuda::check (cudaFree (dp_memory), file, line); dp_memory = nullptr;
   }

   return dp_memory;
}

template <typename T> inline T * free (T * && dp_memory, std::string const & file = "", int const line = 0) {
   return pfc::cuda::free (dp_memory, file, line);
}

template <typename T> inline T * malloc (int const size, std::string const & file = "", int const line = 0) {
   T * dp_memory = nullptr;

   if (size > 0) {
      pfc::cuda::check (cudaMalloc (&dp_memory, size * sizeof (T)), file, line);
   }

   return dp_memory;
}

template <typename T> inline T * memcpy (T * const p_dst, T const * const p_src, int const size, cudaMemcpyKind const kind, std::string const & file = "", int const line = 0) {
   if ((p_dst != nullptr) && (p_src != nullptr) && (size > 0)) {
      pfc::cuda::check (cudaMemcpy (p_dst, p_src, size * sizeof (T), kind), file, line);
   }

   return p_dst;
}

template <typename T, typename U> inline T * memcpy (T * const p_dst, std::unique_ptr <U> const & p_src, int const size, cudaMemcpyKind const kind, std::string const & file = "", int const line = 0) {
   return pfc::cuda::memcpy (p_dst, p_src.get (), size, kind, file, line);
}

} }   // namespace cuda, namespace pfc

// -------------------------------------------------------------------------------------------------

#endif   // PFC_CUDA_MEMORY_H
