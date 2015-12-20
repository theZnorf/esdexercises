//       $Id: snippet-7.h 29419 2015-10-13 06:46:29Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Fractals/src/snippet-7.h $
// $Revision: 29419 $
//     $Date: 2015-10-13 08:46:29 +0200 (Di., 13 Okt 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#ifndef TSCCLOCK_H
#define TSCCLOCK_H


#undef PFC_WINDOWS_H_INCLUDED

#if defined _WINDOWS_
   #define PFC_WINDOWS_H_INCLUDED
#endif

#include <chrono>
namespace pfc {

// --------------------------------------------------------------------------------------------------

#if defined PFC_WINDOWS_H_INCLUDED

struct tsc_clock {   // time stamp counter (cannot be converted to seconds since this is meaningless)
   using duration   = std::chrono::duration <decltype (__rdtsc ()), std::ratio <1, 1>>;
   using period     = duration::period;
   using rep        = duration::rep;
   using time_point = std::chrono::time_point <pfc::tsc_clock>;

   static bool const is_steady = false;

   static time_point now () {
      return time_point (duration (__rdtsc ()));
   }
};

using default_timer = pfc::tsc_clock;

#else

using default_timer = std::chrono::high_resolution_clock;

#endif   // PFC_WINDOWS_H_INCLUDED

template <typename timer_t = pfc::default_timer, typename fun_t, typename ...args_t> inline typename timer_t::duration timed_run (std::size_t const n, fun_t && fun, args_t && ...args) {
   auto       f     = std::bind (std::forward <fun_t> (fun), std::forward <args_t> (args)...);
   auto const start = timer_t::now ();

   for (std::size_t i = 0; i < n; ++i) {
      f ();
   }

   auto const stop = timer_t::now (); return (stop - start) / std::max <std::size_t> (1, n);
}

template <typename timer_t = pfc::default_timer, typename fun_t, typename ...args_t> inline typename timer_t::duration timed_run (int const n, fun_t && fun, args_t && ...args) {
   return pfc::timed_run <timer_t, fun_t, args_t...> (static_cast <std::size_t> (std::max (0, n)), std::forward <fun_t> (fun), std::forward <args_t> (args)...);
}

template <typename timer_t = pfc::default_timer, typename fun_t, typename ...args_t> inline typename timer_t::duration timed_run (fun_t && fun, args_t && ...args) {
   return pfc::timed_run <timer_t, fun_t, args_t...> (1u, std::forward <fun_t> (fun), std::forward <args_t> (args)...);
}

template <typename duration_t> inline double speedup (duration_t const & serial, duration_t const & parallel) {
   static auto const zero = typename duration_t::rep (); return (parallel.count () != zero) ? 1.0 * serial.count () / parallel.count () : 0;
}

template <typename duration_t> inline double efficiency (duration_t const & serial, duration_t const & parallel, std::size_t const cores) {
   return (cores != 0) ? pfc::speedup (serial, parallel) / cores : 0;
}

// --------------------------------------------------------------------------------------------------

}   // namespace pfc

#endif