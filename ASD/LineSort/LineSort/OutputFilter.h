//
// Created by franz on 15.12.15.
//

#ifndef LINESORT_OUTPUTFILTER_H
#define LINESORT_OUTPUTFILTER_H

#include "MyFlowControl.h"

#include <queue>
#include <ostream>
#include <string>
#include <tbb/pipeline.h>

template<typename T>
class OutputFilter
{
    // Definitions
private:
    using BufferedCont = std::queue<T>;

    // C-Tor
public:
    OutputFilter(std::ostream &out, MyFlowControl const &fc)
            : mOut(out), mFc(fc)
    { }

    // Methods
public:

    void operator()(std::string const &line)
    {
        // check flow control
        if (mFc.ReadingFinished)
        {
            // write elements from buffer to stream
            while (!mBuffer.empty())
            {
                mOut << mBuffer.front() << std::endl;
                mBuffer.pop();
            }

            // write new line
            mOut << line << std::endl;
        }
        else
        {
            // add line to buffer
            mBuffer.push(line);
        }
    }

    // Member
private:
    BufferedCont mBuffer;
    std::ostream &mOut;
    MyFlowControl const &mFc;
};


#endif //LINESORT_OUTPUTFILTER_H
