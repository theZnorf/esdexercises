#ifndef JULIAFRACTALCALCULATIONCPU_H
#define JULIAFRACTALCALCULATIONCPU_H

#include "JuliaFractalCalculation.h"
#include "complex.h"
#include "wavelength.h"
#include <boost\thread.hpp>

namespace julia
{
    template<typename T, typename FloatingType>
    class JuliaFractalCalculationCPU : public JuliaFractalCalculation < T, FloatingType >
    {
        // C-Tor / D-Tor
    public:
        JuliaFractalCalculationCPU(JuliaPixelCalculation<T, FloatingType> const & calc,
            size_t const imgWidth, size_t const imgHeight, pfc::complex<FloatingType> const & lowerLeft,
            pfc::complex<FloatingType> const & upperRight, size_t const threadCount)
            : JuliaFractalCalculation(calc, imgWidth, imgHeight, lowerLeft, upperRight), cThreadCount(threadCount)
        { }

        // Methods
    public:
        virtual void Calc(pfc::complex<FloatingType> const & c, int version = 0) override
        {
            boost::thread_group group;

            auto range = mBitMap.get_num_pixels() / cThreadCount;

            // calculate threads with positions
            for (size_t i = 0; i < cThreadCount; i++)
            {
                group.create_thread(boost::bind(&JuliaFractalCalculationCPU::ThreadFunc, this, c,
                    i * range, range * (i+1)));
            }

            auto remain = mBitMap.get_num_pixels() % cThreadCount;

            if (remain > 0)
            {
                group.create_thread(boost::bind(&JuliaFractalCalculationCPU::ThreadFunc, this, c,
                    mBitMap.get_num_pixels() - (remain * cThreadCount), mBitMap.get_num_pixels()));
            }

            // wait for it
            group.join_all();
        }

    private:

        void ThreadFunc(pfc::complex<FloatingType> const & c, T const startingPoint, T const endPoint)
        {
            auto pixel = mBitMap.get_image_RGB_3();

            for (auto i = startingPoint; i < endPoint; i++)
            {
                auto x = i % cImgWidth;
                auto y = i / cImgWidth;

                auto pos = CalcPixelPos(x, y);
                auto res = cCalc.CalcV2(pos, c);

                pixel[i] = mColorTable[res];
            }
        }

            // Member
        private:
            size_t const cThreadCount;
    };
}

#endif