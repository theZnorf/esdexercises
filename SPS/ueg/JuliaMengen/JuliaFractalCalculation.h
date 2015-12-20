#ifndef JULIAFRACTALCALCULATION_H
#define JULIAFRACTALCALCULATION_H

#include "JuliaPixelCalculation.h"
#include "complex.h"
#include "bitmap.h"
#include "wavelength.h"
#include <vector>
#include <exception>

#undef CUDA_ATTR_HOST_DEVICE

#if defined __CUDACC__   /* NVIDIA CUDA compiler */
#define CUDA_ATTR_HOST_DEVICE __host__ __device__
#else
#define CUDA_ATTR_HOST_DEVICE
#endif

namespace julia
{
    template<typename T, typename FloatingType>
    class JuliaFractalCalculation
    {

        // C-Tor
    public:
        JuliaFractalCalculation(JuliaPixelCalculation<T, FloatingType> const & calc,
            size_t const imgWidth, size_t const imgHeight, pfc::complex<FloatingType> const & lowerLeft,
            pfc::complex<FloatingType> const & upperRight)
            : cCalc(calc), cImgWidth(imgWidth), cImgHeight(imgHeight),
            cLowerLeft(lowerLeft), cUpperRight(upperRight), mBitMap(imgWidth, imgHeight),
            cStepX((upperRight.real() - lowerLeft.real()) * 1.0 / cImgWidth),
            cStepY((upperRight.imag() - lowerLeft.imag()) * 1.0 / cImgHeight),
            mColorTable()
        {
            // calculate color table
            for (auto i = 0; i < calc.GetMaxIterCount(); i++)
            {
                mColorTable.emplace_back();
                pfc::rgb_from_wavelength(mColorTable[i],
                    (FloatingType)(i * 1.0 / calc.GetMaxIterCount()));
            }
        }

        // Methods
    public:
        virtual void Calc(pfc::complex<FloatingType> const & c)
        {
            throw std::logic_error("Calc of abstract JuliaFractalCalculation called");
        };

        pfc::bitmap & GetImage()
        {
            return mBitMap;
        }

        pfc::complex<FloatingType> CalcPixelPos(size_t const x, size_t const y) const
        {
            return CalcPixelPos(x, y, cStepX, cStepY, cLowerLeft);
        }

        CUDA_ATTR_HOST_DEVICE static pfc::complex<FloatingType> CalcPixelPos(size_t const x,
            size_t const y, FloatingType const cStepX, FloatingType const cStepY,
            pfc::complex<FloatingType> const cLowerLeft)
        {
            auto real = (FloatingType)(cStepX * (FloatingType)x + cLowerLeft.real());
            auto imag = (FloatingType)(cStepY * (FloatingType)y + cLowerLeft.imag());

            return pfc::complex<FloatingType>(real, imag);
        }

        // Member
    protected:
        JuliaPixelCalculation<T, FloatingType> const cCalc;
        size_t const cImgWidth;
        size_t const cImgHeight;
        FloatingType const cStepX;
        FloatingType const cStepY;
        pfc::complex<FloatingType> const & cLowerLeft;
        pfc::complex<FloatingType> const & cUpperRight;
        pfc::bitmap mBitMap;
        std::vector<pfc::RGB_3_t> mColorTable;
    };

}

#endif