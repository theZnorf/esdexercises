#include <iostream>
#include <SDL/SDL.h>
#include "simpleppm.h"
#include "AVS.h"

static void render(SDL_Surface * sf)
{
    SDL_Surface * screen = SDL_GetVideoSurface();
    if(SDL_BlitSurface(sf, NULL, screen, NULL) == 0)
        SDL_UpdateRect(screen, 0, 0, 0, 0);
}

int main(int argc, char *argv[]) {
  RGB input;
  int  stop = 0;
  SDL_Event event;
  SDL_Surface* surface;

  PPM_load(&input, argv[1]);

  YCbCr ycbcrImg;
  ycbcrImg.height = input.height;
  ycbcrImg.width = input.width;
  ycbcrImg.data = new double[ycbcrImg.height * ycbcrImg.width * 3];

  RgbToYCbCrImage(&input, &ycbcrImg);
  YCbCrToRgbImage(&ycbcrImg, &input);
  
  SDL_Init(SDL_INIT_EVERYTHING);
  SDL_WM_SetCaption(argv[1], NULL);

  SDL_SetVideoMode(input.width, input.height, 32, SDL_HWSURFACE|SDL_DOUBLEBUF);
  
  surface= SDL_CreateRGBSurfaceFrom( input.data, input.width, input.height, 
           24, input.width*3, 0x0000FF, 0x0000FF00, 0x00FF0000, 0);

  while (!stop) {
    SDL_WaitEvent(&event);
    SDL_Delay(10);
    render(surface);
    if (event.type == SDL_QUIT)  stop = 1;
  }
  SDL_Quit();
  return 0;
}
