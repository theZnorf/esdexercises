#ifndef JULIAFRACTALSSET_H
#define JULIAFRACTALSSET_H

#include "JuliaFractalCalculation.h"

#include <string>

namespace julia
{
    class JuliaFractalsSet
    {
        // Defintions
    public:

        // C-Tor
    public:
        JuliaFractalsSet(std::string const & filePrefix = "");

        // Methods
    public:



        // Member
    private:
        std::string const mFilePrefix;

    };
}


#endif