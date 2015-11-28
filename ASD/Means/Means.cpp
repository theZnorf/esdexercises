#include <algorithm>
#include <cmath>
#include <cassert>
#include <functional>
#include <thread>
#include <vector>
#include <iostream>
#include "Means.h"

using namespace std;

bool ComputeMeans(Numbers const &numbers, Means &averages)
{
    if (numbers.empty())
    {
        return false;
    }
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
    return true;
}

void calcPartialMeans(Iterator begin, Iterator end, Means &means)
{
    double sum = 0;
    double logSum = 0;
    double reciprocalSum = 0;
    double quadSum = 0;

    for (auto iter = begin; iter != end; iter++)
    {
        sum += *iter;
        logSum += log(*iter);
        reciprocalSum += 1.0 / *iter;
        quadSum += *iter * *iter;
    }
    means.arithmeticMean = sum;
    means.geometricMean = logSum;
    means.harmonicMean = reciprocalSum;
    means.quadraticMean = quadSum;
}

bool ParallelComputeMeans(Numbers const &numbers, Means &averages,
                          size_t nrOfThreads)
{
    if (numbers.empty())
    {
        return false;
    }

    // check number of threads
    if (nrOfThreads == 0)
        nrOfThreads =thread::hardware_concurrency();

    double size = (double) numbers.size();
    int range = (int) (size / nrOfThreads);

    Iterator begin = numbers.begin();
    Iterator end = begin + range;

    vector<thread> threads;
    vector<Means> means(nrOfThreads + 1);

    // create and start worker threads
    for (auto i = 0; i < nrOfThreads; i++)
    {
        auto func = bind(calcPartialMeans, begin, end, ref(means[i]));
        threads.emplace_back(func);

        begin += range;
        end += range;
    }

    // compute last elements by main thread
    calcPartialMeans(begin, numbers.end(), means[nrOfThreads]);

    // wait for worker
    for (auto &thread : threads)
        thread.join();

    // combine results
    for_each(means.begin(), means.end(), [&averages](Means const &means)
    {
        averages.arithmeticMean += means.arithmeticMean;
        averages.geometricMean += means.geometricMean;
        averages.harmonicMean += means.harmonicMean;
        averages.quadraticMean += means.quadraticMean;
    });

    averages.arithmeticMean = averages.arithmeticMean / size;
    averages.geometricMean = exp(averages.geometricMean / size);
    averages.harmonicMean = size / averages.harmonicMean;
    averages.quadraticMean = sqrt(averages.quadraticMean / size);

    return true;
}


