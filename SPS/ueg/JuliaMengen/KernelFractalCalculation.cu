#include "KernelFractalCalculation.cuh"

__global__ void FractalCalculation(pfc::complex<double> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight,
    pfc::RGB_3_t * dp_colorTable, size_t const colorTableSize,
    pfc::complex<double> const lowerLeft, double const stepX, double const stepY,
    julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc)
{
    julia::JuliaFractalCalculationCUDA<int, double>::CalcPixel(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, dp_colorTable, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc);
}

__global__ void FractalCalculation(pfc::complex<float> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight,
    pfc::RGB_3_t * dp_colorTable, size_t const colorTableSize,
    pfc::complex<float> const lowerLeft, float const stepX, float const stepY,
    julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc)
{
    julia::JuliaFractalCalculationCUDA<int, float>::CalcPixel(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, dp_colorTable, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc);
}

__host__ void FractalCalculationWrapper(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * dp_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc)
{
    FractalCalculation << < blockDimension, threadPerBlock >> > (c, dp_data, dataSize, imageWidth,
        imageHeight, dp_colorTable, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc);
}

__host__ void FractalCalculationWrapper(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * dp_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc)
{
    FractalCalculation << < blockDimension, threadPerBlock >> > (c, dp_data, dataSize, imageWidth,
        imageHeight, dp_colorTable, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc);
}