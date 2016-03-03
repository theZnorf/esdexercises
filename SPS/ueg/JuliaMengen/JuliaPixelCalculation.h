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
            pfc::complex<TF> result = z0;

            while (iteration < (cMaxIterCount - 1))
            {
                result = result.square() + c;
                if (result.norm() >= cUpperBound)
                    break;
                result = result.square() + c;
                if (result.norm() >= cUpperBound)
                    break;
                iteration += 2;
            }
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