//       $Id: pfc_opengl_exception.h 30276 2015-12-31 15:46:29Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_opengl_exception.h $
// $Revision: 30276 $
//     $Date: 2015-12-31 16:46:29 +0100 (Do., 31 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_OPENGL_EXCEPTION_H
#define      PFC_OPENGL_EXCEPTION_H

#include "./pfc_config.h"

#if defined WITH_OPENGL

#include <GL/glew.h>

#include <stdexcept>
#include <string>

// -------------------------------------------------------------------------------------------------

#undef  PFC_OPENGL_CHECK
#define PFC_OPENGL_CHECK(call) \
   (call, pfc::opengl::check (__FILE__, __LINE__))

// -------------------------------------------------------------------------------------------------

namespace pfc { namespace opengl {

class exception : public std::runtime_error {
   using inherited = std::runtime_error;

   public:
      explicit exception (GLenum const status, std::string const & file, int const line) : inherited (make_message (status, file, line)) {
      }

   private:
      static std::string make_message (GLenum const status, std::string const & file, int const line) {
         std::string message = "OPENGL error #";

         message += std::to_string (status);
         message += " '";
         message += reinterpret_cast <char const *> (gluErrorString (status));
         message += "' occurred";

         if (!file.empty () && (line > 0)) {
            message += " in file '";
            message += file;
            message += "' on line ";
            message += std::to_string (line);
         }

         return std::move (message);
      }
};

// -------------------------------------------------------------------------------------------------

inline void check (std::string const & file, int const line) {
   auto const status = glGetError ();

   if (status != GL_NO_ERROR) {
      throw pfc::opengl::exception (status, file, line);
   }
}

inline void check () {
   pfc::opengl::check ("", 0);
}

// -------------------------------------------------------------------------------------------------

} }   // namespace opengl, namespace pfc

#endif   // WITH_OPENGL

#endif   // PFC_OPENGL_EXCEPTION_H
