//
// Created by franz on 28.11.15.
//

#include "Set.h"
#include <iostream>

using namespace std;

void PrintIntSet(ostream & out)
{
    Set<int> set;
    set.Add(1);
    set.Add(4);
    set.Add(-344);
    set.Add(544);

    out << "Printing int set: " << set << endl;
}

void PrintUnsignedCharSet(ostream & out)
{
    Set<unsigned char> set;
    set.Add(1);
    set.Add(4);
    set.Add(134);
    set.Add(245);

    out << "Printing unsigned char set: " << set << endl;
}

void PrintSignedCharSet(ostream & out)
{
    Set<signed char> set;
    set.Add(1);
    set.Add(4);
    set.Add(127);
    set.Add(-3);

    out << "Printing signed char set: " << set << endl;
}

void PrintIntPtrSet(ostream & out)
{
    int i0 = 1, i1 = 43, i2 = -224, i3 = 1234, i4 = -2443;

    Set<int*> set;
    set.Add(&i0);
    set.Add(&i1);
    set.Add(&i2);
    set.Add(&i3);
    set.Add(&i4);

    out << "Printing int pointer set: " << set << endl;
}

int main()
{
    cout << "started" << endl;

    PrintIntSet(cout);
    PrintUnsignedCharSet(cout);
    PrintSignedCharSet(cout);
    PrintIntPtrSet(cout);

    cout << "finished" << endl;
}