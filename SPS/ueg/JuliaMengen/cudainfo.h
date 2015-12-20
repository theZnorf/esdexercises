//       $Id: snippet-2.h 26270 2014-10-23 08:25:40Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/HelloWorld/src/snippet-2.h $
// $Revision: 26270 $
//     $Date: 2014-10-23 10:25:40 +0200 (Do., 23 Okt 2014) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $
//
//   Remarks: Infos about CUDA devices and Streaming Multiprocessors (SM/SMX/SMM).
//     Types: pfc::sm_info_t
// Functions: pfc::compute_mode_as_string, pfc::query_sm_info, pfc::version_to_string

#ifndef CUDAINFO_H
#define CUDAINFO_H

#include <string>
#include <array>
#include <cuda_runtime.h>

namespace pfc {

struct sm_info_t {
   sm_info_t (std::size_t const major, std::size_t const minor, std::string const & generation, std::string const & architecture, std::string const & processor, std::size_t const cores)
      : major        (major)
      , minor        (minor)
      , generation   (generation)
      , architecture (architecture)
      , processor    (processor)
      , cores        (cores) {
   }

   std::size_t const major;          // compute capability version
   std::size_t const minor;          // compute capability version
   std::string const generation;     // microarchitecture
   std::string const architecture;   //
   std::string const processor;      //
   std::size_t const cores;          //

   private:
      sm_info_t & operator = (sm_info_t const &);   // no copy assignment
};

inline std::string compute_mode_as_string (cudaComputeMode const mode) {
   switch (mode) {
      case cudaComputeModeDefault:          return "default";             // default-compute mode           (multiple threads can use cudaSetDevice with this device)
      case cudaComputeModeExclusive:        return "exclusive";           // compute-exclusive-thread mode  (only one thread in one process will be able to use cudaSetDevice with this device)
      case cudaComputeModeProhibited:       return "prohibited";          // compute-prohibited mode        (no threads can use cudaSetDevice with this device)
      case cudaComputeModeExclusiveProcess: return "exclusive process";   // compute-exclusive-process mode (many threads in one process will be able to use cudaSetDevice with this device)
   }

   return "unknown";
}

inline pfc::sm_info_t const & query_sm_info (std::size_t const major, std::size_t const minor) {
// Streaming Multiprocessor (SM):                  Tesla, Fermi
// Next Generation Streaming Multiprocessor (SMX): Kepler
// Maxwell Multiprocessor (SMM):                   Maxwell

   static std::array <pfc::sm_info_t, 12> const sm_info = {
      pfc::sm_info_t (0, 0, "",        "",      "",        0),   //
      pfc::sm_info_t (1, 0, "Tesla",   "sm_10", "G80",     8),   // ISA_1
      pfc::sm_info_t (1, 1, "Tesla",   "sm_11", "G8x",     8),   // atomic memory operations on global memory
      pfc::sm_info_t (1, 2, "Tesla",   "sm_12", "G9x",     8),   // atomic memory operations on shared memory, vote instructions
      pfc::sm_info_t (1, 3, "Tesla",   "sm_13", "GT200",   8),   // double precision floating point support
      pfc::sm_info_t (2, 0, "Fermi",   "sm_20", "GF100",  32),   // Fermi support
      pfc::sm_info_t (2, 1, "Fermi",   "sm_21", "GF10x",  48),   //
      pfc::sm_info_t (3, 0, "Kepler",  "sm_30", "GK10x", 192),   // Kepler support
      pfc::sm_info_t (3, 5, "Kepler",  "sm_35", "GK11x", 192),   //
      pfc::sm_info_t (5, 0, "Maxwell", "sm_50", "GM10x", 128),   // Maxwell support
      pfc::sm_info_t (5, 2, "Maxwell", "sm_52", "GM20x", 128),   //
      pfc::sm_info_t (0, 0, "Pascal",  "",      "",        0)    // Pascal support
   };

   for (std::size_t i = 1; i < sm_info.size (); ++i) {
      if ((sm_info[i].major == major) && (sm_info[i].minor == minor)) {
         return sm_info[i];
      }
   }

   return sm_info[0];
}

inline std::string version_to_string (std::size_t const version) {
   return std::to_string (version / 1000) + '.' + std::to_string (version % 100 / 10);
}

}   // namespace pfc


#endif