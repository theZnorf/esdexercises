#include <iostream>
#include <algorithm>
#include <iterator>
#include <functional>
#include <ctime>
#include <random>
#include <chrono>
#include "Average.h"

using namespace std;
using namespace std::chrono;

size_t const smallN = 20;
size_t const largeN = 100000000;

void InitRandom(Numbers &vec, size_t const nr, int max)
{
    auto rgen = std::bind(uniform_int_distribution<int>(1, max + 1),
                          default_random_engine((unsigned int) time(0)));
    vec.reserve(nr);
    generate_n(back_inserter(vec), nr, rgen);
}

void PrintNumbers(Numbers const &numbers)
{
    cout << "Numbers: ";
    copy(numbers.begin(), numbers.end(), ostream_iterator<int>(cout, " "));
    cout << endl;
}

void PrintAverages(Averages const &avg)
{
    cout << "Arithmetic mean: " << avg.arithmeticMean << endl
    << "Geometric mean: " << avg.geometricMean << endl
    << "Harmonic mean: " << avg.harmonicMean << endl
    << "Quadratic mean: " << avg.quadraticMean << endl
    << "Mode: " << avg.mode << endl
    << "Median: " << avg.median << endl;
}

void TestFunctional()
{
    Numbers numbers;
    InitRandom(numbers, smallN, smallN);
    Averages avg = {};
    ComputeAverages(numbers, avg);
    PrintNumbers(numbers);
    cout << "\nComputeMeans:\n";
    PrintAverages(avg);
    cout << "\nParallelComputeMeans:\n";
    Averages pavg = {};
    ParallelComputeAverages(numbers, pavg);
    PrintAverages(pavg);
}

void TestRuntime()
{
    Numbers numbers;
    InitRandom(numbers, largeN, largeN);
    cout << "\nRuntime:\n";
    Averages avg{};
    auto startTime = high_resolution_clock::now();
    ComputeAverages(numbers, avg);
    auto endTime = high_resolution_clock::now();
    double time1 = duration<double>(endTime - startTime).count();
    cout << "ComputeMeans: " << time1 << endl;
    Averages pavg = {};
    startTime = high_resolution_clock::now();
    ParallelComputeAverages(numbers, pavg);
    endTime = high_resolution_clock::now();
    double time2 = duration<double>(endTime - startTime).count();
    cout << "ParallelComputeMeans: " << time2 << " (Speedup: " <<
    time1 / time2 << ")\n";
}

int main()
{
    TestFunctional();
#ifdef NDEBUG
    TestRuntime();
#endif
    return 0;
}
