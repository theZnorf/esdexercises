#include <iostream>
#include <cuda_runtime.h>
#include "cudaerror.h"
#include "cudainfo.h"
#include "cudaprint.h"
#include "HelloWorld.cuh"

using namespace std;

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
T * & free_on_device(T * & dp_memory)
{
    if (dp_memory != nullptr)
    {
        pfc::check(cudaFree(dp_memory));
        dp_memory = nullptr;
    }

    return dp_memory;
}

void copy_string(char * hp_dst,
				 char const * const hp_src,
                 size_t const count,
                 size_t const threads_in_block)
{
    if ((hp_dst != nullptr) &&
        (hp_src != nullptr) &&
        (count > 0) &&
        (threads_in_block > 0))
    {

        auto * dp_src = malloc_on_device<char>(count);
        auto * dp_dst = malloc_on_device<char>(count);

        memcopy(dp_src, hp_src, count, cudaMemcpyKind::cudaMemcpyHostToDevice);


        size_t blocks_in_grid = (count + threads_in_block - 1) / threads_in_block;

        copy_string_kernel_wrapper(threads_in_block, blocks_in_grid,
            dp_dst, dp_src, count);

        pfc::check(cudaGetLastError());

        pfc::check(cudaDeviceSynchronize());

        memcopy(hp_dst, dp_dst, count, cudaMemcpyKind::cudaMemcpyDeviceToHost);

        // alloc and malloc are automatic sync points
        free_on_device(dp_src);
        free_on_device(dp_dst);
    }
}


void test_copy_string()
{
	string const text = "Hello World :-) and enjoy the awsome parallelism :-D";
	auto const count = text.size() + 1;

	char const * const hp_src = text.c_str();
	char * hp_dst = new char[count];
	std::memset(hp_dst, 0, count);

	try
	{
        copy_string(hp_dst, hp_src, count, 16);

        cout << "'" << hp_src << "'" << endl;
        cout << "'" << hp_dst << "'" << endl;
	}
	catch (exception const & e)
	{
		cerr << "Exception caught: " << e.what() << endl;
	}

	delete[] hp_dst; hp_dst = nullptr;
}

int main()
{
	cout << "started" << endl;

	int count;

	pfc::check(cudaGetDeviceCount(&count));

	cout << "Devicecount: " << count << endl;

	if (count > 0)
	{
		pfc::check(cudaSetDevice(0));

		pfc::print_device_props(0);

		test_copy_string();

		pfc::check(cudaDeviceReset());
	}


	cout << "finished" << endl;
	getchar();
	return 0;
}