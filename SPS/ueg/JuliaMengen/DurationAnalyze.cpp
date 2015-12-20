#include "DurationAnalyze.h"
#include <fstream>

using namespace julia;

DurationAnalyze::DurationAnalyze()
{
}


void DurationAnalyze::WriteCsv(std::ostream & stream, std::string const & delim)
{
    for (auto tup : mDurations)
    {
        stream << std::get<0>(tup) << delim << std::get<1>(tup) << delim << std::get<2>(tup).count() << std::endl;
    }
}


void DurationAnalyze::WriteCsv(std::string const & filename, std::string const & delim)
{
    std::ofstream file(filename, std::ios::out);

    WriteCsv(file, delim);

    file.close();
}