//       $Id: pfc_cuda_exception.h 30179 2015-12-24 08:22:50Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_cuda_exception.h $
// $Revision: 30179 $
//     $Date: 2015-12-24 09:22:50 +0100 (Do., 24 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_CUDA_EXCEPTION_H
#define      PFC_CUDA_EXCEPTION_H

#include "./pfc_cuda_macros.h"

#include <stdexcept>
#include <string>

// -------------------------------------------------------------------------------------------------

#undef  PFC_CUDA_CHECK
#define PFC_CUDA_CHECK(call) \
   pfc::cuda::check (call, __FILE__, __LINE__)

// -------------------------------------------------------------------------------------------------

namespace pfc { namespace cuda {

class exception : public std::runtime_error {
   using inherited = std::runtime_error;

   public:
      explicit exception (cudaError const error, std::string const & file, int const line) : inherited (make_message (error, file, line)) {
      }

   private:
      static std::string make_message (cudaError const error, std::string const & file, int const line) {
         std::string message = "CUDA error #";

         message += std::to_string (error);
         message += " '";
         message += cudaGetErrorString (error);
         message += "' occurred";

         if (!file.empty () && (line > 0)) {
            message += " in file '";
            message += file;
            message += "' on line ";
            message += std::to_string (line);
         }

         return std::move (message);
      }
};

// -------------------------------------------------------------------------------------------------

inline void check (cudaError const error, std::string const & file, int const line) {
   if (error != cudaSuccess) {
      throw pfc::cuda::exception (error, file, line);
   }
}

inline void check (cudaError const error) {
   pfc::cuda::check (error, "", 0);
}

// -------------------------------------------------------------------------------------------------

} }   // namespace cuda, namespace pfc

#endif   // PFC_CUDA_EXCEPTION_H
