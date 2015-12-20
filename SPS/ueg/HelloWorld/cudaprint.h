//       $Id: snippet-3.h 26988 2015-01-15 16:51:15Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/HelloWorld/src/snippet-3.h $
// $Revision: 26988 $
//     $Date: 2015-01-15 17:51:15 +0100 (Do., 15 Jän 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $
//
//   Remarks: Prints infos about CUDA devices.
//     Types:
// Functions: pfc::can_map_host_memory, pfc::print_device_props

#ifndef CUDAPRINT_H
#define CUDAPRINT_H


#include <cuda_runtime.h>
#include <stdlib.h>

namespace pfc {

inline bool can_map_host_memory (std::size_t const device) {
   cudaDeviceProp props = {}; pfc::check (cudaGetDeviceProperties (&props, device)); return props.canMapHostMemory != 0;
}

inline void print_device_props (std::size_t const device = 0, std::ostream & out = std::cout) {
   int            cudart_version   = 0;
   int            driver_version   = 0;
   cudaDeviceProp props            = {};
   std::size_t    size_malloc_heap = 0;
   std::size_t    size_printf_fifo = 0;

   pfc::check (cudaRuntimeGetVersion (&cudart_version));
   pfc::check (cudaDriverGetVersion (&driver_version));
   pfc::check (cudaGetDeviceProperties (&props, device));

   if (props.major >= 2) {
      cudaDeviceGetLimit (&size_malloc_heap, cudaLimitMallocHeapSize);
      cudaDeviceGetLimit (&size_printf_fifo, cudaLimitPrintfFifoSize);
   }

   auto const & sm_info = pfc::query_sm_info (props.major, props.minor);

   out << std::boolalpha <<
      "===============================================================================\n"
      "CUDA Device Number:                           "  << device     << "\n"
      "CUDA Device Name:                             '" << props.name << "'\n"
      "-------------------------------------------------------------------------------\n"
      "Compute Capability:                           " << props.major << '.' << props.minor       << "\n"
      "Runtime Version (header API):                 " << pfc::version_to_string (CUDART_VERSION) << "\n"
      "Runtime Version (library ABI):                " << pfc::version_to_string (cudart_version) << "\n"
      "Driver Version:                               " << pfc::version_to_string (driver_version) << "\n"
      "-------------------------------------------------------------------------------\n"
      "Streaming Multiprocessors (SM/SMX):           " << props.multiProcessorCount                 << "\n"
      "Cores per SM/SMX:                             " << sm_info.cores                             << "\n"
      "Cores Total:                                  " << props.multiProcessorCount * sm_info.cores << "\n"
      "Processor Clock Frequency:                    " << props.clockRate / 1000000.0               << " GHz\n"
      "Memory Clock Frequency:                       " << props.memoryClockRate / 1000.0            << " MHz\n"
      "Bus Width:                                    " << props.memoryBusWidth                      << " bits\n"
      "Global Memory:                                " << props.totalGlobalMem / 1073741824.0       << " GB\n"
      "Constant Memory:                              " << props.totalConstMem / 1024.0              << " kB\n"
      "Shared Memory per Block:                      " << props.sharedMemPerBlock / 1024.0          << " kB\n"
      "Registers per Block:                          " << props.regsPerBlock                        << "\n"
      "-------------------------------------------------------------------------------\n"
      "Threads per SM/SMX:                           " << props.maxThreadsPerMultiProcessor                                                            << "\n"
      "Threads Total:                                " << props.multiProcessorCount * props.maxThreadsPerMultiProcessor                                << "\n"
      "Threads per Block:                            " << props.maxThreadsPerBlock                                                                     << "\n"
      "Grid Size:                                    " << props.maxGridSize[0]   << " x " << props.maxGridSize[1]   << " x " << props.maxGridSize[2]   << " blocks\n"
      "Block Size:                                   " << props.maxThreadsDim[0] << " x " << props.maxThreadsDim[1] << " x " << props.maxThreadsDim[2] << " threads\n"
      "Warp Size:                                    " << props.warpSize                                                                               << " threads\n"
      "-------------------------------------------------------------------------------\n"
      "Compute Mode:                                 " << pfc::compute_mode_as_string (static_cast <cudaComputeMode> (props.computeMode)) << "\n"
      "Run-time Limit on Kernels:                    " << (props.kernelExecTimeoutEnabled != 0)                                           << "\n"
      "Can Execute Concurrent Kernels:               " << (props.concurrentKernels != 0)                                                  << "\n"
      "Copy Engines (concurrent copy and execution): " << props.asyncEngineCount                                                          << "\n"
      "Can Map Host Memory (Zero Copy):              " << (props.canMapHostMemory != 0)                                                   << "\n"
      "Integrated GPU Sharing of Host Memory:        " << (props.integrated != 0)                                                         << "\n"
      "Unified Virtual Addressing (UVA):             " << (props.unifiedAddressing != 0)                                                  << "\n"
      "Error Correcting Codes (ECC) Support:         " << (props.ECCEnabled != 0)                                                         << "\n"
      "Tesla Compute Cluster (TCC) Mode:             " << (props.tccDriver != 0)                                                          << "\n"
      "-------------------------------------------------------------------------------\n"
      "GPU malloc heap size:                         " << size_malloc_heap / 1024.0 << " kB\n"
      "GPU printf/fprintf FIFO size:                 " << size_printf_fifo / 1024.0 << " kB\n"
      "-------------------------------------------------------------------------------\n"
      "PCI Bus ID:                                   " << props.pciBusID    << "\n"
      "PCI Device ID:                                " << props.pciDeviceID << "\n"
      "===============================================================================\n";
}

}   // namespace pfc


#endif