#include "KernelFractalCalculation.cuh"
#include "bitmap.h"
#include "cudautils.h"

//////////////////// Version 0 ///////////////////////////////
__global__ void FractalCalculationV0(pfc::complex<double> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight,
    pfc::RGB_3_t * dp_colorTable, size_t const colorTableSize,
    pfc::complex<double> const lowerLeft, double const stepX, double const stepY,
    julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc)
{
    julia::JuliaFractalCalculationCUDA<int, double>::CalcPixelV0(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, dp_colorTable, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc);
}

__global__ void FractalCalculationV0(pfc::complex<float> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight,
    pfc::RGB_3_t * dp_colorTable, size_t const colorTableSize,
    pfc::complex<float> const lowerLeft, float const stepX, float const stepY,
    julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc)
{
    julia::JuliaFractalCalculationCUDA<int, float>::CalcPixelV0(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, dp_colorTable, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc);
}


__host__ void FractalCalculationWrapperV0(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * dp_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc)
{
    FractalCalculationV0 <<< blockDimension, threadPerBlock >>> (c, dp_data, dataSize, imageWidth,
        imageHeight, dp_colorTable, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc);
}

__host__ void FractalCalculationWrapperV0(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * dp_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc)
{
    FractalCalculationV0 <<< blockDimension, threadPerBlock >>> (c, dp_data, dataSize, imageWidth,
        imageHeight, dp_colorTable, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc);
}


///////////////////////////// Version 1 /////////////////////////////////////////
__constant__ pfc::RGB_3_t constColorTableV1[512];


__global__ void FractalCalculationV1(pfc::complex<double> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight, size_t const colorTableSize,
    pfc::complex<double> const lowerLeft, double const stepX, double const stepY,
    julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc)
{
    julia::JuliaFractalCalculationCUDA<int, double>::CalcPixelV0(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, constColorTableV1, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc);
}

__global__ void FractalCalculationV1(pfc::complex<float> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight, size_t const colorTableSize,
    pfc::complex<float> const lowerLeft, float const stepX, float const stepY,
    julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc)
{
    julia::JuliaFractalCalculationCUDA<int, float>::CalcPixelV0(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, constColorTableV1, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc);
}

__host__ void FractalCalculationWrapperV1(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc)
{
    // copy color table
    cudautils::symbolmemcopy(constColorTableV1, p_colorTable, colorTableSize);

    FractalCalculationV1 <<< blockDimension, threadPerBlock >>> (c, dp_data, dataSize, imageWidth,
        imageHeight, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc);
}

__host__ void FractalCalculationWrapperV1(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc)
{
    // copy color table
    cudautils::symbolmemcopy(constColorTableV1, p_colorTable, colorTableSize);

    FractalCalculationV1 <<< blockDimension, threadPerBlock >>> (c, dp_data, dataSize, imageWidth,
        imageHeight, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc);
}


///////////////////////////// Version 2 /////////////////////////////////////////

__global__ void FractalCalculationV2(pfc::complex<double> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight, size_t const colorTableSize,
    pfc::complex<double> const lowerLeft, double const stepX, double const stepY,
    julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc)
{
    julia::JuliaFractalCalculationCUDA<int, double>::CalcPixelV2(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, constColorTableV1, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc);
}

__global__ void FractalCalculationV2(pfc::complex<float> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight, size_t const colorTableSize,
    pfc::complex<float> const lowerLeft, float const stepX, float const stepY,
    julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc)
{
    julia::JuliaFractalCalculationCUDA<int, float>::CalcPixelV2(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, constColorTableV1, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc);
}

__host__ void FractalCalculationWrapperV2(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc)
{
    // copy color table
    cudautils::symbolmemcopy(constColorTableV1, p_colorTable, colorTableSize);

    FractalCalculationV2 << < blockDimension, threadPerBlock >> > (c, dp_data, dataSize, imageWidth,
        imageHeight, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc);
}

__host__ void FractalCalculationWrapperV2(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc)
{
    // copy color table
    cudautils::symbolmemcopy(constColorTableV1, p_colorTable, colorTableSize);

    FractalCalculationV2 << < blockDimension, threadPerBlock >> > (c, dp_data, dataSize, imageWidth,
        imageHeight, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc);
}

///////////////////////////// Version 3 /////////////////////////////////////////

__global__ void FractalCalculationV3(pfc::complex<double> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight, size_t const colorTableSize,
    pfc::complex<double> const lowerLeft, double const stepX, double const stepY,
    julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc, size_t const pixelPerThread)
{
    // calculate pixel
    julia::JuliaFractalCalculationCUDA<int, double>::CalcPixelV3(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, constColorTableV1, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc, pixelPerThread);
}

__global__ void FractalCalculationV3(pfc::complex<float> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight, size_t const colorTableSize,
    pfc::complex<float> const lowerLeft, float const stepX, float const stepY,
    julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc, size_t const pixelPerThread)
{
    // calculate pixel
    julia::JuliaFractalCalculationCUDA<int, float>::CalcPixelV3(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, constColorTableV1, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc, pixelPerThread);
}

__host__ void FractalCalculationWrapperV3(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc,
    size_t const pixelPerThread)
{
    // copy color table
    cudautils::symbolmemcopy(constColorTableV1, p_colorTable, colorTableSize);

    FractalCalculationV3 <<< blockDimension, threadPerBlock >>> (c, dp_data, dataSize, imageWidth,
        imageHeight, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc, pixelPerThread);
}

__host__ void FractalCalculationWrapperV3(dim3 const blockDimension, size_t const threadPerBlock,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc,
    size_t const pixelPerThread)
{
    // copy color table
    cudautils::symbolmemcopy(constColorTableV1, p_colorTable, colorTableSize);

    FractalCalculationV3 <<< blockDimension, threadPerBlock >>> (c, dp_data, dataSize, imageWidth,
        imageHeight, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc, pixelPerThread);
}

///////////////////////////// Version 4 /////////////////////////////////////////

__global__ void FractalCalculationV4(pfc::complex<double> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight, size_t const colorTableSize,
    pfc::complex<double> const lowerLeft, double const stepX, double const stepY,
    julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc, size_t const pixelPerThread)
{
    // calculate pixel
    julia::JuliaFractalCalculationCUDA<int, double>::CalcPixelV4(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, constColorTableV1, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc, pixelPerThread);
}

__global__ void FractalCalculationV4(pfc::complex<float> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight, size_t const colorTableSize,
    pfc::complex<float> const lowerLeft, float const stepX, float const stepY,
    julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc, size_t const pixelPerThread)
{
    // calculate pixel
    julia::JuliaFractalCalculationCUDA<int, float>::CalcPixelV4(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, constColorTableV1, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc, pixelPerThread);
}

__host__ void FractalCalculationWrapperV4(dim3 const blockDimension, dim3 const threadDimension,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc,
    size_t const pixelPerThread)
{
    // copy color table
    cudautils::symbolmemcopy(constColorTableV1, p_colorTable, colorTableSize);

    FractalCalculationV4 <<< blockDimension, threadDimension >>> (c, dp_data, dataSize, imageWidth,
        imageHeight, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc, pixelPerThread);
}

__host__ void FractalCalculationWrapperV4(dim3 const blockDimension, dim3 const threadDimension,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc,
    size_t const pixelPerThread)
{
    // copy color table
    cudautils::symbolmemcopy(constColorTableV1, p_colorTable, colorTableSize);

    FractalCalculationV4 <<< blockDimension, threadDimension >>> (c, dp_data, dataSize, imageWidth,
        imageHeight, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc, pixelPerThread);
}


///////////////////////////// Version 5 /////////////////////////////////////////

__global__ void FractalCalculationV5(pfc::complex<double> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight, size_t const colorTableSize,
    pfc::complex<double> const lowerLeft, double const stepX, double const stepY,
    julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc)
{
    // calculate pixel
    julia::JuliaFractalCalculationCUDA<int, double>::CalcPixelV5(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, constColorTableV1, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc);
}

__global__ void FractalCalculationV5(pfc::complex<float> const c, pfc::RGB_3_t * dp_data,
    size_t const dataSize, size_t const imageWidth, size_t const imageHeight, size_t const colorTableSize,
    pfc::complex<float> const lowerLeft, float const stepX, float const stepY,
    julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc)
{
    // calculate pixel
    julia::JuliaFractalCalculationCUDA<int, float>::CalcPixelV5(blockIdx, blockDim, threadIdx, c, dp_data,
        dataSize, imageWidth, imageHeight, constColorTableV1, colorTableSize, lowerLeft, stepX, stepY,
        dp_pixelCalc);
}

__host__ void FractalCalculationWrapperV5(dim3 const blockDimension, dim3 const threadDimension,
    pfc::complex<double> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<double> const lowerLeft, double const stepX,
    double const stepY, julia::JuliaPixelCalculation<int, double> const * dp_pixelCalc)
{
    // copy color table
    cudautils::symbolmemcopy(constColorTableV1, p_colorTable, colorTableSize);

    FractalCalculationV5 << < blockDimension, threadDimension >> > (c, dp_data, dataSize, imageWidth,
        imageHeight, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc);
}

__host__ void FractalCalculationWrapperV5(dim3 const blockDimension, dim3 const threadDimension,
    pfc::complex<float> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
    size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * p_colorTable,
    size_t const colorTableSize, pfc::complex<float> const lowerLeft, float const stepX,
    float const stepY, julia::JuliaPixelCalculation<int, float> const * dp_pixelCalc)
{
    // copy color table
    cudautils::symbolmemcopy(constColorTableV1, p_colorTable, colorTableSize);

    FractalCalculationV5 << < blockDimension, threadDimension >> > (c, dp_data, dataSize, imageWidth,
        imageHeight, colorTableSize, lowerLeft, stepX, stepY, dp_pixelCalc);
}