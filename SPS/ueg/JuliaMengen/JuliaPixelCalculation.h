#ifndef JULIAPIXELCALCULATION_H
#define JULIAPIXELCALCULATION_H

#include "complex.h"

#undef CUDA_ATTR_HOST_DEVICE

#if defined __CUDACC__   /* NVIDIA CUDA compiler */
#define CUDA_ATTR_HOST_DEVICE __host__ __device__
#else
#define CUDA_ATTR_HOST_DEVICE
#endif

namespace julia
{
    template<typename T, typename TF>
    class JuliaPixelCalculation
    {
        // Definition
    private:


        // C-Tor
    public:
        CUDA_ATTR_HOST_DEVICE JuliaPixelCalculation(TF upperBound, T maxIterCount)
            : cUpperBound(upperBound), cMaxIterCount(maxIterCount)
        { }


        // Methods
    public:
        CUDA_ATTR_HOST_DEVICE T Calc(pfc::complex<TF> const & z0, pfc::complex<TF> const & c) const
        {
            T iteration = 0;
            pfc::complex<TF> result = z0;

            while ((iteration < cMaxIterCount - 1) && (result.norm() < cUpperBound))
            {
                result = result.square() + c;
                iteration += 1;
            }

            return iteration;
        }

        CUDA_ATTR_HOST_DEVICE T CalcV2(pfc::complex<TF> const & z0, pfc::complex<TF> const & c) const
        {
            T iteration = 0;
            T dummy = 0;
            pfc::complex<TF> result0 = z0;
            pfc::complex<TF> result1 = z0;

            while ((iteration < cMaxIterCount - 1) && (result0.norm() < cUpperBound) && (result1.norm() < cUpperBound))
            {
                result0 = result1.square() + c;
                result1 = result0.square() + c;
                iteration += 2;
            }

            if ((iteration < cMaxIterCount - 1) && (result0.norm() < cUpperBound))
                iteration--;
            else
                dummy++;

            return iteration;
        }

        CUDA_ATTR_HOST_DEVICE T CalcV3(pfc::complex<TF> const & z0, pfc::complex<TF> const & c) const
        {
            T iteration = 0;
            pfc::complex<TF> result0 = z0;
            pfc::complex<TF> result1 = z0;
            pfc::complex<TF> dummy = z0;

            for (; iteration < cMaxIterCount - 1; iteration += 2)
            {
                if (result0.norm() < cUpperBound)
                    result0 = result1.square() + c;
                else
                    dummy = dummy.square() + c;

                if (result1.norm() < cUpperBound)
                    result1 = result0.square() + c;
                else
                    dummy = dummy.square() + c;
            }

            if ((iteration < cMaxIterCount - 1) && (result0.norm() < cUpperBound))
                iteration--;

            return iteration;
        }

        CUDA_ATTR_HOST_DEVICE T const GetMaxIterCount() const
        {
            return cMaxIterCount;
        }

        // Member
    private:
        TF const cUpperBound;
        T const cMaxIterCount;
    };
}


#endif