//       $Id: pfc_config.h 30323 2016-01-04 14:31:15Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_config.h $
// $Revision: 30323 $
//     $Date: 2016-01-04 15:31:15 +0100 (Mo., 04 Jän 2016) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_CONFIG_H
#define      PFC_CONFIG_H

// -------------------------------------------------------------------------------------------------

#undef  WITH_OPENGL
#define WITH_OPENGLx

//       ---------------gaussian----------------------   --sobel--   --rgba---
// v.    v.  bank size prefer lbounds restr. block       v.  block   ver block   description
// ---   --- --------- ------ ------- ------ ---------   --- -----   --- -----   -----------------------------------------------------------------------------------------------------------
// v00   v1  default   L1$                    8x 8       v1  32x8    v1  32x8    initiale Version
// v01   v1  default   L1$                   32x 2       v1  32x8    v1  32x8    Blockgroesse 32x2: verbessertes Coalescing                                                  iteration 1
// v02   v1  default   L1$                    8x16       v1  32x8    v1  32x8    Blockgroesse 8x16: verbesserte Occupancy
// v03   v1  default   L1$                   32x 4       v1  32x8    v1  32x8    Blockgroesse 32x4: verbesserte Occupancy
// v04   v2  default   L1$    128, 10        32x 4       v1  32x8    v1  32x8    verwendet __launch_bounds__: reduzierte Belastung der Register und verbesserte Occupancy
// v05   v3  default   smem                  32x 4       v1  32x8    v1  32x8    verbesserter Speicherzugriff ueber smem, reduzierter Druck auf die Load-Store-Unit          iteration 2
// v06   v4  default   smem           x      32x 8 / 2   v1  32x8    v1  32x8    verbesserte Faltungsmatrix
// v07   v5  default   smem           x      32x 8       v1  32x8    v1  32x8    reduzierter Berechnungsaufwand durch separierbare Filter
// v08   v6  default   smem           x      32x 8       v1  32x8    v1  32x8    Verarbeitung von zwei Pixels pro Thread: verbesserte Speichereffizienz und IPL
// v09   v6  8 bytes   smem           x      32x 8 / 2   v1  32x8    v1  32x8    verbesserter Zugriff auf den smem: weniger Konflikte auf den Speicherbaenken
// v10   v7  8 bytes   smem           x      32x 8 / 2   v1  32x8    v1  32x8    Verwendung von floats: reduzierte Belastung der arithmetischen Pipeline
// v11   v7  8 bytes   smem           x      32x 8 / 2   v2  32x8    v2  32x8    Verwendung von intrinsischen Mathematikfunktionen (math intrinsics)                         --use_fast_math

#if defined WITH_OPENGL
   #undef  GLUT_DISABLE_ATEXIT_HACK
   #define GLUT_DISABLE_ATEXIT_HACK

   #if defined GLUT_DISABLE_ATEXIT_HACK
      #pragma message ("CONFIGURATION: with OpenGL (and GLUT_DISABLE_ATEXIT_HACK defined)")
   #else
      #pragma message ("CONFIGURATION: with OpenGL")
   #endif
#else
   #pragma message ("CONFIGURATION: without OpenGL")
#endif

// -------------------------------------------------------------------------------------------------

#include "./pfc_status.h"
#include "./pfc_version.h"

#include <cuda_runtime.h>
#include <device_launch_parameters.h>

#include <algorithm>

// -------------------------------------------------------------------------------------------------

#undef  PFC_CONFIG
#define PFC_CONFIG \
   pfc::config::instance ()

// -------------------------------------------------------------------------------------------------

namespace pfc {

class config final {
   public:
      enum {   // show states
         blur, edge, gray, rgba
      };

      static char const * app_title () {
         return "Filters Application";
      }

      static dim3 block_size_blur () {
         switch (code_version ().as_int ()) {
            case  0: return { 8,  8};
            case  1: return {32,  2};
            case  2: return { 8, 16};
            case  3: return {32,  4};
            case  4: return {32,  4};
            case  5: return {32,  4};
            case  6: return {32,  8};
            case  7: return {32,  8};
            case  8: return {32,  8};
            case  9: return {32,  8};
            case 10: return {32,  8};
            case 11: return {32,  8};
         };

         throw std::runtime_error ("Code version undefined");
      }

      static dim3 block_size_gray () {
         return {32, 8};
      }

      static dim3 block_size_sobel () {
         return {32, 8};
      }

      static pfc::version const & code_version (int const n = 0) {
         static bool         initialized = false;
         static pfc::version version     = {};

         if (!initialized) {
            pfc::version v (n, 0, 11);

            v.register_name ( 0, "initiale Version");
            v.register_name ( 1, "Blockgroesse 32x2: verbessertes Coalescing");
            v.register_name ( 2, "Blockgroesse 8x16: verbesserte Occupancy");
            v.register_name ( 3, "Blockgroesse 32x4: verbesserte Occupancy");
            v.register_name ( 4, "verwendet __launch_bounds__: reduzierte Belastung der Register und verbesserte Occupancy");
            v.register_name ( 5, "verbesserter Speicherzugriff ueber smem, reduzierter Druck auf die Load-Store-Unit");
            v.register_name ( 6, "verbesserte Faltungsmatrix");
            v.register_name ( 7, "reduzierter Berechnungsaufwand durch separierbare Filter");
            v.register_name ( 8, "Verarbeitung von zwei Pixels pro Thread: verbesserte Speichereffizienz und IPL");
            v.register_name ( 9, "verbesserter Zugriff auf den smem: weniger Konflikte auf den Speicherbaenken");
            v.register_name (10, "Verwendung von floats: reduzierte Belastung der arithmetischen Pipeline");
            v.register_name (11, "Verwendung von intrinsischen Mathematikfunktionen (math intrinsics)");

            version = v; initialized = true;
         }

         return version;
      }

      static char const * img_filename () {
         return "./images/input.bmp";
      }

      static config & instance () {
         static config v; return v;
      }

      static pfc::status & show () {
         static bool        initialized = false;
         static pfc::status state       = {};

         if (!initialized) {
            state.register_state (blur, "blur");
            state.register_state (edge, "edge");
            state.register_state (gray, "gray");
            state.register_state (rgba, "rgba");

            initialized = true;
         }

         return state;
      }

      static int const cuda_device      =    0;   //
      static int const max_window_width = 1024;   // for OpenGL

      #if defined WITH_OPENGL
         static bool const with_opengl = true;
      #else
         static bool const with_opengl = false;
      #endif

      config (config const &) = delete;   // no copy construction
      config (config &&)      = delete;   // no move construction

      config & operator = (config const &) = delete;   // no copy assignment
      config & operator = (config &&)      = delete;   // no move assignment

      int pixels_total () const {
         return img_w * img_h;
      }

      int window_h (int const max_width = max_window_width) const {   // in [pels]
         if (img_w <= 0) {
            throw std::runtime_error ("Window too narrow");
         }

         return std::min (static_cast <int> (1.0f * img_h / img_w * max_width), img_h);
      }

      int window_w (int const max_width = max_window_width) const {   // in [pels]
         return std::min (max_width, img_w);
      }

      int img_h = 0;   // really a global variable, in [pels]
      int img_w = 0;   // really a global variable, in [pels]

   private:
      config () {   // singleton
      }
};

}   // namespace pfc

// -------------------------------------------------------------------------------------------------

#endif   // PFC_CONFIG_H
