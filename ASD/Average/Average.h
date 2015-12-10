#ifndef AVERAGE_H
#define AVERAGE_H

#include <vector>

typedef std::vector<int> Numbers;

struct Averages
{
    int mode;
    double median;
    double arithmeticMean;
    double geometricMean;
    double harmonicMean;
    double quadraticMean;
};

bool ComputeAverages(Numbers const &numbers, Averages &averages);

bool ParallelComputeAverages(Numbers const &numbers, Averages &averages);

#endif
