//
// Created by franz on 15.12.15.
//

#ifndef LINESORT_MYFLOWCONTROL_H
#define LINESORT_MYFLOWCONTROL_H

#include <atomic>

struct MyFlowControl
{
    // C-Tor
public:
    MyFlowControl()
            : ReadingFinished(false)
    { }

    // Member
public:
    std::atomic_bool ReadingFinished;
};


#endif //LINESORT_MYFLOWCONTROL_H
