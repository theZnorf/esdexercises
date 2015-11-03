#include "AVS.h"

void CreateBnWMeanRGB(RGB * image)
{
    int count = image->height * image->width * 3;
    unsigned char bnw = 0;

    for (auto i = 0; i < count; i += 3)
    {
        bnw = (image->data[i] + image->data[i + 1] + image->data[i + 2]) / 3;
        image->data[i] = bnw;
        image->data[i + 1] = bnw;
        image->data[i + 2] = bnw;
    }
}

void CreateBnWGreen(RGB * image)
{
    int count = image->height * image->width * 3;

    for (auto i = 0; i < count; i += 3)
    {
        image->data[i] = image->data[i + 1];
        image->data[i + 2] = image->data[i + 1];
    }
}


void RgbToYCbCrImage(RGB const * rgbImage, YCbCr * ycbcrImage)
{
    int count = rgbImage->height * rgbImage->width * 3;

    for (auto i = 0; i < count; i += 3)
    {
    	auto ycbcrPixel = ((YCbCrPixel*)(&ycbcrImage->data[i]));

    	// calculate pixel
    	auto result = RgbToYCrCb((RgbPixel*)(&rgbImage->data[i]));

    	// set result
    	ycbcrPixel->Y = result.Y;
    	ycbcrPixel->Cb = result.Cb;
    	ycbcrPixel->Cr = result.Cr;
    }
}


void YCbCrToRgbImage(YCbCr const * ycbcrImage, RGB * rgbImage)
{
    int count = ycbcrImage->height * ycbcrImage->width * 3;

    for (auto i = 0; i < count; i += 3)
    {
    	auto rgbPixel = ((RgbPixel*)(&rgbImage->data[i]));

    	// calculate pixel
    	auto result = YCbCrToRgb((YCbCrPixel*)(&ycbcrImage->data[i]));

    	// set result
    	rgbPixel->R = result.R;
    	rgbPixel->G = result.G;
    	rgbPixel->B = result.B;
    }
}


YCbCrPixel RgbToYCrCb(RgbPixel const * const pixel)
{
	YCbCrPixel yPixel;

	yPixel.Y = 0.2990 * pixel->R + 0.5870 * pixel->G + 0.1140 * pixel->B;
	yPixel.Cb = -0.1689 * pixel->R - 0.3317 * pixel->G + 0.5006 * pixel->B + 128;
	yPixel.Cr = 0.4998 * pixel->R - 0.4185 * pixel->G - 0.0813 * pixel->B + 128;

	return yPixel;
}

RgbPixel YCbCrToRgb(YCbCrPixel const * const pixel)
{
	RgbPixel rgbPixel;

	rgbPixel.R = 1.0 * (pixel->Y) + 1.4025 * (pixel->Cr - 128);
	rgbPixel.G = 1.0 * (pixel->Y) - 0.3437 * (pixel->Cb - 128) - 0.7144 * (pixel->Cr - 128);
	rgbPixel.B = 1.0 * (pixel->Y) + 1.7699 * (pixel->Cb - 128);

	return rgbPixel;
}
