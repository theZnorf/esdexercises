#include <iostream>
#include "JuliaFractalCalculationCPU.h"
#include "JuliaFractalCalculationCUDA.h"
#include <exception>
#include <functional>
#include <memory>
#include <sstream>
#include <boost\thread.hpp>
#include "tsc_clock.h"
#include "DurationAnalyze.h"

int main()
{
    std::cout << "started" << std::endl;

    using FloatingType = double;
    using IntType = int;

    using FuncType = std::function < void(*)(pfc::complex<FloatingType>, size_t const) > ;

    long long const warmupCount = 2000000000;

    IntType const imageWidth = 1024;
    IntType const imageHeight = 1024;
    FloatingType const upperBound = 1000.0;
    IntType const maxIterations = 50;
    pfc::complex<FloatingType> lowerLeft(-2.0, -2.0);
    pfc::complex<FloatingType> upperRight(2.0, 2.0);
    bool printDurations = false;
    auto cpuThreads = { 1, 2, 4, 8, 16 };
    auto gpuThreads = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };

    try
    {
        julia::JuliaPixelCalculation<IntType, FloatingType> calc(upperBound, maxIterations);

        // cpu warmup
        std::cout << "Performing CPU warmup" << std::endl;
        boost::thread_group tg;
        for (auto i = 0; i < boost::thread::hardware_concurrency(); i++)
            tg.create_thread([warmupCount]()
        {
            for (auto i = 0; i < warmupCount; i++)
            {
                volatile double temp = 1.0 / 2.0 * 1.3;
                temp += 13.0;
            }
        });

        tg.join_all();

        std::cout << "Calculate" << std::endl;
        julia::DurationAnalyze analyze;

        //for (auto threadCount : cpuThreads)
        //{
        //    std::shared_ptr<julia::JuliaFractalCalculation<IntType, FloatingType>> calc(
        //        new julia::JuliaFractalCalculationCPU<IntType, FloatingType>(calc, imageWidth, imageHeight, lowerLeft, upperRight, threadCount));

        //    analyze.RunCalculation(calc, "CPU", threadCount, printDurations);
        //}

        for (auto threadCount : gpuThreads)
        {
            std::shared_ptr<julia::JuliaFractalCalculation<IntType, FloatingType>> calc(
                new julia::JuliaFractalCalculationCUDA<IntType, FloatingType>(calc, imageWidth, imageHeight, lowerLeft, upperRight, threadCount));

            analyze.RunCalculation(calc, "GPU", threadCount, printDurations, false, "images/big_julia_");
        }

        std::cout << "Write results" << std::endl;
        analyze.WriteCsv("result_big.csv", ";");
    }
    catch (std::exception & e)
    {
        std::cerr << "EXCEPTION: " << e.what() << std::endl;
        getchar();
        return 1;
    }

    std::cout << "finished" << std::endl;
    getchar();
    return 0;
}