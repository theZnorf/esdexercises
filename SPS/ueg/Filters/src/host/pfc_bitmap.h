//       $Id: pfc_bitmap.h 30323 2016-01-04 14:31:15Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_bitmap.h $
// $Revision: 30323 $
//     $Date: 2016-01-04 15:31:15 +0100 (Mo., 04 JÃ¤n 2016) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $
//
// Copyright: (c) 2011 Peter Kulczycki (peter.kulczycki<AT>fh-hagenberg.at)
//   License: Distributed under the Boost Software License, Version 1.0 (see
//            http://www.boost.org/LICENSE_1_0.txt).
//
//   Remarks: 1) Currently, just 24-bit bitmaps are supported.
//            2) 4 must divide the line width in pixels * 3, i.e., a scanline
//               must end on a 32-bit boundary.
//
// exportierte Typen
// -----------------
// pfc::RGB_3_t, pfc::RGB_4_t, pfc::bitmap, pfc::byte_t, pfc::dword_t, pfc::long_t, pfc::word_t
//
// exportierte Funktionen
// ----------------------
// pfc::abs, pfc::ceil_div, pfc::cstr_empty, pfc::is_negative, pfc::is_zero, pfc::mem_copy,
// pfc::mem_copy_ptr, pfc::mem_reset, pfc::mem_set, pfc::mem_set_ptr, pfc::read, pfc::read_ptr,
// pfc::reset, pfc::swap, pfc::write, pfc::write_ptr

#if !defined PFC_BITMAP_H
#define      PFC_BITMAP_H

// -------------------------------------------------------------------------------------------------
// version information -----------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------

#undef PFC_BITMAP_VERSION
#undef PFC_BITMAP_VERSION_MAJOR
#undef PFC_BITMAP_VERSION_MINOR
#undef PFC_BITMAP_VERSION_PATCHLEVEL
#undef PFC_BITMAP_VERSION_REVISION

#define PFC_BITMAP_VERSION            "1.0.3"   /*                            */
#define PFC_BITMAP_VERSION_MAJOR          1     /* große Änderungen           */
#define PFC_BITMAP_VERSION_MINOR          0     /* funktionelle Erweiterungen */
#define PFC_BITMAP_VERSION_PATCHLEVEL     3     /* Fehlerbehebungen           */
#define PFC_BITMAP_VERSION_REVISION   23401     /* VCS Revisionsnummer        */

// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------

#include <cstdint>
#include <cstring>
#include <fstream>
#include <iomanip>
#include <iostream>
#include <memory>
#include <string>

#undef HAVE_NO_PFC

#if !defined PFC_UTILITY_VERSION && !defined PFC_MINI_VERSION
   #define HAVE_NO_PFC
#endif

namespace pfc {

// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------

#if defined HAVE_NO_PFC

using byte_t  = std::uint8_t;  static_assert (sizeof (pfc::byte_t)  == 1, "PFC: The size of 'pfc::byte_t' must be 1." );
using dword_t = std::uint32_t; static_assert (sizeof (pfc::dword_t) == 4, "PFC: The size of 'pfc::dword_t' must be 4.");
using long_t  = std::int32_t;  static_assert (sizeof (pfc::long_t)  == 4, "PFC: The size of 'pfc::long_t' must be 4." );
using word_t  = std::uint16_t; static_assert (sizeof (pfc::word_t)  == 2, "PFC: The size of 'pfc::word_t' must be 2." );

using is_integral_no  = std::false_type;
using is_integral_yes = std::true_type;
using is_unsigned_no  = std::false_type;
using is_unsigned_yes = std::true_type;

#endif   // HAVE_NO_PFC

class bitmap;

#pragma pack (push, 1)

struct RGB_3_t {
   pfc::byte_t blue;
   pfc::byte_t green;
   pfc::byte_t red;
};

struct RGB_4_t {
   pfc::byte_t blue;
   pfc::byte_t green;
   pfc::byte_t red;
   pfc::byte_t reserved;
};

#pragma pack (pop)

// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------

template <typename value_t> inline value_t &
   mem_copy (value_t & dst, value_t const & src);
template <typename value_t> inline value_t *
   mem_copy_ptr (value_t * const p_dst, value_t const * const p_src, int const size);
template <typename value_t> inline value_t &
   mem_reset (value_t & dst);
template <typename value_t> inline value_t &
   mem_set (value_t & dst, int const c = 0);
template <typename value_t> inline value_t *
   mem_set_ptr (value_t * const p_dst, int const c, int const size);
inline void
   swap (bitmap & lhs, bitmap & rhs);

#if defined HAVE_NO_PFC

template <typename value_t> inline value_t
   abs (value_t const & a);
template <typename value_t> inline value_t
   abs (value_t const & a, pfc::is_unsigned_no);
template <typename value_t> inline value_t
   abs (value_t const & a, pfc::is_unsigned_yes);
template <typename value_t> inline value_t
   ceil_div (value_t const & a, value_t const & b);
template <typename char_t> inline bool
   cstr_empty (char_t * const p_cstr);
template <typename value_t> inline bool
   is_negative (value_t const & a);
template <typename value_t> inline bool
   is_negative (value_t const & a, pfc::is_unsigned_no);
template <typename value_t> inline bool
   is_negative (value_t const &, pfc::is_unsigned_yes);
template <typename value_t> inline bool
   is_zero (value_t const & a);
template <typename value_t> inline std::istream &
   read_ptr (std::istream & in, value_t * const ptr, int const count = 1);
template <typename value_t> inline std::istream &
   read (std::istream & in, value_t & val);
template <typename value_t> inline std::ostream &
   write_ptr (std::ostream & out, value_t const * const ptr, int const count = 1);
template <typename value_t> inline std::ostream &
   write (std::ostream & out, value_t const & val);

#endif   // HAVE_NO_PFC

// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------

class bitmap {
   #pragma pack (push, 1)

   struct file_header_t {
      union {
         pfc::byte_t signature [2];   // file type; must be 'BM'
         pfc::word_t type;            // file type; must be 0x4d42
      };

      pfc::dword_t size;         // size, in bytes, of the bitmap file
      pfc::word_t  reserved_1;   // reserved; must be 0
      pfc::word_t  reserved_2;   // reserved; must be 0
      pfc::dword_t offset;       // offset, in bytes, from the beginning of the 'file_header_t' to the bitmap bits
   };

   struct info_header_t {
      pfc::dword_t size;            // number of bytes required by the structure
      pfc::long_t  width;           // width of the bitmap, in pixels
      pfc::long_t  height;          // height of the bitmap, in pixels
      pfc::word_t  planes;          // number of planes for the target device; must be 1
      pfc::word_t  bit_count;       // number of bits per pixel
      pfc::dword_t compression;     // type of compression; 0 for uncompressed RGB
      pfc::dword_t size_image;      // size, in bytes, of the image
      pfc::long_t  x_pels_pm;       // horizontal resolution, in pixels per meter
      pfc::long_t  y_pels_pm;       // vertical resolution, in pixels per meter
      pfc::dword_t clr_used;        // number of color indices in the color table
      pfc::dword_t clr_important;   // number of color indices that are considered important
   };

   #pragma pack (pop)

   public:
      bitmap () {
         create (0, 0);
      }

      bitmap (int const width, int const height, pfc::byte_t * p_image = nullptr) {
         create (width, height, p_image);
      }

      explicit bitmap (char const * const p_filename) {
         create (0, 0); from_file (p_filename);
      }

      explicit bitmap (std::string const & filename) {
         create (0, 0); from_file (filename);
      }

      explicit bitmap (std::istream & in) {
         create (0, 0); from_stream (in);
      }

      bitmap (bitmap const & src) {   // copy construction
         create (0, 0); copy (src);
      }

      bitmap (bitmap && src) {   // move construction
         create (0, 0); swap (src);
      }

      bitmap & operator = (bitmap const & rhs) {   // copy assignment
         if (&rhs != this) {
            bitmap tmp (rhs); swap (tmp);
         }

         return *this;
      }

      bitmap & operator = (bitmap && rhs) {   // move assignment
         swap (rhs); return *this;
      }

      void clear () {
         create (0, 0);
      }

      void create (int const width, int const height, pfc::byte_t * p_image = nullptr) {
//       assert (((width * 3) % 4 == 0) && "a scanline must end on a 32-bit boundary");

         pfc::mem_reset (m_file_header);
         pfc::mem_reset (m_info_header);

         m_file_header.type       = 0x4d42;
         m_file_header.size       = pfc::dword_t (sizeof (file_header_t) + sizeof (info_header_t) + size_image (width, height));
         m_file_header.offset     = static_cast <pfc::dword_t> (sizeof (file_header_t) + sizeof (info_header_t));

         m_info_header.size       = sizeof (info_header_t);
         m_info_header.width      = pfc::long_t (width);
         m_info_header.height     = pfc::long_t (height);
         m_info_header.planes     = 1;
         m_info_header.bit_count  = c_bit_count;
         m_info_header.size_image = pfc::dword_t (size_image (width, height));

         pfc::mem_set_ptr (
            (m_p_image = (p_image == nullptr) ? pointer_pair <pfc::byte_t> (allocate <pfc::byte_t> (m_info_header.size_image))
                                              : pointer_pair <pfc::byte_t> (p_image)).get (),
            0xff,
            m_info_header.size_image
         );
      }

      bool from_file (char const * const p_filename) {
         bool ok = false;

         if (!pfc::cstr_empty (p_filename)) {
            std::ifstream in (p_filename, std::ios_base::binary); ok = from_stream (in);
         }

         return ok;
      }

      bool from_file (std::string const & filename) {
         return from_file (filename.c_str ());
      }

      bool from_stream (std::istream & in) {
         bool ok = false;

         if (in.good ()) {
            clear ();

            pfc::read (in, m_file_header);
            pfc::read (in, m_info_header);

            if (is_valid (m_file_header) && is_valid (m_info_header)) {
               pfc::read_ptr (
                  in,
                  (m_p_image = pointer_pair <pfc::byte_t> (allocate <pfc::byte_t> (m_info_header.size_image))).get (),
                  m_info_header.size_image
               );

               ok = in.good ();
            } else {
               clear ();
            }
         }

         return ok;
      }

      int get_height () const {
         return m_info_header.height;
      }

      pfc::byte_t * get_image () {
         return m_p_image.get ();
      }

      pfc::byte_t const * get_image () const {
         return m_p_image.get ();
      }

      pfc::byte_t * get_image_byte () {
         return (pfc::byte_t *) get_image ();
      }

      pfc::byte_t const * get_image_byte () const {
         return (pfc::byte_t const *) get_image ();
      }

      pfc::RGB_3_t * get_image_RGB_3 () {
         return (pfc::RGB_3_t *) get_image ();
      }

      int get_image_size () const {
         return size_image (m_info_header.width, m_info_header.height);
      }

      int get_num_pixels () const {
         return get_width () * get_height ();
      }

      int get_width () const {
         return m_info_header.width;
      }

      void swap (bitmap & bmp) {
         if (&bmp != this) {
            std::swap (m_file_header, bmp.m_file_header);
            std::swap (m_info_header, bmp.m_info_header);
            std::swap (m_p_image,     bmp.m_p_image);
         }
      }

      bool to_file (char const * const p_filename) const {
         bool ok = false;

         if (!pfc::cstr_empty (p_filename)) {
            std::ofstream out (p_filename, std::ios_base::binary); ok = to_stream (out);
         }

         return ok;
      }

      bool to_file (std::string const & filename) const {
         return to_file (filename.c_str ());
      }

      bool to_stream (std::ostream & out) const {
         bool ok = false;

         if (out.good ()) {
            pfc::write     (out, m_file_header);
            pfc::write     (out, m_info_header);
            pfc::write_ptr (out, m_p_image.get (), m_info_header.size_image);

            ok = out.good ();
         }

         return ok;
      }

   private:
      template <typename value_t> static std::unique_ptr <pfc::byte_t []> allocate (int const size) {
         return std::unique_ptr <pfc::byte_t []> ((size > 0) ? new value_t [size] : nullptr);
      }

      static bool is_valid (file_header_t const & hdr) {
         return (hdr.type       == 0x4d42) &&
                (hdr.size       >= sizeof (file_header_t) + sizeof (info_header_t)) &&
                (hdr.reserved_1 == 0) &&
                (hdr.reserved_2 == 0) &&
                (hdr.offset     == sizeof (file_header_t) + sizeof (info_header_t));
      }

      static bool is_valid (info_header_t const & hdr) {
         return  (hdr.size              == sizeof (info_header_t)) &&
                 (hdr.planes            == 1) &&
                 (hdr.bit_count         == c_bit_count) &&
                 (hdr.compression       == 0) &&
                ((hdr.size_image        == 0) ||
                 (hdr.size_image        == static_cast <pfc::dword_t> (size_image (hdr.width, hdr.height)))) &&
                 (hdr.clr_used          == 0) &&
                 (hdr.clr_important     == 0) &&
                 (size_line (hdr.width) == size_scanline (hdr.width));
      }

      static int size_image (int const width, int const height) {
         return size_scanline (width) * height;
      }

      static int size_line (int const width) {
         return width * c_bpp;
      }

      static int size_scanline (int const width) {   // a scanline must end on a 32-bit boundary
         return pfc::ceil_div (size_line (width), int (4)) << 2;
      }

      void copy (bitmap const & src) {
         if (&src != this) {
            pfc::mem_copy (m_file_header, src.m_file_header);
            pfc::mem_copy (m_info_header, src.m_info_header);

            pfc::mem_copy_ptr (
               (m_p_image = pointer_pair <pfc::byte_t> (allocate <pfc::byte_t> (src.m_info_header.size_image))).get (),
               src.m_p_image.get (),
               src.m_info_header.size_image
            );
         }
      }

      template <typename T> class pointer_pair {
         public:
            pointer_pair () : m_ptr (nullptr), m_unique (nullptr) {
            }

            explicit pointer_pair (T * const ptr) : m_ptr (ptr), m_unique (nullptr) {
            }

            explicit pointer_pair (std::unique_ptr <T []> && unique) : m_ptr (nullptr), m_unique (std::move (unique)) {
            }

            pointer_pair (pointer_pair && src) : m_ptr (src.m_ptr), m_unique (std::move (src.m_unique)) {   // move construction
               src.m_ptr = nullptr;
            }

            pointer_pair & operator = (pointer_pair && rhs) {   // move assignment
               if (&rhs != this) {
                  m_ptr = rhs.m_ptr; m_unique = std::move (rhs.m_unique); rhs.m_ptr = nullptr;
               }

               return *this;
            }

            T * get () const {
               return (m_ptr != nullptr) ? m_ptr : m_unique.get ();
            }

         private:
                           pointer_pair (pointer_pair const &);   // no copy construction
            pointer_pair & operator =   (pointer_pair const &);   // no copy assignment

            T *                    m_ptr;
            std::unique_ptr <T []> m_unique;
      };

      static pfc::word_t const c_bit_count = 24;                 //
      static pfc::word_t const c_bpp       = c_bit_count >> 3;   // bytes per pixel

      file_header_t              m_file_header;
      info_header_t              m_info_header;
      pointer_pair <pfc::byte_t> m_p_image;
};

// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------

template <typename value_t> inline value_t & mem_copy (value_t & dst, value_t const & src) {
   pfc::mem_copy_ptr (&dst, &src, 1); return dst;
}

template <typename value_t> inline value_t * mem_copy_ptr (value_t * const p_dst, value_t const * const p_src, int const size) {
   if ((p_dst != nullptr) && (p_src != nullptr) && (size > 0)) {
      std::memcpy (p_dst, p_src, size * sizeof (value_t));
   }

   return p_dst;
}

template <typename value_t> inline value_t & mem_reset (value_t & dst) {
   return pfc::mem_set (dst);
}

template <typename value_t> inline value_t & mem_set (value_t & dst, int const c) {
   pfc::mem_set_ptr (&dst, c, 1); return dst;
}

template <typename value_t> inline value_t * mem_set_ptr (value_t * const p_dst, int const c, int const size) {
   if ((p_dst != nullptr) && (size > 0)) {
      std::memset (p_dst, c, size * sizeof (value_t));
   }

   return p_dst;
}

inline void swap (bitmap & lhs, bitmap & rhs) {
   lhs.swap (rhs);
}

#if defined HAVE_NO_PFC

template <typename value_t> inline value_t abs (value_t const & a) {
   return pfc::abs (a, std::is_unsigned <value_t> ());
}

template <typename value_t> inline value_t abs (value_t const & a, pfc::is_unsigned_no) {
   return pfc::is_negative (a) ? -a : a;
}

template <typename value_t> inline value_t abs (value_t const & a, pfc::is_unsigned_yes) {
   return a;
}

template <typename value_t> inline value_t ceil_div (value_t const & a, value_t const & b) {
   static_assert (
      std::is_integral <value_t>::value,
      "PFC: The parameters of 'pfc::ceil_div' must be of integral type."
   );

   auto const m = pfc::abs (a) % b;

   if (pfc::is_zero (m)) {
      return a / b;

   } else if (pfc::is_negative (a)) {
      return (a + m) / b;

   } else {
      return (a + (b - m)) / b;
   }
}

template <typename char_t> inline bool cstr_empty (char_t * const p_cstr) {
   return (p_cstr == nullptr) || (*p_cstr == char_t ());
}

template <typename value_t> inline bool is_negative (value_t const & a) {
   return pfc::is_negative (a, std::is_unsigned <value_t> ());
}

template <typename value_t> inline bool is_negative (value_t const & a, pfc::is_unsigned_no) {
   static auto const zero = value_t (); return a < zero;
}

template <typename value_t> inline bool is_negative (value_t const &, pfc::is_unsigned_yes) {
   return false;
}

template <typename value_t> inline bool is_zero (value_t const & a) {
   static auto const zero = value_t (); return !((a < zero) || (zero < a));
}

template <typename value_t> inline std::istream & read_ptr (std::istream & in, value_t * const ptr, int const count) {
   if (in.good () && (ptr != nullptr) && (count > 0)) {
      in.read ((char *) ptr, count * sizeof (value_t));
   }

   return in;
}

template <typename value_t> inline std::istream & read (std::istream & in, value_t & val) {
   return pfc::read_ptr (in, &val, 1);
}

template <typename value_t> inline std::ostream & write_ptr (std::ostream & out, value_t const * const ptr, int const count) {
   if (out.good () && (ptr != nullptr) && (count > 0)) {
      out.write ((char *) ptr, count * sizeof (value_t));
   }

   return out;
}

template <typename value_t> inline std::ostream & write (std::ostream & out, value_t const & val) {
   return pfc::write_ptr <value_t> (out, &val, 1);
}

#endif   // HAVE_NO_PFC

// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------

}   // namespace pfc

#endif   // PFC_BITMAP_H
