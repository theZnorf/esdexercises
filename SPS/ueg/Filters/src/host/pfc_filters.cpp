//       $Id: pfc_filters.cpp 30323 2016-01-04 14:31:15Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_filters.cpp $
// $Revision: 30323 $
//     $Date: 2016-01-04 15:31:15 +0100 (Mo., 04 Jän 2016) $
//   Creator: Ch. Angerer, NVIDIA, J. Demouth, NVIDIA, peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#include "../device/gaussian_filter.h"
#include "../device/rgba_to_gray.h"
#include "../device/sobel_filter.h"

#include "./pfc_bitmap.h"
#include "./pfc_filters.h"
#include "./pfc_opengl.h"

#include "./pfc_cuda_memory.h"
#include "./pfc_timed_run.h"

namespace pfc {

// -------------------------------------------------------------------------------------------------

inline std::string ms_to_string (pfc::cuda::timer const & timer) {
   if (timer.is_running ()) {
      return "timer is running";

   } else if (!timer.did_run ()) {
      return "timer did never run";
   }

   return std::to_string (timer.get_elapsed_ms ()) + " ms";
}

inline std::ostream & print_cuda_device_props (int const device, std::ostream & out = std::cout) {
   auto const   props = pfc::cuda::get_device_props (device);
   auto const & info  = pfc::cuda::get_device_info (props);
   auto const   state = out.rdstate ();

   out <<
      "Device (Type)\n"
      "  name:                   " << props.name << " (" << info.uarch << ", " << info.chip << ")\n"
      "  compute capability:     " << props.major << '.' << props.minor << " (" << info.sm_version << ")\n"
      "Device (Processors)\n"
      "  SMs:                    " << props.multiProcessorCount << "\n"
      "  cores/SM:               " << info.cores_sm << "\n"
      "  load/store units/SM*:   " << info.load_store_units_sm << "\n"
      "  load/store throughput*: " << info.load_store_throughput << "/cycle\n"
      "  texture units/SM*:      " << info.texture_units_sm << "\n"
      "  texture throughput*:    " << info.texture_throughput << "/cycle\n"
      "  FP units/SM*:           " << info.fp32_units_sm << "\n"
      "  FP throughput*:         " << info.fp32_throughput << "/cycle\n"
      "  SF units/SM*:           " << info.sf_units_sm << "\n"
      "  SFU throughput*:        " << info.sfu_throughput << "/cycle\n"
      "  clock rate:             " << props.clockRate / 1000 << " MHz\n"
      "Device (Memory)\n"
      "  gmem size:              " << props.totalGlobalMem / 1073741824 << " GB\n"
      "  cmem size:              " << props.totalConstMem / 1024 << " kB\n"
      "  max. smem/block:        " << props.sharedMemPerBlock / 1024 << " kB\n"
      "  max. smem/SM:           " << props.sharedMemPerMultiprocessor / 1024 << " kB\n"
      "  smem banks:             " << info.smem_banks << "\n"
      "  smem bank width:        " << info.width_cl1 / info.smem_banks / 4 << " 'word' (i.e. 1 dword, 4 bytes)\n"
      "  L2$ size:               " << props.l2CacheSize / 1024 << " kB\n"
      "  buswidth gmem:          " << props.memoryBusWidth / 8 << " bytes\n"
      "  cache-line width L1$:   " << info.width_cl1 << " bytes\n"
      "  cache-line width L2$:   " << info.width_cl2 << " bytes\n"
      "  max. regs/block:        " << props.regsPerBlock / 1024 << " k\n"
      "  max. regs/SM:           " << props.regsPerMultiprocessor / 1024 << " k\n"
      "  max. regs/thread*:      " << std::min (props.regsPerBlock / props.maxThreadsPerBlock, props.regsPerMultiprocessor / props.maxThreadsPerMultiProcessor) << "\n"
      "  bandwidth gmem*:        " << props.memoryClockRate * props.memoryBusWidth / 8 / 1000000 << " GB/s\n"
      "  bandwidth L1$*:         " << props.memoryClockRate * info.width_cl1 / 1000000 << " GB/s\n"
      "  bandwidth L2$*:         " << props.memoryClockRate * info.width_cl2 / 1000000 << " GB/s\n"
      "  clock rate:             " << props.memoryClockRate / 1000 << " MHz\n"
      "Device (Scheduler)\n"
      "  max. act. blocks/SM:    " << info.max_act_blocks_sm << "\n"
      "  max. act. cores/SM:     " << info.max_act_cores_sm << "\n"
      "  max. block size:        " << pfc::to_string (props.maxThreadsDim) << " threads\n"
      "  max. threads/block:     " << props.maxThreadsPerBlock << "\n"
      "  max. threads/SM:        " << props.maxThreadsPerMultiProcessor << "\n"
      "  warp size:              " << props.warpSize << " threads\n"
      "  warp schedulers/SM:     " << info.schedulers_sm << "\n"
      "  max. warps/SM:          " << props.maxThreadsPerMultiProcessor / props.warpSize << "\n"
      "  IPCs:                   " << info.ipc << "\n\n";

   out.setstate (state); return out;
}

inline std::ostream & print_time (std::string header, pfc::cuda::timer const & time, int const width = 7, std::ostream & out = std::cout) {
   auto const state = out.rdstate ();

   out << header
       << std::setw (width) << std::setfill (' ') << std::right << pfc::ms_to_string (time);

   out.setstate (state); return out;
}

inline bool set_cuda_device (int const device) {
   int active = -1;

   PFC_CUDA_CHECK (cudaSetDevice (device));
   PFC_CUDA_CHECK (cudaGetDevice (&active));

   return (active >= 0) && (active == device);
}

// -------------------------------------------------------------------------------------------------

namespace {
   pfc::byte_t *  dp_bg1 = nullptr;   // background buffer #1 (contains just gray images, 1 bpp)
   pfc::byte_t *  dp_bg2 = nullptr;   // background buffer #2 (contains just gray images, 1 bpp)
   pfc::pixel_t * dp_src = nullptr;   // source buffer (contains the loaded rgba image, 4 bpp)
}

// -------------------------------------------------------------------------------------------------

void cleanup () {
   std::cout << "cleaning up ...\n";

   PFC_CUDA_FREE (pfc::dp_bg2);
   PFC_CUDA_FREE (pfc::dp_bg1);
   PFC_CUDA_FREE (pfc::dp_src);

   PFC_CUDA_CHECK (cudaDeviceReset ());
}

pfc::cuda::timer cuda_calculate_blur (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {
   pfc::cuda::timer timer (true);
      switch (pfc::config::code_version ().as_int ()) {
         case  0: gaussian_filter_kernel_v1_wrapper (dp_dst, dp_src); break;
         case  1: gaussian_filter_kernel_v1_wrapper (dp_dst, dp_src); break;
         case  2: gaussian_filter_kernel_v1_wrapper (dp_dst, dp_src); break;
         case  3: gaussian_filter_kernel_v1_wrapper (dp_dst, dp_src); break;
         case  4: gaussian_filter_kernel_v2_wrapper (dp_dst, dp_src); break;
         case  5: gaussian_filter_kernel_v3_wrapper (dp_dst, dp_src); break;
         case  6: gaussian_filter_kernel_v4_wrapper (dp_dst, dp_src); break;
         case  7: gaussian_filter_kernel_v5_wrapper (dp_dst, dp_src); break;
         case  8: gaussian_filter_kernel_v6_wrapper (dp_dst, dp_src); break;
         case  9: gaussian_filter_kernel_v6_wrapper (dp_dst, dp_src); break;
         case 10: gaussian_filter_kernel_v7_wrapper (dp_dst, dp_src); break;
         case 11: gaussian_filter_kernel_v7_wrapper (dp_dst, dp_src); break;
      };
   return std::move (timer.stop ());
}

pfc::cuda::timer cuda_calculate_edge (pfc::byte_t * const dp_dst, pfc::byte_t const * const dp_src) {
   pfc::cuda::timer timer (true);
      if (pfc::config::code_version ().is_not (11)) {
         sobel_filter_kernel_v1_wrapper (dp_dst, dp_src);
      } else {
         sobel_filter_kernel_v2_wrapper (dp_dst, dp_src);
      }
   return std::move (timer.stop ());
}

pfc::cuda::timer cuda_calculate_gray (pfc::byte_t * const dp_dst, pfc::pixel_t const * const dp_src) {
   pfc::cuda::timer timer (true);
      if (pfc::config::code_version ().is_not (11)) {
         rgba_to_gray_kernel_v1_wrapper (dp_dst, dp_src);
      } else {
         rgba_to_gray_kernel_v2_wrapper (dp_dst, dp_src);
      }
   return std::move (timer.stop ());
}

pfc::cuda::timer cuda_calculate_rgba (pfc::pixel_t * const dp_dst, pfc::pixel_t const * const dp_src) {
   pfc::cuda::timer timer (true);
      PFC_CUDA_MEMCPY (dp_dst, dp_src, PFC_CONFIG.pixels_total (), cudaMemcpyDeviceToDevice);
   return std::move (timer.stop ());
}

pfc::pixel_t * cuda_calculate (pfc::pixel_t * const dp_dst) {

// ----|----------|---------
// mode| xd bd es | xs bs ed
// ----|----------|---------
// x   |  d       |  s
// xb  |  1  d    |  s  1
// xe  |  1     1 |  s     d
// xbe |  1  2  2 |  s  1  d
// ----|----------|---------
//
// b ... blur
// d ... destination or dp_dst (with OpenGL the OpenGL double buffer, otherwise a temporary buffer)
// e ... edge
// s ... source or pfc::dp_src (the loaded image)
// x ... rgba or gray

   auto const xd = pfc::config::show ().is_one_of ({pfc::config::blur, pfc::config::edge}) ? pfc::dp_bg1 : pfc::to_p_byte_t (dp_dst);
   auto const bd = pfc::config::show ().is        (                    pfc::config::edge ) ? pfc::dp_bg2 : pfc::to_p_byte_t (dp_dst);
   auto const es = pfc::config::show ().is        ( pfc::config::blur                    ) ? pfc::dp_bg2 : pfc::dp_bg1;

   pfc::cuda::timer timer (true);
      if (pfc::config::show ().is (pfc::config::rgba)) {
         pfc::print_time ("cuda_calculate_rgba:   ", pfc::cuda_calculate_rgba (pfc::to_p_pixel_t (xd), pfc::dp_src)) << '\n';
      }

      if (pfc::config::show ().is (pfc::config::gray)) {
         pfc::print_time ("cuda_calculate_gray:   ", pfc::cuda_calculate_gray (xd, pfc::dp_src)) << '\n';
      }

      if (pfc::config::show ().is (pfc::config::blur)) {
         pfc::print_time ("cuda_calculate_blur:   ", pfc::cuda_calculate_blur (bd, pfc::dp_bg1)) << '\n';
      }

      if (pfc::config::show ().is (pfc::config::edge)) {
         pfc::print_time ("cuda_calculate_edge:   ", pfc::cuda_calculate_edge (pfc::to_p_byte_t (dp_dst), es)) << '\n';
      }
   timer.stop ();

   pfc::print_time ("cuda_calculate (total):", timer) << "\n\n"; return dp_dst;
}

pfc::pixel_t * load_image (std::ostream & out = std::cout) {
   auto const state = out.rdstate ();

   std::cout << "loading image '" << pfc::config::img_filename () << "' ...\n";

   pfc::bitmap const img (pfc::config::img_filename ());

   pfc::pixel_t * dp_img = nullptr;
// pfc::pixel_t * hp_img = nullptr;

   if (img.get_num_pixels () > 0) {
      PFC_CONFIG.img_h = img.get_height ();
      PFC_CONFIG.img_w = img.get_width ();

      std::cout << "width:       " << PFC_CONFIG.img_w << " pels\n"
                   "height:      " << PFC_CONFIG.img_h << " pels\n"
                   "buffer size: " << std::setprecision (1) << std::fixed
                                   << 1.0 * sizeof (pfc::pixel_t) * PFC_CONFIG.pixels_total () / 1024 / 1024 << " MB\n\n";

      if ((img.get_width () * 3) % 4 == 0) {   // a restriction on pfc::bitmaps
         auto hp_img = std::make_unique <pfc::pixel_t []> (PFC_CONFIG.pixels_total ());
              dp_img = PFC_CUDA_MALLOC (pfc::pixel_t, PFC_CONFIG.pixels_total ());

         PFC_CUDA_MEMCPY (
            dp_img,
            pfc::copy_rgb_to_rgba (hp_img, img.get_image_byte (), PFC_CONFIG.pixels_total ()),
            PFC_CONFIG.pixels_total (),
            cudaMemcpyHostToDevice
         );
      }
   }

   out.setstate (state); return dp_img;
}

}   // namespace pfc

// -------------------------------------------------------------------------------------------------

void checked_main (int argc, char * argv []) {
   if ((argc >= 2) && (argv != nullptr)) {
      pfc::config::code_version (std::atoi (argv[1]));
   }

   std::cout
      << std::boolalpha << pfc::config::app_title () << '\n'
      << std::string (std::string (pfc::config::app_title ()).size (), '-') << "\n"
      "Code Version: " << pfc::config::code_version ().as_int () << "\n"
      "Description:  " << pfc::config::code_version ().as_string () << "\n"
      "Use OpenGL:   " << pfc::config::with_opengl << "\n\n";

   if (pfc::set_cuda_device (pfc::config::cuda_device)) {
      pfc::print_cuda_device_props (pfc::config::cuda_device);

      if ((pfc::dp_src = pfc::load_image ()) != nullptr) {
         pfc::dp_bg1 = PFC_CUDA_MALLOC (pfc::byte_t, PFC_CONFIG.pixels_total () * 4);   // factor 4 is simplifying things (4 bpp vs. 1 bpp)
         pfc::dp_bg2 = PFC_CUDA_MALLOC (pfc::byte_t, PFC_CONFIG.pixels_total () * 4);   // factor 4 is simplifying things (4 bpp vs. 1 bpp)

         #if defined WITH_OPENGL
            pfc::config::show ().set_excusively (pfc::config::rgba);
            pfc::opengl::initialize (argc, argv);
            PFC_OPENGL_CHECK (glutMainLoop ());   // does not return!
         #else
            pfc::config::show ().set_excusively ({
               pfc::config::blur,
               pfc::config::gray,
               pfc::config::edge
            });

            PFC_CUDA_FREE (pfc::cuda_calculate (PFC_CUDA_MALLOC (pfc::pixel_t, PFC_CONFIG.pixels_total ())));
         #endif
      } else {
         throw std::runtime_error ("Error loading image (image not found or not valid)");
      }
   }
}

void main (int argc, char * argv []) {
   try {
      checked_main (argc, argv);
   } catch (std::exception const & x) {
      std::cerr << "Error: Exception of type " << typeid (x).name () << " caught.\n"
                   "Error: " << x.what () << ".\n\n";
   }

   pfc::cleanup ();
}


/*
1>------ Build started: Project: Filters, Configuration: Debug Win32 ------
1>  Compiling CUDA source file src\device\gaussian_filter.cu...
1>
1>  C:\Users\P20068\Documents\mine\vocational\teaching\ESD\SPS3\2015-WS\Ablauf\src\Filters>"C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\bin\nvcc.exe" -gencode=arch=compute_30,code=\"sm_30,compute_30\" --use-local-env --cl-version 2013 -ccbin "C:\Program Files (x86)\Microsoft Visual Studio 12.0\VC\bin"  -I"C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\include" -I"C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\include"  -G   --keep-dir Debug -maxrregcount=0 --ptxas-options=-v --machine 32 --compile -cudart static --use_fast_math  -g   -DWIN32 -D_DEBUG -D_CONSOLE -D_LIB -D_UNICODE -DUNICODE -Xcompiler "/EHsc /W4 /nologo /Od /Zi /RTC1 /MDd " -o Debug\gaussian_filter.cu.obj "C:\Users\P20068\Documents\mine\vocational\teaching\ESD\SPS3\2015-WS\Ablauf\src\Filters\src\device\gaussian_filter.cu"
1>  ptxas info    : 192 bytes gmem, 224 bytes cmem[3]
1>  ptxas info    : Compiling entry function '_Z25gaussian_filter_kernel_v3iiPhPKh' for 'sm_30'
1>  ptxas info    : Function properties for _Z25gaussian_filter_kernel_v3iiPhPKh
1>      200 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 13 registers, 200 bytes cumulative stack size, 640 bytes smem, 336 bytes cmem[0]
1>  ptxas info    : Compiling entry function '_Z25gaussian_filter_kernel_v7iiPhPKh' for 'sm_30'
1>  ptxas info    : Function properties for _Z25gaussian_filter_kernel_v7iiPhPKh
1>      224 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 23 registers, 240 bytes cumulative stack size, 5120 bytes smem, 336 bytes cmem[0]
1>  ptxas info    : Compiling entry function '_Z25gaussian_filter_kernel_v5iiPhPKh' for 'sm_30'
1>  ptxas info    : Function properties for _Z25gaussian_filter_kernel_v5iiPhPKh
1>      88 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 16 registers, 88 bytes cumulative stack size, 2432 bytes smem, 336 bytes cmem[0]
1>  ptxas info    : Function properties for _ZN72_INTERNAL_50_tmpxft_000025e0_00000000_5_gaussian_filter_cpp1_ii_dec894209make_int2Eii
1>      16 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Compiling entry function '_Z25gaussian_filter_kernel_v1iiPhPKh' for 'sm_30'
1>  ptxas info    : Function properties for _Z25gaussian_filter_kernel_v1iiPhPKh
1>      200 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 13 registers, 200 bytes cumulative stack size, 336 bytes cmem[0]
1>  ptxas info    : Compiling entry function '_Z25gaussian_filter_kernel_v4iiPhPKh' for 'sm_30'
1>  ptxas info    : Function properties for _Z25gaussian_filter_kernel_v4iiPhPKh
1>      288 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 23 registers, 304 bytes cumulative stack size, 5120 bytes smem, 336 bytes cmem[0]
1>  ptxas info    : Function properties for _ZN72_INTERNAL_50_tmpxft_000025e0_00000000_5_gaussian_filter_cpp1_ii_dec8942011make_uchar2Ehh
1>      16 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Compiling entry function '_Z25gaussian_filter_kernel_v6iiPhPKh' for 'sm_30'
1>  ptxas info    : Function properties for _Z25gaussian_filter_kernel_v6iiPhPKh
1>      224 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 23 registers, 240 bytes cumulative stack size, 5120 bytes smem, 336 bytes cmem[0]
1>  ptxas info    : Function properties for _ZN72_INTERNAL_50_tmpxft_000025e0_00000000_5_gaussian_filter_cpp1_ii_dec8942011make_float2Eff
1>      16 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Compiling entry function '_Z25gaussian_filter_kernel_v2iiPhPKh' for 'sm_30'
1>  ptxas info    : Function properties for _Z25gaussian_filter_kernel_v2iiPhPKh
1>      200 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 13 registers, 200 bytes cumulative stack size, 336 bytes cmem[0]
1>  gaussian_filter.cu
1>  CONFIGURATION: with OpenGL (and GLUT_DISABLE_ATEXIT_HACK defined)
1>  Compiling CUDA source file src\device\rgba_to_gray.cu...
1>
1>  C:\Users\P20068\Documents\mine\vocational\teaching\ESD\SPS3\2015-WS\Ablauf\src\Filters>"C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\bin\nvcc.exe" -gencode=arch=compute_30,code=\"sm_30,compute_30\" --use-local-env --cl-version 2013 -ccbin "C:\Program Files (x86)\Microsoft Visual Studio 12.0\VC\bin"  -I"C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\include" -I"C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\include"  -G   --keep-dir Debug -maxrregcount=0 --ptxas-options=-v --machine 32 --compile -cudart static --use_fast_math  -g   -DWIN32 -D_DEBUG -D_CONSOLE -D_LIB -D_UNICODE -DUNICODE -Xcompiler "/EHsc /W4 /nologo /Od /Zi /RTC1 /MDd " -o Debug\rgba_to_gray.cu.obj "C:\Users\P20068\Documents\mine\vocational\teaching\ESD\SPS3\2015-WS\Ablauf\src\Filters\src\device\rgba_to_gray.cu"
1>  ptxas info    : 192 bytes gmem
1>  ptxas info    : Compiling entry function '_Z22rgba_to_gray_kernel_v2iiPhPK6uchar4' for 'sm_30'
1>  ptxas info    : Function properties for _Z22rgba_to_gray_kernel_v2iiPhPK6uchar4
1>      48 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 22 registers, 64 bytes cumulative stack size, 336 bytes cmem[0]
1>  ptxas info    : Function properties for _ZN69_INTERNAL_47_tmpxft_00002dd8_00000000_5_rgba_to_gray_cpp1_ii_15edb9d911make_uchar4Ehhhh
1>      16 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Compiling entry function '_Z22rgba_to_gray_kernel_v1iiPhPK6uchar4' for 'sm_30'
1>  ptxas info    : Function properties for _Z22rgba_to_gray_kernel_v1iiPhPK6uchar4
1>      16 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 14 registers, 16 bytes cumulative stack size, 336 bytes cmem[0]
1>  rgba_to_gray.cu
1>  CONFIGURATION: with OpenGL (and GLUT_DISABLE_ATEXIT_HACK defined)
1>  Compiling CUDA source file src\device\sobel_filter.cu...
1>
1>  C:\Users\P20068\Documents\mine\vocational\teaching\ESD\SPS3\2015-WS\Ablauf\src\Filters>"C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\bin\nvcc.exe" -gencode=arch=compute_30,code=\"sm_30,compute_30\" --use-local-env --cl-version 2013 -ccbin "C:\Program Files (x86)\Microsoft Visual Studio 12.0\VC\bin"  -I"C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\include" -I"C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\include"  -G   --keep-dir Debug -maxrregcount=0 --ptxas-options=-v --machine 32 --compile -cudart static --use_fast_math  -g   -DWIN32 -D_DEBUG -D_CONSOLE -D_LIB -D_UNICODE -DUNICODE -Xcompiler "/EHsc /W4 /nologo /Od /Zi /RTC1 /MDd " -o Debug\sobel_filter.cu.obj "C:\Users\P20068\Documents\mine\vocational\teaching\ESD\SPS3\2015-WS\Ablauf\src\Filters\src\device\sobel_filter.cu"
1>  ptxas info    : 192 bytes gmem, 144 bytes cmem[3]
1>  ptxas info    : Compiling entry function '_Z22sobel_filter_kernel_v1iiPhPKh' for 'sm_30'
1>  ptxas info    : Function properties for _Z22sobel_filter_kernel_v1iiPhPKh
1>      48 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 14 registers, 48 bytes cumulative stack size, 336 bytes cmem[0]
1>  ptxas info    : Compiling entry function '_Z22sobel_filter_kernel_v2iiPhPKh' for 'sm_30'
1>  ptxas info    : Function properties for _Z22sobel_filter_kernel_v2iiPhPKh
1>      48 bytes stack frame, 0 bytes spill stores, 0 bytes spill loads
1>  ptxas info    : Used 20 registers, 48 bytes cumulative stack size, 336 bytes cmem[0]
1>  sobel_filter.cu
1>  CONFIGURATION: with OpenGL (and GLUT_DISABLE_ATEXIT_HACK defined)
1>  Microsoft (R) C/C++ Optimizing Compiler Version 18.00.40629 for x86
1>  Copyright (C) Microsoft Corporation.  All rights reserved.
1>
1>  cl /c /I"C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\include" /Zi /W4 /WX- /sdl /Od /Oy- /D WIN32 /D _DEBUG /D _CONSOLE /D _LIB /D _UNICODE /D UNICODE /Gm /EHsc /RTC1 /MDd /GS /fp:precise /Zc:wchar_t /Zc:forScope /Fo"Debug\\" /Fd"Debug\vc120.pdb" /Gd /TP /analyze- /errorReport:prompt src\host\pfc_filters.cpp src\host\pfc_opengl.cpp
1>
1>  pfc_opengl.cpp
1>  CONFIGURATION: with OpenGL (and GLUT_DISABLE_ATEXIT_HACK defined)
1>  pfc_filters.cpp
1>  CONFIGURATION: with OpenGL (and GLUT_DISABLE_ATEXIT_HACK defined)
1>  Generating Code...
1>  Microsoft (R) Incremental Linker Version 12.00.40629.0
1>  Copyright (C) Microsoft Corporation.  All rights reserved.
1>
1>  "/OUT:C:\Users\P20068\Documents\mine\vocational\teaching\ESD\SPS3\2015-WS\Ablauf\src\Filters\Debug\Filters.exe" /INCREMENTAL "/LIBPATH:C:\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\lib\Win32" kernel32.lib user32.lib gdi32.lib winspool.lib comdlg32.lib advapi32.lib shell32.lib ole32.lib oleaut32.lib uuid.lib odbc32.lib odbccp32.lib /MANIFEST "/MANIFESTUAC:level='asInvoker' uiAccess='false'" /manifest:embed /DEBUG "/PDB:C:\Users\P20068\Documents\mine\vocational\teaching\ESD\SPS3\2015-WS\Ablauf\src\Filters\Debug\Filters.pdb" /SUBSYSTEM:CONSOLE /TLBID:1 /DYNAMICBASE /NXCOMPAT "/IMPLIB:C:\Users\P20068\Documents\mine\vocational\teaching\ESD\SPS3\2015-WS\Ablauf\src\Filters\Debug\Filters.lib" /MACHINE:X86 Debug\gaussian_filter.cu.obj
1>  Debug\rgba_to_gray.cu.obj
1>  Debug\sobel_filter.cu.obj
1>  Debug\pfc_filters.obj
1>  Debug\pfc_opengl.obj
1>  "..\..\..\..\..\..\..\..\..\..\..\..\Program Files (x86)\NVIDIA Corporation\Nsight Visual Studio Edition 5.0\Monitor\glew\lib\glew32.lib"
1>  "..\..\..\..\..\..\..\..\..\..\..\..\Program Files\NVIDIA GPU Computing Toolkit\CUDA\v7.5\lib\Win32\cudart.lib"
1>  "..\..\..\..\..\..\..\..\..\freeglut-MSVC-3.0.0-2.mp\lib\freeglut.lib"
1>  Filters.vcxproj -> C:\Users\P20068\Documents\mine\vocational\teaching\ESD\SPS3\2015-WS\Ablauf\src\Filters\Debug\Filters.exe
========== Build: 1 succeeded, 0 failed, 0 up-to-date, 0 skipped ==========
*/

/*
Filters Application
-------------------
Code Version: 5
Description:  verbesserter Speicherzugriff ueber smem, reduzierter Druck auf die Load-Store-Unit
Use OpenGL:   false

Device (Type)
  name:                   Quadro K2100M (Kepler, GK10x)
  compute capability:     3.0 (sm_30)
Device (Processors)
  SMs:                    3
  cores/SM:               192
  load/store units/SM*:   32
  load/store throughput*: 32/cycle
  texture units/SM*:      16
  texture throughput*:    16/cycle
  FP units/SM*:           192
  FP throughput*:         192/cycle
  SF units/SM*:           32
  SFU throughput*:        32/cycle
  clock rate:             666 MHz
Device (Memory)
  gmem size:              2 GB
  cmem size:              64 kB
  max. smem/block:        48 kB
  max. smem/SM:           48 kB
  smem banks:             32
  smem bank width:        1 'word' (i.e. 1 dword, 4 bytes)
  L2$ size:               256 kB
  buswidth gmem:          16 bytes
  cache-line width L1$:   128 bytes
  cache-line width L2$:   32 bytes
  max. regs/block:        64 k
  max. regs/SM:           64 k
  max. regs/thread*:      32
  bandwidth gmem*:        24 GB/s
  bandwidth L1$*:         192 GB/s
  bandwidth L2$*:         48 GB/s
  clock rate:             1504 MHz
Device (Scheduler)
  max. act. blocks/SM:    16
  max. act. cores/SM:     16
  max. block size:        1024 x 1024 x 64 threads
  max. threads/block:     1024
  max. threads/SM:        2048
  warp size:              32 threads
  warp schedulers/SM:     4
  max. warps/SM:          64
  IPCs:                   2

loading image './images/input.bmp' ...
width:       3648 pels
height:      2736 pels
buffer size: 38.1 MB

cuda_calculate_gray:     12 ms
cuda_calculate_blur:    197 ms
cuda_calculate_edge:     67 ms
cuda_calculate (total): 287 ms

cleaning up ...
*/
