//       $Id: snippet-5.h 29419 2015-10-13 06:46:29Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Fractals/src/snippet-5.h $
// $Revision: 29419 $
//     $Date: 2015-10-13 08:46:29 +0200 (Di., 13 Okt 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $
//
//   Remarks: Provides CUDA-timer functionality.
//     Types: pfc::cuda_timer
// Functions:

#ifndef CUDATIMER_H
#define CUDATIMER_H

namespace pfc {

class cuda_timer {
   public:
      cuda_timer () : m_running (false) {
         pfc::check (cudaEventCreate (&m_start));
         pfc::check (cudaEventCreate (&m_stop));
      }

     ~cuda_timer () {
         stop ();

         pfc::check (cudaEventDestroy (m_stop));
         pfc::check (cudaEventDestroy (m_start));
      }

      void start () {
         if (!m_running) {
            pfc::check (cudaEventRecord (m_start, 0)); m_running = true;
         }
      }

      double stop () {
         float elapsed = 0;

         if (m_running) {
            pfc::check (cudaEventRecord (m_stop, 0));
            pfc::check (cudaEventSynchronize (m_stop));
            pfc::check (cudaEventElapsedTime (&elapsed, m_start, m_stop));   // milliseconds with a resolution of around 0.5 microseconds

            m_running = false;
         }

         return elapsed / 1000.0;   // return elapsed time in seconds
      }

   private:
                   cuda_timer (cuda_timer const &);   // no copy construction
      cuda_timer & operator = (cuda_timer const &);   // no copy assignment

      bool        m_running;
      cudaEvent_t m_start;
      cudaEvent_t m_stop;
};

}   // namespace pfc

#endif