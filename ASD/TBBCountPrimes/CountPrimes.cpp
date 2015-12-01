#include <iostream>
#include <algorithm>
#include <numeric>
#include <functional>
#include <iterator>
#include <vector>
#include <string>
#include <limits>
#include <cmath>
#include <random>
#include <chrono>
#include <tbb/blocked_range.h>
#include <tbb/parallel_reduce.h>
#include <tbb/partitioner.h>

using namespace std;
using namespace std::placeholders;
using namespace std::chrono;
using namespace tbb;

size_t const smallN = 1000;
size_t const largeN = 250000;

typedef int Number;
typedef vector<Number> NumberVec;

bool IsPrime(Number const x) {
  if (x <= 1) {
    return false;
  }
  if (x == 2) {
    return true;
  }
  if (x % 2 == 0) {
    return false;
  }
  Number max = (Number)ceil(sqrt(double(x)));
  for (Number d = 3; d <= max; d += 2) {
    if (x % d == 0) {
      return false;
    }
  }
  return true;
}

size_t CountPrimes(NumberVec const &vec) {
  return count_if(vec.begin(), vec.end(), IsPrime);
}


size_t TBBCountPrimes(NumberVec const &vec) {
  // TODO
  return CountPrimes(vec);
}

void InitRandom(NumberVec &vec, size_t const nr) {
  auto rgen = std::bind(uniform_int_distribution<Number>(0, numeric_limits<Number>::max()), default_random_engine());
  vec.reserve(nr);
  generate_n(back_inserter(vec), nr, rgen);
}

void TestFunctional() {
  NumberVec vec;
  InitRandom(vec, smallN);
  cout << "*** Functional tests ***" << endl;
  cout << "CountPrimes: " << CountPrimes(vec) << endl;
  cout << "TBBCountPrimes: " << TBBCountPrimes(vec) << endl;
  cout << endl;
}

double MeasureRuntime(function<size_t(NumberVec const &)> f, NumberVec const &vec, size_t &result) {
  auto start = high_resolution_clock::now();
  result = f(vec);
  return duration<double>(high_resolution_clock::now() - start).count();
}

void TestRuntime() {
  NumberVec vec;
  cout << "*** Runtime tests ***" << endl;
  InitRandom(vec, largeN);
  size_t result = 0;
  double time1 = MeasureRuntime(CountPrimes, vec, result);
  cout << "CountPrimes: " << result << "; Runtime: " << time1 << endl;
  double time = MeasureRuntime(TBBCountPrimes, vec, result);
  cout << "TBBCountPrimes: " << result << "; Runtime: " << time << "; Speedup: " << time1 / time << endl;
}

int main() {
  TestFunctional();
#ifdef NDEBUG
  TestRuntime();
#endif
  return 0;
}
