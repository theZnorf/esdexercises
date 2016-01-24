//       $Id: pfc_opengl.cpp 30323 2016-01-04 14:31:15Z p20068 $
//      $URL: https://svn01.fh-hagenberg.at/bin/cepheiden/vocational/teaching/ESD/SPS3/2015-WS/Ablauf/src/Filters/src/host/pfc_opengl.cpp $
// $Revision: 30323 $
//     $Date: 2016-01-04 15:31:15 +0100 (Mo., 04 Jän 2016) $
//   Creator: Ch. Angerer, NVIDIA, J. Demouth, NVIDIA, peter.kulczycki<AT>fh-hagenberg.at
//   $Author: p20068 $

#include "./pfc_opengl.h"

#if defined WITH_OPENGL

#include "./pfc_filters.h"

#include <cuda_gl_interop.h>

#include <algorithm>
#include <iostream>
#include <stdexcept>

namespace pfc { namespace opengl {

// -------------------------------------------------------------------------------------------------

namespace {
   GLuint                 buffer   = 0;
   cudaGraphicsResource * resource = nullptr;
   GLuint                 texture  = 0;
}

// -------------------------------------------------------------------------------------------------

void callback_cleanup () {
   PFC_CUDA_CHECK (cudaGraphicsUnregisterResource (pfc::opengl::resource));

   PFC_OPENGL_CHECK (glDeleteBuffers  (1, &pfc::opengl::buffer));
   PFC_OPENGL_CHECK (glDeleteTextures (1, &pfc::opengl::texture));

   pfc::cleanup ();
}

void callback_display () {
   pfc::pixel_t * dp_dst = nullptr;
   std::size_t    size   = 0;

// map the pixel buffer object (PBO) and calculate the image

   PFC_CUDA_CHECK (cudaGraphicsMapResources (1, &pfc::opengl::resource));
   PFC_CUDA_CHECK (cudaGraphicsResourceGetMappedPointer (pfc::to_pp_void (&dp_dst), &size, pfc::opengl::resource));

   if (static_cast <int> (size) != PFC_CONFIG.pixels_total () * sizeof (pfc::pixel_t)) {
      throw std::runtime_error ("Wrong PBO size");
   }

   pfc::cuda_calculate (dp_dst);

   PFC_CUDA_CHECK (cudaGraphicsUnmapResources (1, &pfc::opengl::resource));

// prepare the texture

   PFC_OPENGL_CHECK (glClear (GL_COLOR_BUFFER_BIT));
   PFC_OPENGL_CHECK (glBindTexture (GL_TEXTURE_2D, pfc::opengl::texture));
   PFC_OPENGL_CHECK (glBindBuffer (GL_PIXEL_UNPACK_BUFFER, pfc::opengl::buffer));

   if (pfc::config::show ().is (pfc::config::rgba)) {
      PFC_OPENGL_CHECK (glTexImage2D (GL_TEXTURE_2D, 0, GL_RGBA,      PFC_CONFIG.img_w, PFC_CONFIG.img_h, 0, GL_RGBA,      GL_UNSIGNED_BYTE, NULL));
   } else {
      PFC_OPENGL_CHECK (glTexImage2D (GL_TEXTURE_2D, 0, GL_LUMINANCE, PFC_CONFIG.img_w, PFC_CONFIG.img_h, 0, GL_LUMINANCE, GL_UNSIGNED_BYTE, NULL));
   }

   PFC_OPENGL_CHECK (glBindBuffer (GL_PIXEL_UNPACK_BUFFER, 0));

// set the texture parameters

   PFC_OPENGL_CHECK (glDisable (GL_DEPTH_TEST));
   PFC_OPENGL_CHECK (glEnable (GL_TEXTURE_2D));

   PFC_OPENGL_CHECK (glTexParameterf (GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR));
   PFC_OPENGL_CHECK (glTexParameterf (GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR));
   PFC_OPENGL_CHECK (glTexParameterf (GL_TEXTURE_2D, GL_TEXTURE_WRAP_S,     GL_REPEAT));
   PFC_OPENGL_CHECK (glTexParameterf (GL_TEXTURE_2D, GL_TEXTURE_WRAP_T,     GL_REPEAT));

// show the image

   glBegin (GL_QUADS);
      glVertex2f   (0.0f, 0.0f);
      glTexCoord2f (0.0f, 1.0f);

      glVertex2f   (0.0f, 1.0f);
      glTexCoord2f (1.0f, 1.0f);

      glVertex2f   (1.0f, 1.0f);
      glTexCoord2f (1.0f, 0.0f);

      glVertex2f   (1.0f, 0.0f);
      glTexCoord2f (0.0f, 0.0f);
   glEnd ();

   glBindTexture (GL_TEXTURE_2D, 0);
   glutSwapBuffers ();
}

void callback_keyboard (unsigned char key, int, int) {
        if (std::string ("Qq\x1b").find (key) != std::string::npos) std::exit (1);   // glutLeaveMainLoop ();
   else if (std::string ("Bb"    ).find (key) != std::string::npos) pfc::config::show ().invert         (pfc::config::blur);
   else if (std::string ("Ee"    ).find (key) != std::string::npos) pfc::config::show ().invert         (pfc::config::edge);
   else if (std::string ("Gg"    ).find (key) != std::string::npos) pfc::config::show ().set_excusively (pfc::config::gray);
   else if (std::string ("Rr\x20").find (key) != std::string::npos) pfc::config::show ().set_excusively (pfc::config::rgba);

   PFC_OPENGL_CHECK (glutPostRedisplay ());
}

void callback_reshape (int x, int y) {
   PFC_OPENGL_CHECK (glViewport (0, 0, x, y));
   PFC_OPENGL_CHECK (glMatrixMode (GL_PROJECTION));
   PFC_OPENGL_CHECK (glLoadIdentity ());
   PFC_OPENGL_CHECK (glOrtho (0, 1, 0, 1, 0, 1));
   PFC_OPENGL_CHECK (glMatrixMode (GL_MODELVIEW));
   PFC_OPENGL_CHECK (glLoadIdentity ());
}

// -------------------------------------------------------------------------------------------------

void initialize (int & argc, char * * argv) {
   glutInit (&argc, argv);

   glutInitDisplayMode (GLUT_RGBA | GLUT_DOUBLE);
   glutInitWindowSize (PFC_CONFIG.window_w (), PFC_CONFIG.window_h ());
   glutCreateWindow (pfc::config::app_title ());

   glewInit ();

   if (!glewIsSupported ("GL_VERSION_1_5 GL_ARB_vertex_buffer_object GL_ARB_pixel_buffer_object GL_ARB_texture_float")) {
      std::cout << "Failed to get the required OpenGL extensions.\n"
                   "Need OpenGL v1.5, GL_ARB_vertex_buffer_object, and GL_ARB_pixel_buffer_object.\n";
   } else {
//    create pixel buffer object (PBO)

      auto const size = PFC_CONFIG.pixels_total () * sizeof (pfc::pixel_t);   // buffer for rgba images (even if it contains gray images, 4 vs. 1 bpp)

      PFC_OPENGL_CHECK (glGenBuffers (1, &pfc::opengl::buffer));
      PFC_OPENGL_CHECK (glBindBuffer (GL_PIXEL_UNPACK_BUFFER, pfc::opengl::buffer));
      PFC_OPENGL_CHECK (glBufferData (GL_PIXEL_UNPACK_BUFFER, size, NULL, GL_STREAM_DRAW));
      PFC_OPENGL_CHECK (glBindBuffer (GL_PIXEL_UNPACK_BUFFER, 0));

//    register PBO with CUDA

      PFC_CUDA_CHECK (cudaGraphicsGLRegisterBuffer (&pfc::opengl::resource, pfc::opengl::buffer, cudaGraphicsMapFlagsWriteDiscard));

//    create OpenGL texture

      PFC_OPENGL_CHECK (glGenTextures (1, &pfc::opengl::texture));

//    register callback functions

      PFC_OPENGL_CHECK (glutDisplayFunc  (pfc::opengl::callback_display));
      PFC_OPENGL_CHECK (glutKeyboardFunc (pfc::opengl::callback_keyboard));
      PFC_OPENGL_CHECK (glutReshapeFunc  (pfc::opengl::callback_reshape));

      std::atexit (pfc::opengl::callback_cleanup);

//    PFC_OPENGL_CHECK (glutSetOption (GLUT_ACTION_ON_WINDOW_CLOSE, GLUT_ACTION_CONTINUE_EXECUTION));
//    PFC_OPENGL_CHECK (glutSetOption (GLUT_ACTION_ON_WINDOW_CLOSE, GLUT_ACTION_GLUTMAINLOOP_RETURNS));

//    print menu

      std::cout << "---------------------------------------\n"
                   "menu ----------------------------------\n"
                   "---------------------------------------\n"
                   "b:        toggle Blur (gaussian filter)\n"
                   "e:        toggle Edges (sobel filter)\n"
                   "g:        show Gray image\n"
                   "r, blank: show Rgba image\n"
                   "q, esc:   Quit\n"
                   "---------------------------------------\n\n";
   }
}

} }   // namespace opengl, namespace pfc

#endif   // WITH_OPENGL
