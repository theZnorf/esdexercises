//       $Id: snippet-6.h 29419 2015-10-13 06:46:29Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Fractals/src/snippet-6.h $
// $Revision: 29419 $
//     $Date: 2015-10-13 08:46:29 +0200 (Di., 13 Okt 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $
//
// Copyright: (c) 2013 Peter Kulczycki (peter.kulczycki<AT>fh-hagenberg.at)
//   License: Distributed under the Boost Software License, Version 1.0 (see
//            http://www.boost.org/LICENSE_1_0.txt).

#if !defined HPC_COMMON_COMPLEX_H
#define      HPC_COMMON_COMPLEX_H

#undef CUDA_ATTR_HOST_DEVICE

#if defined __CUDACC__   /* NVIDIA CUDA compiler */
   #define CUDA_ATTR_HOST_DEVICE __host__ __device__
#else
   #define CUDA_ATTR_HOST_DEVICE
#endif

#include <iostream>

// -------------------------------------------------------------------------------------------------

namespace pfc {

template <typename T> class complex {
   public:
      typedef T real_t;
      typedef T value_t;

      CUDA_ATTR_HOST_DEVICE complex (real_t const real = real_t (), real_t const imag = real_t ())
         : m_real (real)
         , m_imag (imag) {
      }

      CUDA_ATTR_HOST_DEVICE real_t norm () const {
         return m_real * m_real + m_imag * m_imag;
      }

      CUDA_ATTR_HOST_DEVICE complex & square () {
         real_t const r (m_real * m_real - m_imag * m_imag);

         m_imag = m_real * m_imag * 2;
         m_real = r;

         return *this;
      }

      CUDA_ATTR_HOST_DEVICE complex & operator += (complex const & rhs) {
         m_real += rhs.m_real;
         m_imag += rhs.m_imag;

         return *this;
      }

      CUDA_ATTR_HOST_DEVICE complex operator + (complex const & rhs) const {
         complex x (*this); x += rhs; return x;
      }

      CUDA_ATTR_HOST_DEVICE complex operator * (complex const & rhs) const {
         return complex (m_real * rhs.m_real - m_imag * rhs.m_imag,
                         m_imag * rhs.m_real + m_real * rhs.m_imag);
      }

      CUDA_ATTR_HOST_DEVICE real_t & real () {
         return m_real;
      }

      CUDA_ATTR_HOST_DEVICE real_t const & real () const {
         return m_real;
      }

      CUDA_ATTR_HOST_DEVICE real_t & real (real_t const real) {
         return m_real = real;
      }

      CUDA_ATTR_HOST_DEVICE real_t & imag () {
         return m_imag;
      }

      CUDA_ATTR_HOST_DEVICE real_t const & imag () const {
         return m_imag;
      }

      CUDA_ATTR_HOST_DEVICE real_t & imag (real_t const imag) {
         return m_imag = imag;
      }

   private:
      real_t m_real;
      real_t m_imag;
};

template <typename real_t> CUDA_ATTR_HOST_DEVICE inline real_t norm (pfc::complex <real_t> const & x) {
   return x.norm ();
}

template <typename real_t> CUDA_ATTR_HOST_DEVICE inline complex <real_t> & square (pfc::complex <real_t> & x) {
   return x.square ();
}

template <typename real_t> CUDA_ATTR_HOST_DEVICE inline std::ostream & operator << (std::ostream & out, pfc::complex <real_t> const & x) {
   return out << '{' << x.real () << ',' << x.imag () << '}';
}

}   // namespace pfc

// -------------------------------------------------------------------------------------------------

#endif   // HPC_COMMON_COMPLEX_H
