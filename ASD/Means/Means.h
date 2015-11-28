#ifndef AVERAGE_H
#define AVERAGE_H

#include <vector>

typedef std::vector<int> Numbers;
typedef Numbers::const_iterator Iterator;

struct Means
{
    double arithmeticMean;
    double geometricMean;
    double harmonicMean;
    double quadraticMean;
};

bool ComputeMeans(Numbers const &numbers, Means &averages);

bool ParallelComputeMeans(Numbers const &numbers, Means &averages,
                          size_t nrOfThreads = 0);

#endif
