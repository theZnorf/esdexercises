#include <iostream>
#include "JuliaFractalCalculationCPU.h"
#include "JuliaFractalCalculationCUDA.h"
#include <exception>
#include <functional>
#include <memory>
#include <sstream>
#include <boost\thread.hpp>
#include <vector>
#include "tsc_clock.h"
#include "DurationAnalyze.h"

int main(int argc, char* argv[])
{
    std::cout << "started" << std::endl;

    try
    {

        // default configurations
        using FloatingType = float;
        using IntType = int;

        using FuncType = std::function < void(*)(pfc::complex<FloatingType>, size_t const) > ;

        long long const warmupCount = 2000000000;

        IntType const imageWidth = 5000;
        IntType const imageHeight = 5000;
        FloatingType const upperBound = 1000.0;
        IntType const maxIterations = 50;
        pfc::complex<FloatingType> lowerLeft(-2.0, -2.0);
        pfc::complex<FloatingType> upperRight(2.0, 2.0);

	    julia::DurationAnalyze::FractalField<FloatingType> field;
	    field.imagBegin = 0.0;
	    field.imagEnd = 0.0;
	    field.imagStep = 1.0;
	    field.realBegin = 0.0;
	    field.realEnd = 0.0;
	    field.realStep = 1.0;

        bool printDurations = false;
        bool saveCpuImages = true;
        bool saveGpuImages = false;
        bool saveGpuVersionImages = true;

        std::string imagePrefix = "images/julia_";

        std::initializer_list<size_t> cpuThreads = {1}; //{ 1, 2, 4, 8, 16 };
        std::initializer_list<size_t> gpuThreads = {}; //{ 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
        std::vector<int> gpuVersions = {2, 3}; //{ 2, 3, 4 };
        size_t gpuVersionsThreadCount = 1024;
        int defaultVersion = 2;

        bool enableCpuWarmUp = false;

        // check command line arguments
        if (argc > 1)
        {
            gpuVersions.clear();
            for (auto i = 1; i < argc; i++)
                gpuVersions.push_back(std::stoi(argv[i]));
        }

        julia::JuliaPixelCalculation<IntType, FloatingType> pixelCalc(upperBound, maxIterations);

        // cpu warmup
        if (enableCpuWarmUp)
        {
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
        }

        std::cout << "Calculate" << std::endl;
        julia::DurationAnalyze analyze;

        for (auto threadCount : cpuThreads)
        {
            std::shared_ptr<julia::JuliaFractalCalculation<IntType, FloatingType>> calc(
                new julia::JuliaFractalCalculationCPU<IntType, FloatingType>(pixelCalc, imageWidth, imageHeight, lowerLeft, upperRight, threadCount));

            analyze.RunCalculation(field, calc, "CPU", std::to_string(threadCount), defaultVersion, printDurations, saveCpuImages, imagePrefix + std::to_string(threadCount));
        }

        for (auto threadCount : gpuThreads)
        {
            std::shared_ptr<julia::JuliaFractalCalculation<IntType, FloatingType>> calc(
                new julia::JuliaFractalCalculationCUDA<IntType, FloatingType>(pixelCalc, imageWidth, imageHeight, lowerLeft, upperRight, threadCount));

            analyze.RunCalculation(field, calc, "GPU", std::to_string(threadCount), defaultVersion, printDurations, saveGpuImages, imagePrefix + std::to_string(threadCount));
        }

        for (auto version : gpuVersions)
        {
            std::shared_ptr<julia::JuliaFractalCalculation<IntType, FloatingType>> calc(
                new julia::JuliaFractalCalculationCUDA<IntType, FloatingType>(pixelCalc, imageWidth, imageHeight, lowerLeft, upperRight, gpuVersionsThreadCount));

            analyze.RunCalculation(field, calc, "GPU", std::to_string(version), version, printDurations, saveGpuVersionImages, imagePrefix + std::to_string(version));
        }

        std::cout << "Write results" << std::endl;
        analyze.WriteCsv("result_float_optimized.csv", ";");
    }
    catch (std::exception & e)
    {
        std::cerr << "EXCEPTION: " << e.what() << std::endl;
        return 1;
    }

    std::cout << "finished" << std::endl;
    return 0;
}