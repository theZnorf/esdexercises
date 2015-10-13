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
    unsigned char Cr;
    unsigned char Cb;
} YCrCbPixel;

void CreateBnWMeanRGB(PPM * image);

void CreateBnWGreen(PPM * image);

void RgbToYCrCbImage(PPM * image);

void YCrCbToRgbImage(PPM * image);

YCrCbPixel RgbToYCrCb(RgbPixel * pixel);
YCrCbPixel RgbToYCrCb(RgbPixel * pixel);

#ifdef __cplusplus
}
#endif

#endif
