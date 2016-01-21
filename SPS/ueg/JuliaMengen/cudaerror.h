//       $Id: snippet-1.h 26270 2014-10-23 08:25:40Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/HelloWorld/src/snippet-1.h $
// $Revision: 26270 $
//     $Date: 2014-10-23 10:25:40 +0200 (Do., 23 Okt 2014) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $
//
//   Remarks: CUDA Error Handling
//     Types: pfc::cuda_exception
// Functions: pfc::check

#ifndef CUDAERROR_H
#define CUDAERROR_H


#if defined __CUDACC__   /* NVIDIA CUDA compiler */
#define CUDA_ATTR_HOST_DEVICE __host__ __device__
#else
#define CUDA_ATTR_HOST_DEVICE
#endif

#include <cuda_runtime.h>
#include <stdexcept>

namespace pfc {

class cuda_exception : public std::runtime_error {
   typedef std::runtime_error inherited;

   public:
      explicit cuda_exception (cudaError const error) : inherited (cudaGetErrorString (error)) {
      }
};

inline void check(cudaError const error) {
   if (error != cudaSuccess) {
      throw pfc::cuda_exception (error);
   }
}

}   // namespace pfc

#endif