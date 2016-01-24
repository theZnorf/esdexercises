//       $Id: pfc_version.h 30323 2016-01-04 14:31:15Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_version.h $
// $Revision: 30323 $
//     $Date: 2016-01-04 15:31:15 +0100 (Mo., 04 Jän 2016) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_VERSION_H
#define      PFC_VERSION_H

#include "./pfc_cuda_macros.h"

#include <stdexcept>
#include <string>
#include <vector>

namespace pfc {

// -------------------------------------------------------------------------------------------------

class version final {
   public:
      version (int const n = 0, int const min = 0, int const max = 0) {
         if ((n < min) || (n > max) || (min > max)) {
            throw std::runtime_error ("Wrong version number");
         }

         m_max     = max;
         m_min     = min;
         m_version = n;

         m_names.resize (m_max - m_min + 1);
      }

      int const & as_int () const {
         return m_version;
      }

      std::string const & as_string () const {
         return m_names[m_version];
      }

      bool is (int const n) const {
         return m_version == n;
      }

      bool is_not (int const n) const {
         return m_version != n;
      }

      version & register_name (int const n, std::string const & name) {
         if ((n < m_min) || (n > m_max)) {
            throw std::runtime_error ("Wrong version number");
         }

         m_names[n - m_min] = name; return *this;
      }

   private:
      int                       m_max     = 0;
      int                       m_min     = 0;
      std::vector <std::string> m_names   = {};
      int                       m_version = 0;
};

// -------------------------------------------------------------------------------------------------

}   // namespace pfc

#endif   // PFC_VERSION_H
