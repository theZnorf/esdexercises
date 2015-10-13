#include <SDL/SDL.h>
#include "simpleppm.h"
static void render(SDL_Surface * sf)
{
    SDL_Surface * screen = SDL_GetVideoSurface();
    if(SDL_BlitSurface(sf, NULL, screen, NULL) == 0)
        SDL_UpdateRect(screen, 0, 0, 0, 0);
}


int main(int argc, char *argv[]) {
  PPM* input;
  int  stop = 0;
  SDL_Event event;
  SDL_Surface* surface;

  char filename[256]; 
  int frames, duration;
  int cnt;

  frames=atoi(argv[2]);
  duration=atoi(argv[3]);

  input=malloc(frames*sizeof(PPM));

  for (int i=0; i<frames; i++){
    sprintf(filename,"%s_%05d.ppm",argv[1],i+1);
    PPM_load(&(input[i]), filename);
  } 

  SDL_Init(SDL_INIT_EVERYTHING);
  SDL_WM_SetCaption(argv[1], NULL);

  SDL_SetVideoMode(input[0].width, input[0].height, 32, SDL_HWSURFACE|SDL_DOUBLEBUF);
  surface= SDL_CreateRGBSurfaceFrom( input[0].data, input[0].width, input[0].height, 
           24, input[0].width*3, 0x0000FF, 0x0000FF00, 0x00FF0000, 0);
  cnt=0; 
  while (!stop) {
    SDL_PollEvent(&event);
    SDL_Delay(duration );
    surface->pixels=input[cnt].data;
    render(surface);
    cnt++; if (cnt==frames) cnt=0;
    if (event.type == SDL_QUIT)  stop = 1;
  }
  SDL_Quit();
  return 0;
}
