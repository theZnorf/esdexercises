#include <iostream>
#include <algorithm>
#include <iterator>
#include <numeric>
#include <functional>
#include <vector>
#include <string>
#include <limits>
#include <cmath>
#include <random>
#include <thread>
#include <chrono>

using namespace std;
using namespace std::chrono;
using namespace std::placeholders;

size_t const smallN = 1000;
size_t const largeN = 250000;

using Number = int;
using NumberVec = vector<Number>;

bool IsPrime(Number const x)
{
    if (x <= 1)
    {
        return false;
    }
    if (x == 2)
    {
        return true;
    }
    if (x % 2 == 0)
    {
        return false;
    }
    auto max = (Number) ceil(sqrt(double(x)));
    for (Number d = 3; d <= max; d += 2)
    {
        if (x % d == 0)
        {
            return false;
        }
    }
    return true;
}

size_t CountPrimes(NumberVec const &vec)
{
    return (size_t) count_if(vec.begin(), vec.end(), IsPrime);
}

size_t ParallelCountPrimes(NumberVec const &vec, unsigned int const nrThreads)
{
    size_t nr = vec.size() / nrThreads;


    size_t result = 0;
    auto begin = vec.cbegin();
    auto end = begin + nr;
    vector<thread> threads;
    vector<size_t> results(nrThreads -1);

    for (auto i = 0; i < nrThreads - 1; i++)
    {
        threads.emplace_back([begin, end, &results, i]
                             {
                                 results[i] = (unsigned long) count_if(begin, end, IsPrime);
                             });
        begin += nr;
        end += nr;
    }

    result = (size_t) count_if(begin, vec.cend(), IsPrime);

    for_each(threads.begin(), threads.end(), [] (auto & t){ t.join(); });

    return result + accumulate(results.begin(), results.end(), 0);
}

void InitRandom(NumberVec &vec, size_t const nr)
{
    auto rgen = std::bind(uniform_int_distribution<Number>(0, numeric_limits<Number>::max()), default_random_engine());
    vec.reserve(nr);
    generate_n(back_inserter(vec), nr, rgen);
}

void TestFunctional(unsigned int maxThreads)
{
    NumberVec vec;
    InitRandom(vec, smallN);
    cout << "*** Functional tests ***" << endl;
    cout << "CountPrimes: " << CountPrimes(vec) << endl;
    for (unsigned int i = 1; i <= maxThreads; i++)
    {
        cout << "ParallelCountPrimes(" << i << "): " << ParallelCountPrimes(vec, i) << endl;
    }
    cout << endl;
}

double MeasureRuntime(std::function<size_t(NumberVec const &)> f, NumberVec const &vec, size_t &result)
{
    auto start = high_resolution_clock::now();
    result = f(vec);
    return duration<double>(high_resolution_clock::now() - start).count();
}

void TestRuntime(unsigned int maxThreads)
{
    NumberVec vec;
    cout << "*** Runtime tests ***" << endl;
    InitRandom(vec, largeN);
    size_t result = 0;
    double time1 = MeasureRuntime(CountPrimes, vec, result);
    cout << "CountPrimes: " << result << "; Runtime: " << time1 << endl;
    for (unsigned int i = 1; i <= maxThreads; i++)
    {
        double time = MeasureRuntime(std::bind(ParallelCountPrimes, _1, i), vec, result);
        cout << "ParallelCountPrimes(" << i << "): " << result << "; Runtime: " << time << "; Speedup: " <<
        time1 / time << endl;
    }
}

int main()
{
    unsigned int maxThreads = thread::hardware_concurrency() + 2;  // test up to 2 threads more than CPU cores available
    TestFunctional(maxThreads);
#ifdef NDEBUG
    TestRuntime(maxThreads);
#endif
    return 0;
}
