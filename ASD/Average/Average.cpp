#include <algorithm>
#include <cmath>
#include <cassert>
#include <functional>
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
    if (numbers.empty())
    {
        return false;
    }

    // TODO
    return true;
}


