#include "AVS.h"

void CreateBnWMeanRGB(PPM * image)
{
    int i = 0;
    int count = image->height * image->width * 3;
    unsigned char bnw = 0;

    for (; i < count; i += 3)
    {
        bnw = (image->data[i] + image->data[i + 1] + image->data[i + 2]) / 3;
        image->data[i] = bnw;
        image->data[i + 1] = bnw;
        image->data[i + 2] = bnw;
    }
}

void CreateBnWGreen(PPM * image)
{
    int i = 0;
    int count = image->height * image->width * 3;

    for (; i < count; i += 3)
    {
        image->data[i] = image->data[i + 1];
        image->data[i + 2] = image->data[i + 1];
    }
}


void RgbToYCrCbImage(PPM * image)
{
    int i = 0;
    int count = image->height * image->width * 3;
    unsigned char bnw = 0;
    double Y, Cb, Cr;


    for (; i < count; i += 3)
    {
        // calc Y Cb Cr
        Y = (0.299 * image->data[i] + 0.587 * image->data[i + 1] + 0.114 * image->data[i + 2]);
        Cb = ((image->data[i + 2] - Y) * 0.564 + 128);
        Cr = ((image->data[i] - Y) * 0.713 + 128);

        // set new values
        image->data[i] = (unsigned char)Y;
        image->data[i + 1] = (unsigned char)Cr;
        image->data[i + 2] = (unsigned char)Cb;
    }
}


void YCrCbToRgbImage(PPM * image)
{
    int i = 0;
    int count = image->height * image->width * 3;
    unsigned char bnw = 0;
    double r, g, b;


    for (; i < count; i += 3)
    {
        // calc r g b
        r = image->data[i] + 1.40200 * (image->data[i + 1] - 0x80);
        g = image->data[i] - 0.34414 * (image->data[i + 2] - 0x80) - 0.71414 * (image->data[i + 1] - 0x80);
        b = image->data[i] + 1.77200 * (image->data[i + 1] - 0x80);

        // set new values
        image->data[i] = (unsigned char)r;
        image->data[i + 1] = (unsigned char)g;
        image->data[i + 2] = (unsigned char)b;
    }
}
