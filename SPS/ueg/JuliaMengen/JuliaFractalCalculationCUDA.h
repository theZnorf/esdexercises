#ifndef JULIAFRACTALCALCULATIONCUDA_H
#define JULIAFRACTALCALCULATIONCUDA_H

#include <memory>
#include <exception>
#include <cuda_runtime.h>
#include "JuliaFractalCalculation.h"
#include "cudautils.h"
#include "KernelFractalCalculation.cuh"

#undef CUDA_ATTR_HOST_DEVICE

#if defined __CUDACC__   /* NVIDIA CUDA compiler */
#define CUDA_ATTR_HOST_DEVICE __host__ __device__
#else
#define CUDA_ATTR_HOST_DEVICE
#endif

namespace julia
{
    template <typename T, typename FloatingType>
    class JuliaFractalCalculationCUDA : public JuliaFractalCalculation<T, FloatingType>
    {
        // C-Tor
    public:
        JuliaFractalCalculationCUDA(JuliaPixelCalculation<T, FloatingType> const & calc,
            size_t const imgWidth, size_t const imgHeight, pfc::complex<FloatingType> const & lowerLeft,
            pfc::complex<FloatingType> const & upperRight, size_t const threadPerBlock)
            : JuliaFractalCalculation(calc, imgWidth, imgHeight, lowerLeft, upperRight), cThreadPerBlock(threadPerBlock)
        {
            // check special case
            if (cThreadPerBlock > cImgWidth)
                throw std::logic_error("more threads than image width");
        }

        // Methods
    public:
        virtual void Calc(pfc::complex<FloatingType> const & c, int version = 0) override
        {
            switch (version)
            {
            case 0:
                CalcV0(c);
                break;
            case 1:
                CalcV1(c);
                break;
            case 2:
                CalcV2(c);
                break;
            case 3:
                CalcV3(c);
                break;

            default:
                throw new std::logic_error("invalid version number");
            }
        }

        void CalcV0(pfc::complex<FloatingType> const & c)
        {
            // calculate number of blocks
            dim3 blockDimension(1, 1, 1);
            blockDimension.z = 1;
            if (cThreadPerBlock <= cImgWidth)
            {
                blockDimension.x = static_cast<size_t>((cImgWidth + 0.5) * 1.0 / cThreadPerBlock);
                blockDimension.y = cImgHeight;
            }
            else
            {
                blockDimension.x = 1;
                blockDimension.y = static_cast<size_t>((cImgWidth)* 1.0 / cThreadPerBlock * cImgHeight);
            }


            // allocate memory
            auto dp_image = cudautils::malloc_on_device<pfc::RGB_3_t>(mBitMap.get_num_pixels());

            auto dp_pixelCalc = cudautils::malloc_on_device<JuliaPixelCalculation<T, FloatingType>>(1);

            auto dp_color = cudautils::malloc_on_device<pfc::RGB_3_t>(mColorTable.size());

            // copy image
            cudautils::memcopy(dp_image, mBitMap.get_image_RGB_3(), mBitMap.get_num_pixels()
                * sizeof(pfc::RGB_3_t), cudaMemcpyKind::cudaMemcpyHostToDevice);

            // copy calculation object
            cudautils::memcopy(dp_pixelCalc, &cCalc, sizeof(JuliaPixelCalculation<T, FloatingType>),
                cudaMemcpyKind::cudaMemcpyHostToDevice);

            // copy color thingy
            cudautils::memcopy(dp_color, mColorTable.data(), mColorTable.size() * sizeof(pfc::RGB_3_t),
                cudaMemcpyKind::cudaMemcpyHostToDevice);

            // check if allocation and copy was successful
            pfc::check(cudaGetLastError());

            // start calculation
            FractalCalculationWrapperV0(blockDimension, cThreadPerBlock, c, dp_image, mBitMap.get_num_pixels(),
                cImgWidth, cImgHeight, dp_color, mColorTable.size(), cLowerLeft, cStepX, cStepY,
                dp_pixelCalc);

            // sync
            pfc::check(cudaDeviceSynchronize());
            pfc::check(cudaGetLastError());

            // copy image
            cudautils::memcopy(mBitMap.get_image_RGB_3(), dp_image, mBitMap.get_num_pixels()
                * sizeof(pfc::RGB_3_t), cudaMemcpyKind::cudaMemcpyDeviceToHost);

            // free memory
            cudautils::free_on_device(dp_image);
            cudautils::free_on_device(dp_pixelCalc);
            cudautils::free_on_device(dp_color);
        }

        void CalcV1(pfc::complex<FloatingType> const & c)
        {
            // calculate number of blocks
            dim3 blockDimension(1, 1, 1);
            blockDimension.z = 1;
            if (cThreadPerBlock <= cImgWidth)
            {
                blockDimension.x = static_cast<size_t>((cImgWidth + 0.5) * 1.0 / cThreadPerBlock);
                blockDimension.y = cImgHeight;
            }
            else
            {
                blockDimension.x = 1;
                blockDimension.y = static_cast<size_t>((cImgWidth)* 1.0 / cThreadPerBlock * cImgHeight);
            }


            // allocate memory
            auto dp_image = cudautils::malloc_on_device<pfc::RGB_3_t>(mBitMap.get_num_pixels());

            auto dp_pixelCalc = cudautils::malloc_on_device<JuliaPixelCalculation<T, FloatingType>>(1);


            // copy image
            cudautils::memcopy(dp_image, mBitMap.get_image_RGB_3(), mBitMap.get_num_pixels()
                * sizeof(pfc::RGB_3_t), cudaMemcpyKind::cudaMemcpyHostToDevice);

            // copy calculation object
            cudautils::memcopy(dp_pixelCalc, &cCalc, sizeof(JuliaPixelCalculation<T, FloatingType>),
                cudaMemcpyKind::cudaMemcpyHostToDevice);

            // check if allocation and copy was successful
            pfc::check(cudaGetLastError());

            // start calculation
            FractalCalculationWrapperV1(blockDimension, cThreadPerBlock, c, dp_image, mBitMap.get_num_pixels(),
                cImgWidth, cImgHeight, mColorTable.data(), mColorTable.size(), cLowerLeft, cStepX, cStepY,
                dp_pixelCalc);

            // sync
            pfc::check(cudaDeviceSynchronize());
            pfc::check(cudaGetLastError());

            // copy image
            cudautils::memcopy(mBitMap.get_image_RGB_3(), dp_image, mBitMap.get_num_pixels()
                * sizeof(pfc::RGB_3_t), cudaMemcpyKind::cudaMemcpyDeviceToHost);

            // free memory
            cudautils::free_on_device(dp_image);
            cudautils::free_on_device(dp_pixelCalc);
        }

        void CalcV2(pfc::complex<FloatingType> const & c)
        {
            // calculate number of blocks
            dim3 blockDimension(1, 1, 1);
            blockDimension.z = 1;
            if (cThreadPerBlock <= cImgWidth)
            {
                blockDimension.x = static_cast<size_t>((cImgWidth + 0.5) * 1.0 / cThreadPerBlock);
                blockDimension.y = cImgHeight;
            }
            else
            {
                blockDimension.x = 1;
                blockDimension.y = static_cast<size_t>((cImgWidth)* 1.0 / cThreadPerBlock * cImgHeight);
            }


            // allocate memory
            auto dp_image = cudautils::malloc_on_device<pfc::RGB_3_t>(mBitMap.get_num_pixels());

            auto dp_pixelCalc = cudautils::malloc_on_device<JuliaPixelCalculation<T, FloatingType>>(1);


            // copy image
            cudautils::memcopy(dp_image, mBitMap.get_image_RGB_3(), mBitMap.get_num_pixels()
                * sizeof(pfc::RGB_3_t), cudaMemcpyKind::cudaMemcpyHostToDevice);

            // copy calculation object
            cudautils::memcopy(dp_pixelCalc, &cCalc, sizeof(JuliaPixelCalculation<T, FloatingType>),
                cudaMemcpyKind::cudaMemcpyHostToDevice);

            // check if allocation and copy was successful
            pfc::check(cudaGetLastError());

            // start calculation
            FractalCalculationWrapperV2(blockDimension, cThreadPerBlock, c, dp_image, mBitMap.get_num_pixels(),
                cImgWidth, cImgHeight, mColorTable.data(), mColorTable.size(), cLowerLeft, cStepX, cStepY,
                dp_pixelCalc);

            // sync
            pfc::check(cudaDeviceSynchronize());
            pfc::check(cudaGetLastError());

            // copy image
            cudautils::memcopy(mBitMap.get_image_RGB_3(), dp_image, mBitMap.get_num_pixels()
                * sizeof(pfc::RGB_3_t), cudaMemcpyKind::cudaMemcpyDeviceToHost);

            // free memory
            cudautils::free_on_device(dp_image);
            cudautils::free_on_device(dp_pixelCalc);
        }

        void CalcV3(pfc::complex<FloatingType> const & c)
        {
            // calculate number of blocks
            dim3 blockDimension(1, 1, 1);
            blockDimension.z = 1;
            if (cThreadPerBlock <= cImgWidth)
            {
                blockDimension.x = static_cast<size_t>((cImgWidth + 0.5) * 1.0 / cThreadPerBlock);
                blockDimension.y = cImgHeight;
            }
            else
            {
                blockDimension.x = 1;
                blockDimension.y = static_cast<size_t>((cImgWidth)* 1.0 / cThreadPerBlock * cImgHeight);
            }


            // allocate memory
            auto dp_image = cudautils::malloc_on_device<pfc::RGB_3_t>(mBitMap.get_num_pixels());

            auto dp_pixelCalc = cudautils::malloc_on_device<JuliaPixelCalculation<T, FloatingType>>(1);


            // copy image
            cudautils::memcopy(dp_image, mBitMap.get_image_RGB_3(), mBitMap.get_num_pixels()
                * sizeof(pfc::RGB_3_t), cudaMemcpyKind::cudaMemcpyHostToDevice);

            // copy calculation object
            cudautils::memcopy(dp_pixelCalc, &cCalc, sizeof(JuliaPixelCalculation<T, FloatingType>),
                cudaMemcpyKind::cudaMemcpyHostToDevice);

            // check if allocation and copy was successful
            pfc::check(cudaGetLastError());

            // start calculation
            FractalCalculationWrapperV3(blockDimension, cThreadPerBlock, c, dp_image, mBitMap.get_num_pixels(),
                cImgWidth, cImgHeight, mColorTable.data(), mColorTable.size(), cLowerLeft, cStepX, cStepY,
                dp_pixelCalc);

            // sync
            pfc::check(cudaDeviceSynchronize());
            pfc::check(cudaGetLastError());

            // copy image
            cudautils::memcopy(mBitMap.get_image_RGB_3(), dp_image, mBitMap.get_num_pixels()
                * sizeof(pfc::RGB_3_t), cudaMemcpyKind::cudaMemcpyDeviceToHost);

            // free memory
            cudautils::free_on_device(dp_image);
            cudautils::free_on_device(dp_pixelCalc);
        }

        CUDA_ATTR_HOST_DEVICE static void CalcPixelV0(uint3 const blockIdx, dim3 const blockDim,
            uint3 const threadIdx, pfc::complex<FloatingType> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
            size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * dp_colorTable,
            size_t const colorTableSize, pfc::complex<FloatingType> const lowerLeft, FloatingType const stepX,
            FloatingType const stepY, julia::JuliaPixelCalculation<int, FloatingType> const * dp_pixelCalc)
        {
            auto x = (blockIdx.x * blockDim.x + threadIdx.x) % imageWidth;
            auto y = blockIdx.y * blockDim.y + threadIdx.y;
            auto i = x + y * imageWidth;
            auto pixel = dp_data;

            auto pos = JuliaFractalCalculation<T, FloatingType>::CalcPixelPos(x, y, stepX, stepY, lowerLeft);
            auto res = dp_pixelCalc->Calc(pos, c);

            pixel[i] = dp_colorTable[res];
        }

        CUDA_ATTR_HOST_DEVICE static void CalcPixelV2(uint3 const blockIdx, dim3 const blockDim,
            uint3 const threadIdx, pfc::complex<FloatingType> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
            size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * dp_colorTable,
            size_t const colorTableSize, pfc::complex<FloatingType> const lowerLeft, FloatingType const stepX,
            FloatingType const stepY, julia::JuliaPixelCalculation<int, FloatingType> const * dp_pixelCalc)
        {
            auto x = (blockIdx.x * blockDim.x + threadIdx.x) % imageWidth;
            auto y = blockIdx.y * blockDim.y + threadIdx.y;
            auto i = x + y * imageWidth;
            auto pixel = dp_data;

            auto pos = JuliaFractalCalculation<T, FloatingType>::CalcPixelPos(x, y, stepX, stepY, lowerLeft);
            auto res = dp_pixelCalc->CalcV2(pos, c);

            pixel[i] = dp_colorTable[res];
        }

        CUDA_ATTR_HOST_DEVICE static void CalcPixelV3(uint3 const blockIdx, dim3 const blockDim,
            uint3 const threadIdx, pfc::complex<FloatingType> const c, pfc::RGB_3_t * dp_data, size_t const dataSize,
            size_t const imageWidth, size_t const imageHeight, pfc::RGB_3_t * dp_colorTable,
            size_t const colorTableSize, pfc::complex<FloatingType> const lowerLeft, FloatingType const stepX,
            FloatingType const stepY, julia::JuliaPixelCalculation<int, FloatingType> const * dp_pixelCalc)
        {
            auto x = (blockIdx.x * blockDim.x + threadIdx.x) % imageWidth;
            auto y = blockIdx.y * blockDim.y + threadIdx.y;
            auto i = x + y * imageWidth;
            auto pixel = dp_data;

            auto pos = JuliaFractalCalculation<T, FloatingType>::CalcPixelPos(x, y, stepX, stepY, lowerLeft);
            auto res = dp_pixelCalc->CalcV3(pos, c);

            pixel[i] = dp_colorTable[res];
        }

        // Member
    private:
        size_t const cThreadPerBlock;
    };
}

#endif