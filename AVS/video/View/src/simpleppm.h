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

#ifdef __cplusplus
extern "C" {
#endif

typedef struct {
  unsigned char *data;
  unsigned int width, height;
  unsigned int maxcol;
} RGB;

typedef struct {
	double * data;
	unsigned int width, height;
} YCbCr;

int PPM_load(RGB* ppm, char* filename);
int PPM_save(RGB* ppm, char* filename);

#ifdef __cplusplus
}
#endif

#endif
