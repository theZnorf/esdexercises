//
// Created by franz on 02.01.16.
//

#include "FibonacciIterator.h"
#include <iostream>

using namespace std;

int main(int argc, char **argv)
{
    cout << "Started" << endl;

    auto beginIdx = 0;
    auto endIdx = 10;

    cout << "Fibonacci numbers from " << beginIdx << " to " << endIdx << ":" <<
        endl;

    for (auto iter = MakeFibonacciIterator(beginIdx);
         iter != MakeFibonacciIterator(endIdx); iter++)
        cout << *iter << " ";
    cout << endl << endl;

    cout << "Each second Fibonacci number from " << beginIdx << " to " <<
        endIdx << ":" << endl;
    for (auto iter = MakeFibonacciIterator(beginIdx);
         iter != MakeFibonacciIterator(endIdx); iter += 2)
        cout << *iter << " ";

    cout << "Finished" << endl;

    return 0;
}