#ifndef AVS_H
#define AVS_H

#include "simpleppm.h"

#ifdef __cplusplus
extern "C" {
#endif

typedef struct
{
    unsigned char R;
    unsigned char G;
    unsigned char B;
} RgbPixel;

typedef struct
{
    unsigned char Y;
    unsigned char Cb;
    unsigned char Cr;
} YCbCrPixel;

void CreateBnWMeanRGB(PPM * image);

void CreateBnWGreen(PPM * image);

void RgbToYCbCrImage(PPM * image);

void YCbCrToRgbImage(PPM * image);

YCbCrPixel RgbToYCrCb(RgbPixel const * const pixel);
RgbPixel YCbCrToRgb(YCbCrPixel const * const pixel);

#ifdef __cplusplus
}
#endif

#endif
