#ifndef HELLOWORLD_H
#define HELLOWORLD_H

#include <cuda_runtime.h>

void copy_string_kernel_wrapper(size_t const threads_in_block,
                                size_t const blocks_in_grid,
                                char * dp_dst,
                                char * dp_src,
                                size_t const size);

#endif