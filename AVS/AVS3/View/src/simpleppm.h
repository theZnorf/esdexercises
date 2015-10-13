/*----------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------*/
/*-----------------Simplistic PPM format I/O library--------------------------*/
/*-----------------for educational purposes-----------------------------------*/
/*----------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------*/
/*-----(C) Andreas Wasserbauer------------------------------------------------*/
/*----------------------------------------------------------------------------*/


#ifndef _simpleppm_
#define _simpleppm_

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

typedef struct {
  unsigned char *data;
  unsigned int width, height;
  unsigned int maxcol;
}PPM;

int PPM_load(PPM* ppm, char* filename);
int PPM_save(PPM* ppm, char* filename);

#endif
