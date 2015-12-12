#include <algorithm>
#include <cassert>
#include <functional>
#include <tbb/parallel_reduce.h>
#include <tbb/parallel_sort.h>
#include <mutex>
#include <thread>
#include <map>
#include "Average.h"

Averages AddIntermediateAverages(const Averages &arg0, const Averages &arg1);

using namespace std;

namespace
{
    using TIter = Numbers::const_iterator;
    using Range = tbb::blocked_range<TIter>;
    using CountingMap = map<Numbers::value_type, size_t>;

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

    CountingMap CalcIntermediateMode(Range const &range, CountingMap count)
    {
        for (auto nr : range)
        {
            if (count.find(nr) == count.end())
                count[nr] = 1;
            else
                count[nr] += 1;
        }
        return count;
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


Averages AddIntermediateAverages(Averages const & arg0, Averages const & arg1)
{
    Averages avg;
    avg.arithmeticMean = arg0.arithmeticMean + arg1.arithmeticMean;
    avg.geometricMean = arg0.geometricMean + arg1.geometricMean;
    avg.harmonicMean = arg0.harmonicMean + arg1.harmonicMean;
    avg.quadraticMean = arg0.quadraticMean + arg1.quadraticMean;
    return avg;
}


CountingMap AddIntermediateModes(CountingMap const & arg0, CountingMap const & arg1)
{
    CountingMap count;
    for (auto kv : arg0)
    {
        count.insert(kv);
    }
    for (auto kv : arg1)
    {
        if (count.find(kv.first) == count.end())
            count.insert(kv);
        else
            count[kv.first] += kv.second;
    }

    return count;
}

bool ParallelComputeAverages(Numbers const &numbers, Averages &averages)
{
    auto grainSize = numbers.size() / thread::hardware_concurrency();

    if (numbers.empty())
    {
        return false;
    }

    Averages avg{0, 0, 0, 0, 0, 0};
    CountingMap countingMap;

    // sort numbers for mode and median
    Numbers sorted = numbers;
    tbb::parallel_sort(sorted);

    Averages avgResult = tbb::parallel_reduce(
            Range(numbers.begin(), numbers.end(), grainSize), avg,
            CalcIntermediateAverages,
            AddIntermediateAverages);

    /*CountingMap modeResult = tbb::parallel_reduce(
            Range(sorted.begin(), sorted.end(), grainSize), countingMap,
            CalcIntermediateMode,
            AddIntermediateModes);


    auto iterMode = max_element(modeResult.begin(), modeResult.end(),
                                [](auto arg0, auto arg1) { return arg0.second < arg1.second;});
    */

    // set result
    double size = (double) numbers.size();
    averages.arithmeticMean = avgResult.arithmeticMean / size;
    averages.geometricMean = exp(avgResult.geometricMean / size);
    averages.harmonicMean = size / avgResult.harmonicMean;
    averages.quadraticMean = sqrt(avgResult.quadraticMean / size);
    averages.mode = 0;
    averages.median = ComputeMedian(sorted);

    return true;
}



