#ifndef KERNELFRACTALCALCULATION_H
#define KERNELFRACTALCALCULATION_H

#include <cuda_runtime.h>
#include "bitmap.h"
#include "JuliaFractalCalculationCUDA.h"
#include "JuliaPixelCalculation.h"
#include "complex.h"

////////////////// Version 0 ////////////////////////////////////
void FractalCalculationWrapperV0(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * dp_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc);

void FractalCalculationWrapperV0(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * dp_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc);

////////////////// Version 1 ////////////////////////////////////
void FractalCalculationWrapperV1(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc);

void FractalCalculationWrapperV1(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc);

////////////////// Version 2 ////////////////////////////////////
void FractalCalculationWrapperV2(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc);

void FractalCalculationWrapperV2(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc);

////////////////// Version 3 ////////////////////////////////////
void FractalCalculationWrapperV3(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc,
    size_t const pixelPerThread);

void FractalCalculationWrapperV3(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc,
    size_t const pixelPerThread);


////////////////// Version 4 ////////////////////////////////////
void FractalCalculationWrapperV4(dim3 const blockDimension, dim3 const threadDimension,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc,
    size_t const pixelPerThread);

void FractalCalculationWrapperV4(dim3 const blockDimension, dim3 const threadDimension,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc,
    size_t const pixelPerThread);

#endif