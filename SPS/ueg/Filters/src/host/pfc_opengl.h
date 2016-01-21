//       $Id: pfc_opengl.h 30276 2015-12-31 15:46:29Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_opengl.h $
// $Revision: 30276 $
//     $Date: 2015-12-31 16:46:29 +0100 (Do., 31 Dez 2015) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#if !defined PFC_OPENGL_H
#define      PFC_OPENGL_H

#include "./pfc_config.h"

#if defined WITH_OPENGL

#include <GL/glew.h>
#include <GL/freeglut.h>

namespace pfc { namespace opengl {

void initialize (int & argc, char * * argv);

} }   // namespace opengl, namespace pfc

#endif   // WITH_OPENGL

#endif   // PFC_OPENGL_H
