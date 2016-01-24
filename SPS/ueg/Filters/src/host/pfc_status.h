//       $Id: pfc_status.h 30323 2016-01-04 14:31:15Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_status.h $
// $Revision: 30323 $
//     $Date: 2016-01-04 15:31:15 +0100 (Mo., 04 Jän 2016) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_STATUS_H
#define      PFC_STATUS_H

#include <map>
#include <stdexcept>
#include <string>
#include <tuple>
#include <vector>

namespace pfc {

// -------------------------------------------------------------------------------------------------

class status final {
   public:
      void register_state (int const state, std::string const & name) {
         if (m_states.find (state) != std::end (m_states)) {
            throw std::runtime_error ("State " + std::to_string (state) + " already registered");
         }

         m_states.emplace (state, std::forward_as_tuple (false, name));
      }

      status & clear (int const state) {
         std::get <0> (ref (state)) = false; return *this;
      }

      status & clear (std::vector <int> const & states) {
         for (auto const & s : states) {
            clear (s);
         }

         return *this;
      }

      status & clear_all () {
         for (auto & e : m_states) {
            std::get <0> (e.second) = false;
         }

         return *this;
      }

      std::string const & get_name (int const state) const {
         return std::get <1> (ref (state));
      }

      status & invert (int const state) {
         std::get <0> (ref (state)) = !std::get <0> (ref (state)); return *this;
      }

      status & invert (std::vector <int> const & states) {
         for (auto const & s : states) {
            invert (s);
         }

         return *this;
      }

      status & invert_all () {
         for (auto & e : m_states) {
            std::get <0> (e.second) = !std::get <0> (e.second);
         }

         return *this;
      }

      bool is_all_of (std::vector <int> const & states) const {
         for (auto const & s : states) {
            if (!is (s)) {
               return false;
            }
         }

         return true;
      }

      bool is_one_of (std::vector <int> const & states) const {
         for (auto const & s : states) {
            if (is (s)) {
               return true;
            }
         }

         return false;
      }

      bool const & is (int const state) const {
         return std::get <0> (ref (state));
      }

      status & set (int const state) {
         std::get <0> (ref (state)) = true; return *this;
      }

      status & set (std::vector <int> const & states) {
         for (auto const & s : states) {
            set (s);
         }

         return *this;
      }

      status & set_all () {
         for (auto & e : m_states) {
            std::get <0> (e.second) = true;
         }

         return *this;
      }

      status & set_excusively (int const state) {
         clear_all (); std::get <0> (ref (state)) = true; return *this;
      }

      status & set_excusively (std::vector <int> const & states) {
         clear_all ();

         for (auto const & s : states) {
            set (s);
         }

         return *this;
      }

   private:
      std::tuple <bool, std::string> const & ref (int const state) const {
         auto const f = m_states.find (state);

         if (f == std::end (m_states)) {
            throw std::runtime_error ("State " + std::to_string (state) + " not registered");
         }

         return f->second;
      }

      std::tuple <bool, std::string> & ref (int const state) {
         return const_cast <std::tuple <bool, std::string> &> (static_cast <status const &> (*this).ref (state));
      }

      std::map <int, std::tuple <bool, std::string>> m_states;
};

// -------------------------------------------------------------------------------------------------

}   // namespace pfc

#endif   // PFC_STATUS_H
