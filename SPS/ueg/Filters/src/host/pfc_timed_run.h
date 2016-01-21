//       $Id: pfc_timed_run.h 30201 2015-12-25 17:37:20Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_timed_run.h $
// $Revision: 30201 $
//     $Date: 2015-12-25 18:37:20 +0100 (Fr., 25 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $
//
// Copyright: (c) 2015 Peter Kulczycki (peter.kulczycki<AT>fh-hagenberg.at)
//   License: Distributed under the Boost Software License, Version 1.0 (see
//            http://www.boost.org/LICENSE_1_0.txt).

#if !defined PFC_TIMED_RUN
#define      PFC_TIMED_RUN

#if !defined __CUDACC__
   //#include <boost/thread.hpp>
#endif

#include <chrono>
#include <functional>
#include <algorithm>

// --------------------------------------------------------------------------------------------------

#if defined _WINDOWS_
   #undef  PFC_WINDOWS_H_INCLUDED
   #define PFC_WINDOWS_H_INCLUDED
#endif

#undef  UNUSED
#define UNUSED(x) ((void) (x))

// --------------------------------------------------------------------------------------------------

namespace pfc {

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

// --------------------------------------------------------------------------------------------------

inline bool set_priority_to_realtime () {
   #if defined PFC_WINDOWS_H_INCLUDED
      return SetPriorityClass (GetCurrentProcess (), REALTIME_PRIORITY_CLASS) != 0;
   #else
      return true;
   #endif
}

inline bool warm_up_cpu (double const how_long = 5) {
   #if defined __CUDACC__
      UNUSED (how_long); return false;
   #else
      //int const  cores = std::max (1u, boost::thread::hardware_concurrency ());
      //auto const start = std::chrono::high_resolution_clock::now ();

      //boost::thread_group group;

      //for (auto i = 0; i < cores; ++i) {
      //   group.create_thread ([how_long, start] {
      //      while (std::chrono::duration <double> (std::chrono::high_resolution_clock::now () - start).count () < how_long);   // busy waiting for how_long seconds
      //   });
      //}

      //group.join_all (); return true;
   #endif
}

// --------------------------------------------------------------------------------------------------

template <typename timer_t = pfc::default_timer, typename fun_t, typename ...args_t> inline typename timer_t::duration timed_run (int const n, fun_t && fun, args_t && ...args) {
   auto       f     = std::bind (std::forward <fun_t> (fun), std::forward <args_t> (args)...);
   auto const start = timer_t::now ();

   for (auto i = 0; i < n; ++i) {
      f ();
   }

   auto const stop = timer_t::now (); return (stop - start) / std::max (1, n);
}

template <typename timer_t = pfc::default_timer, typename fun_t, typename ...args_t> inline typename timer_t::duration timed_run (fun_t && fun, args_t && ...args) {
   return pfc::timed_run <timer_t, fun_t, args_t...> (1, std::forward <fun_t> (fun), std::forward <args_t> (args)...);
}

template <typename duration_t> inline double speedup (duration_t const & serial, duration_t const & parallel) {
   static auto const zero = typename duration_t::rep (); return (parallel.count () != zero) ? 1.0 * serial.count () / parallel.count () : 0;
}

template <typename duration_t> inline double efficiency (duration_t const & serial, duration_t const & parallel, int const cores) {
   return (cores != 0) ? pfc::speedup (serial, parallel) / cores : 0;
}

}   // namespace pfc

// --------------------------------------------------------------------------------------------------

#endif   // PFC_TIMED_RUN
