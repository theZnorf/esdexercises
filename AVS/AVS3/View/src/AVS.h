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
    double Y;
    double Cb;
    double Cr;
} YCbCrPixel;

void CreateBnWMeanRGB(RGB * image);

void CreateBnWGreen(RGB * image);

void RgbToYCbCrImage(RGB const * rgbImage, YCbCr * ycbcrImage);

void YCbCrToRgbImage(YCbCr const * ycbcrImage, RGB * rgbImage);

YCbCrPixel RgbToYCrCb(RgbPixel const * const pixel);
RgbPixel YCbCrToRgb(YCbCrPixel const * const pixel);

#ifdef __cplusplus
}
#endif

#endif
