 //       $Id: pfc_cuda_timer.h 30260 2015-12-29 11:08:06Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_cuda_timer.h $
// $Revision: 30260 $
//     $Date: 2015-12-29 12:08:06 +0100 (Di., 29 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_CUDA_TIMER_H
#define      PFC_CUDA_TIMER_H

#include "./pfc_cuda_exception.h"

namespace pfc { namespace cuda {

// -------------------------------------------------------------------------------------------------

class timer final {
   public:
      using value_t = float;   // type is from 'cudaEventElapsedTime'

      explicit timer (bool const start_immediately = false) {
         PFC_CUDA_CHECK (cudaEventCreate (&m_start));
         PFC_CUDA_CHECK (cudaEventCreate (&m_stop));

         if (start_immediately) {
            start ();
         }
      }

      timer (timer && tmp) {
         std::memcpy (this, &tmp, sizeof (timer)); tmp.m_moved_from = true;
      }

      timer & operator = (timer && tmp) {
         if (&tmp != this) {
            PFC_CUDA_CHECK (cudaEventDestroy (m_stop));
            PFC_CUDA_CHECK (cudaEventDestroy (m_start));

            std::memcpy (this, &tmp, sizeof (timer)); tmp.m_moved_from = true;
         }

         return *this;
      }

                   timer (timer const &) = delete;   // no copy construction
      timer & operator = (timer const &) = delete;   // no copy assignment

     ~timer () {
         if (!m_moved_from) {
            stop ();

            PFC_CUDA_CHECK (cudaEventDestroy (m_stop));
            PFC_CUDA_CHECK (cudaEventDestroy (m_start));
         }
      }

      bool const & did_run () const {
         return m_did_run;
      }

      value_t get_elapsed () const {
         return get_elapsed_s ();
      }

      int get_elapsed_ms () const {
         return static_cast <int> (m_elapsed);
      }

      value_t get_elapsed_s () const {
         return m_elapsed / value_t (1000);
      }

      bool const & is_running () const {
         return m_running;
      }

      void reset () {
         stop ();

         m_did_run = false;
         m_elapsed = 0;
      }

      timer & start () {
         if (!m_running) {
            PFC_CUDA_CHECK (cudaEventRecord (m_start, 0));

            m_elapsed = 0;
            m_running = true;
         }

         return *this;
      }

      timer & stop () {
         if (m_running) {
            PFC_CUDA_CHECK (cudaEventRecord (m_stop, 0));
            PFC_CUDA_CHECK (cudaEventSynchronize (m_stop));
            PFC_CUDA_CHECK (cudaEventElapsedTime (&m_elapsed, m_start, m_stop));   // in ms (with a resolution of approximately 1/2 us)

            m_did_run = true;
            m_running = false;
         }

         return *this;   // get_elapsed_s ()
      }

   private:
      bool        m_did_run    = false;     // the timer ran at least once
      value_t     m_elapsed    = 0;         // elapsed time [ms]
      bool        m_moved_from = false;     //
      bool        m_running    = false;     // the timer is currently running
      cudaEvent_t m_start      = nullptr;   //
      cudaEvent_t m_stop       = nullptr;   //
};

// -------------------------------------------------------------------------------------------------

} }   // namespace cuda, namespace pfc

#endif   // PFC_CUDA_TIMER_H
