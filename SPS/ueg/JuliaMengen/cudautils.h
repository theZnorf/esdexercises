#ifndef CUDAUTILS_H
#define CUDAUTILS_H

#include <cuda_runtime.h>
#include "cudaerror.h"

#if defined __CUDACC__   /* NVIDIA CUDA compiler */
#define CUDA_ATTR_HOST_DEVICE __host__ __device__
#else
#define CUDA_ATTR_HOST_DEVICE
#endif

namespace cudautils
{

    template<typename T>
    T * memcopy(T * const p_dst,
        T const * const p_src,
        size_t const count,
        cudaMemcpyKind const kind)
    {
        if ((p_dst != nullptr) && (p_src != nullptr) && (count > 0))
        {
            pfc::check(cudaMemcpy(p_dst, p_src, count, kind));
        }

        return p_dst;
    }

    template<typename TDst, typename TSrc>
    void symbolmemcopy(TDst& p_dst, TSrc * p_src,
        size_t const count)
    {
        if ((p_dst != nullptr) && (p_src != nullptr) && (count > 0))
        {
            pfc::check(cudaMemcpyToSymbol(p_dst, p_src, count * sizeof(TSrc)));
        }
    }

    template<typename T>
    T * malloc_on_device(size_t const size)
    {
        T * dp_memory = nullptr;
        if (size > 0)
        {
            pfc::check(cudaMalloc(&dp_memory, size * sizeof(T)));
        }

        return dp_memory;
    }

    template<typename T>
    T *& free_on_device(T *& dp_memory)
    {
        if (dp_memory != nullptr)
        {
            pfc::check(cudaFree(dp_memory));
            dp_memory = nullptr;
        }

        return dp_memory;
    }
}

#endif