#include <algorithm>
#include <cmath>
#include <cassert>
#include <functional>
#include <tbb/parallel_reduce.h>
#include <tbb/parallel_sort.h>
#include <mutex>
#include <iostream>
#include <thread>
#include "Average.h"

using namespace std;

namespace
{

    int ComputeMode(Numbers const &sortedNumbers)
    {
        int mode = sortedNumbers[0];
        size_t maxCount = 1;
        size_t i = 0;
        size_t size = sortedNumbers.size();
        while (i < size)
        {
            size_t j = i + 1;
            int nr = sortedNumbers[i];
            while (j < size && nr == sortedNumbers[j])
            {
                j++;
            }
            assert(j == size || nr < sortedNumbers[j]);
            size_t count = j - i;
            if (count > maxCount)
            {
                maxCount = count;
                mode = nr;
            }
            i = j;
        }
        return mode;
    }

    double ComputeMedian(Numbers const &sortedNumbers)
    {
        size_t size = sortedNumbers.size();
        size_t m = size / 2;
        return size % 2 != 0 ? sortedNumbers[m] :
               (sortedNumbers[m] + sortedNumbers[m - 1]) / 2.0;
    }

    void ComputeMeans(Numbers const &numbers, Averages &averages)
    {
        double sum = 0;
        double logSum = 0;
        double reciprocalSum = 0;
        double quadSum = 0;
        for (auto nr : numbers)
        {
            sum += nr;
            logSum += log(nr);
            reciprocalSum += 1.0 / nr;
            quadSum += nr * nr;
        }
        double size = (double) numbers.size();
        averages.arithmeticMean = sum / size;
        averages.geometricMean = exp(logSum / size);
        averages.harmonicMean = size / reciprocalSum;
        averages.quadraticMean = sqrt(quadSum / size);
    }

} // namespace

bool ComputeAverages(Numbers const &numbers, Averages &averages)
{
    if (numbers.empty())
    {
        return false;
    }
    Numbers sortedNumbers = numbers;
    sort(sortedNumbers.begin(),
         sortedNumbers.end());  // sorting required for mode and median
    averages.mode = ComputeMode(sortedNumbers);
    averages.median = ComputeMedian(sortedNumbers);
    ComputeMeans(numbers, averages);
    return true;
}

bool ParallelComputeAverages(Numbers const &numbers, Averages &averages)
{
    using TIter = Numbers::const_iterator;
    using Range = tbb::blocked_range<TIter>;

    mutex m;

    auto grainSize = 0;

    if (numbers.empty())
    {
        return false;
    }

    Averages avg{0, 0, 0, 0, 0, 0};

    // sort numbers for mode and median
    Numbers sorted = numbers;
    tbb::parallel_sort(sorted);

    Averages result = tbb::parallel_reduce(
            Range(numbers.begin(), numbers.end(), grainSize), avg,
            [](Range const &range, Averages avg)
            {
                for (auto nr : range)
                {
                    avg.arithmeticMean += nr;
                    avg.geometricMean += log(nr);
                    avg.harmonicMean += 1.0 / nr;
                    avg.quadraticMean += nr * nr;
                }
                return avg;
            }, [](Averages const &arg0, Averages const &arg1)
            {
                Averages avg;
                avg.arithmeticMean = arg0.arithmeticMean + arg1.arithmeticMean;
                avg.geometricMean = arg0.geometricMean + arg1.geometricMean;
                avg.harmonicMean = arg0.harmonicMean + arg1.harmonicMean;
                avg.quadraticMean = arg0.quadraticMean + arg1.quadraticMean;
                return avg;
            });

    // set result
    double size = (double) numbers.size();
    averages.arithmeticMean = result.arithmeticMean / size;
    averages.geometricMean = exp(result.geometricMean / size);
    averages.harmonicMean = size / result.harmonicMean;
    averages.quadraticMean = sqrt(result.quadraticMean / size);

    averages.median = (int)ComputeMedian(sorted);

    return true;
}


