#include "HelloWorld.cuh"


// function is executed parallel in blocks
// or __device__
__global__ void copy_string_kernel(char * dp_dst, char * dp_src, size_t const size)
{
    if ((dp_dst != nullptr) && (dp_src != nullptr))
    {
        auto const i = blockIdx.x * blockDim.x + threadIdx.x;

        if (i < size) {
            dp_dst[i] = dp_src[i];
        }
    }
}

__host__ void copy_string_kernel_wrapper(size_t const threads_in_block,
    size_t const blocks_in_grid,
    char * dp_dst,
    char * dp_src,
    size_t const size)
{
    copy_string_kernel <<<threads_in_block, blocks_in_grid>>> (dp_dst, dp_src, size);
}