#include <vector>
#include <string>
#include <iterator>
#include <algorithm>
#include <functional>
#include <iostream>
#include <ctime>
#include <random>
#include <chrono>
#include <tbb/parallel_invoke.h>

using namespace std;
using namespace std::chrono;
using namespace tbb;

size_t const smallN = 10000;
size_t const largeN = 5000000;

typedef vector<int> Numbers;

void InitRandom(Numbers &vec, size_t const nr, int max)
{
    auto rgen = std::bind(uniform_int_distribution<int>(1, max + 1),
                          default_random_engine());
    vec.reserve(nr);
    generate_n(back_inserter(vec), nr, rgen);
}

template<typename TIter>
void MergeSort(TIter begin, TIter end)
{
    if (end - begin > 1)
    {
        TIter middle = begin + (end - begin) / 2;
        MergeSort(begin, middle);
        MergeSort(middle, end);
        inplace_merge(begin, middle, end);
    }
}

template<typename TIter>
void ParallelMergeSort(TIter begin, TIter end)
{
    const size_t MinNrElements = 100;
    if (end - begin > MinNrElements)
    {
        TIter middle = begin + (end - begin) / 2;
        parallel_invoke([=] { ParallelMergeSort(begin, middle); },
                        [=] { ParallelMergeSort(middle, end); });
        inplace_merge(begin, middle, end);
    }
    else
        MergeSort(begin, end);
}

bool IsCorrectlySorted(Numbers numbers, Numbers const &sorted)
{
    stable_sort(numbers.begin(), numbers.end());
    return numbers == sorted;
}

void TestFunctional()
{
    Numbers numbers;
    InitRandom(numbers, smallN, smallN);
    Numbers numbers1 = numbers;
    Numbers numbers2 = numbers;
    MergeSort(numbers1.begin(), numbers1.end());
    cout << "IsCorrectlySorted returned " << boolalpha <<
    IsCorrectlySorted(numbers, numbers1) << endl;
    ParallelMergeSort(numbers2.begin(), numbers2.end());
    cout << "IsCorrectlySorted returned " << boolalpha <<
    IsCorrectlySorted(numbers, numbers2) << endl;
}

void TestRuntime()
{
    Numbers numbers1;
    InitRandom(numbers1, largeN, largeN);
    Numbers numbers2 = numbers1;
    auto start = high_resolution_clock::now();
    MergeSort(numbers1.begin(), numbers1.end());
    double time1 = duration<double>(
            high_resolution_clock::now() - start).count();
    cout << "MergeSort: " << time1 << endl;
    start = high_resolution_clock::now();
    ParallelMergeSort(numbers2.begin(), numbers2.end());
    double time2 = duration<double>(
            high_resolution_clock::now() - start).count();
    cout << "ParallelMergeSort: " << time2 << " (Speedup: " << time1 / time2 <<
    ")\n";
}

int main()
{
    TestFunctional();
#ifdef NDEBUG
    TestRuntime();
#endif
    return 0;
}
