#ifndef DURATIONANALYZE_H
#define DURATIONANALYZE_H

#include <string>
#include <vector>
#include <functional>
#include <chrono>
#include <tuple>
#include <ostream>
#include <memory>
#include <iostream>
#include <algorithm>
#include <numeric>
#include <sstream>
#include <iomanip>
#include "JuliaFractalCalculation.h"
#include "complex.h"

namespace julia
{
    class DurationAnalyze
    {
        // Definitions
    public:
        using DurationType = std::chrono::high_resolution_clock::duration;
        using TagType = std::string;
        using AdditionalTagType = std::string;
        using DurationsVect = std::vector < DurationType > ;
        using DurationCont = std::vector <std::tuple<TagType, AdditionalTagType, DurationType>>;
        template <typename T, typename TF>
        using CalculationPointer = std::shared_ptr < JuliaFractalCalculation<T, TF> > ;

		template <typename TF>
		struct FractalField
		{
			TF imagBegin = -1.0;
			TF imagEnd = 1.0;
			TF imagStep = 0.5;
			TF realBegin = -1.0;
			TF realEnd = 1.0;
			TF realStep = 0.5;
		};

        // C-Tor
    public:
        DurationAnalyze();

        // Methods
    public:
        template <typename T, typename TF>
		void RunCalculation(FractalField<TF> fractalField, CalculationPointer<T, TF> pCalc, TagType const & tag, AdditionalTagType const & additionalTag, int version = 0, bool printDuration = false, bool saveFile = false, std::string const & filePrefix = "")
        {
            DurationsVect durations;

            std::cout << "Start Calculation: " << tag << "-" << additionalTag << std::endl;

			for (auto imag = fractalField.imagBegin; imag <= fractalField.imagEnd; imag += fractalField.imagStep)
            {
				for (auto real = fractalField.realBegin; real <= fractalField.realEnd; real += fractalField.realStep)
                {
                    pfc::complex<TF> c(real, imag);

                    if (printDuration)
                        std::cout << "calculating: " << tag << " - " << real << " - " << imag << std::endl;

                    durations.push_back(pfc::timed_run(1, std::mem_fn(&JuliaFractalCalculation<T, TF>::Calc), pCalc.get(), c, version));

                    if (saveFile)
                    {
                        std::stringstream strStream;

                        strStream << filePrefix << std::setprecision(2) << real << "_" << imag << ".bmp";

                        pCalc->GetImage().to_file(strStream.str());
                    }
                }
            }

            // calculate average duration, skipping 0
            DurationType duration;
            auto result = std::accumulate(durations.begin(), durations.end(), duration);;
            auto count = std::count_if(durations.begin(), durations.end(), [](DurationType const & duration) { return duration.count() > 0; });


            mDurations.emplace_back(tag, additionalTag, result / count);
        }

        void WriteCsv(std::ostream & stream, std::string const & delim = ",");

        void WriteCsv(std::string const & filename, std::string const & delim = ",");

        // Member
    private:
        DurationCont mDurations;
    };
}

#endif