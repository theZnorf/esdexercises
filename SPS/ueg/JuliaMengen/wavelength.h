//       $Id: snippet-4.h 29419 2015-10-13 06:46:29Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Fractals/src/snippet-4.h $
// $Revision: 29419 $
//     $Date: 2015-10-13 08:46:29 +0200 (Di., 13 Okt 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $
//
//   Remarks: Get an RGB-value from a light beam's wavelength.
//     Types:
// Functions: pfc::rgb_from_wavelength, pfc::rgb_from_wavelength_pm

#ifndef WAVELENGTH_H
#define WAVELENGTH_H

#include <algorithm>

namespace pfc {

template <typename rgb_t> inline void rgb_from_wavelength_pm (rgb_t & col, int wavelength, bool const gray = false) {
   typedef decltype (col.red)   red_t;     // rgb_t::red
   typedef decltype (col.green) green_t;   // rgb_t::green
   typedef decltype (col.blue)  blue_t;    // rgb_t::blue

   static_assert (
      std::is_same <red_t, green_t>::value && std::is_same <red_t, blue_t>::value,
      "The color components of 'rgb_from_wavelength::rgb_t' must be of identical types."
   );

   static_assert (
      std::is_integral <red_t>::value && std::is_unsigned <red_t>::value,
      "The color components of 'rgb_from_wavelength::rgb_t' must be unsigned integral values."
   );

   wavelength = std::min (std::max (wavelength, 380000), 780000);

   unsigned r = 0;
   unsigned g = 0;
   unsigned b = 0;

   if (wavelength <  440000) { r = (440000 - wavelength) / 60; b = 1000; } else
   if (wavelength <  490000) { g = (wavelength - 440000) / 50; b = 1000; } else
   if (wavelength <  510000) { g = 1000; b = (510000 - wavelength) / 20; } else
   if (wavelength <  580000) { r = (wavelength - 510000) / 70; g = 1000; } else
   if (wavelength <  645000) { r = 1000; g = (645000 - wavelength) / 65; } else
   if (wavelength <= 780000) { r = 1000;                                 }

   double f = 0;

   if (wavelength <  420000) { f = -0.006350 + 0.00000001750 * wavelength; } else
   if (wavelength <  701000) { f =  0.001000;                              } else
   if (wavelength <= 780000) { f =  0.007125 - 0.00000000875 * wavelength; }

   double const alpha = 0.8;

   col.red   = red_t   (std::numeric_limits <red_t>  ::max () * std::min (std::pow (r * f, alpha), 1.0));
   col.green = green_t (std::numeric_limits <green_t>::max () * std::min (std::pow (g * f, alpha), 1.0));
   col.blue  = blue_t  (std::numeric_limits <blue_t> ::max () * std::min (std::pow (b * f, alpha), 1.0));

   if (gray) {
      col.red   =
      col.green =
      col.blue  = static_cast <red_t> ((col.red + col.green + col.blue) / 3);
   }
}

template <typename rgb_t> inline void rgb_from_wavelength (rgb_t & col, int const wavelength, bool const gray = false) {
   rgb_from_wavelength_pm <rgb_t> (col, wavelength * 1000, gray);
}

template <typename rgb_t> inline void rgb_from_wavelength (rgb_t & col, double const x, bool const gray = false) {
   rgb_from_wavelength_pm <rgb_t> (col, static_cast <int> (380000 + (780000 - 380000) * x), gray);
}

}   // namespace pfc

#endif