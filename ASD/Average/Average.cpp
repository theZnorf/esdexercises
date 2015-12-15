#include <algorithm>
#include <cassert>
#include <tbb/parallel_reduce.h>
#include <tbb/parallel_sort.h>
#include <tbb/parallel_invoke.h>
#include <thread>
#include "Average.h"

Averages AddIntermediateAverages(const Averages &arg0, const Averages &arg1);

using namespace std;

namespace
{
    using TIter = Numbers::const_iterator;
    using Range = tbb::blocked_range<TIter>;

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

    Averages CalcIntermediateAverages(Range const &range, Averages avg)
    {
        for (auto nr : range)
        {
            avg.arithmeticMean += nr;
            avg.geometricMean += log(nr);
            avg.harmonicMean += 1.0 / nr;
            avg.quadraticMean += nr * nr;
        }
        return avg;
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


Averages AddIntermediateAverages(Averages const &arg0, Averages const &arg1)
{
    Averages avg;
    avg.arithmeticMean = arg0.arithmeticMean + arg1.arithmeticMean;
    avg.geometricMean = arg0.geometricMean + arg1.geometricMean;
    avg.harmonicMean = arg0.harmonicMean + arg1.harmonicMean;
    avg.quadraticMean = arg0.quadraticMean + arg1.quadraticMean;
    return avg;
}

bool ParallelComputeAverages(Numbers const &numbers, Averages &averages)
{
    if (numbers.empty())
    {
        return false;
    }


    // sort numbers for mode and median
    Numbers sorted = numbers;
    Averages avgResult;
    int modeResult;
    double medianResult;

    // sort numbers for median / mode
    tbb::parallel_sort(sorted);

    auto medianFunc = [&medianResult, &sorted]()
    {
        medianResult = ComputeMedian(sorted);
    };

    auto avgFunc = [&avgResult, &numbers]()
    {
        auto grainSize = numbers.size() / thread::hardware_concurrency();
        Averages avg{0, 0, 0, 0, 0, 0};
        avgResult = tbb::parallel_reduce(
                Range(numbers.begin(), numbers.end(), grainSize), avg,
                CalcIntermediateAverages,
                AddIntermediateAverages);
    };

    auto modeFunc = [&modeResult, &sorted]()
    {
        modeResult = ComputeMode(sorted);
    };

    // invoke parallel execution of calculations
    tbb::parallel_invoke(avgFunc, modeFunc, medianFunc);

    // set result
    double size = (double) numbers.size();
    averages.arithmeticMean = avgResult.arithmeticMean / size;
    averages.geometricMean = exp(avgResult.geometricMean / size);
    averages.harmonicMean = size / avgResult.harmonicMean;
    averages.quadraticMean = sqrt(avgResult.quadraticMean / size);
    averages.mode = modeResult;
    averages.median = medianResult;

    return true;
}



