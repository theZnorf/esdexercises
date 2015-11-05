//
// Franz Profelt
// S1410567019
//

#include <iostream>
#include <string>
#include <assert.h>
#include <functional>
#include "COWVector.h"

using namespace std;

template<typename T>
void assertEquals(T const & expected, T const & result)
{
    assert(expected == result);
}

int main(int argc, char **argv)
{
    cout << "started" << endl;

    try
    {
        std::array<int, 5> const testData = {1, 2, 3, 4, 5};
        std::array<int, 3> const testData1 = {6, 7, 8};

        cout << "create vector" << endl;
        ASD::COWVector<int> vect;

        cout << "fill with data" << endl;
        for (auto i : testData)
            vect.push_back(i);

        cout << "check filled data" << endl;
        assertEquals(testData.size(), vect.size());
        for (auto i = 0; i < testData.size(); i++)
            assertEquals(testData[i], vect.get(i));
        assertEquals(1, (int)vect.refCount());

        cout << "set and check new data" << endl;
        for (auto i = 0; i < testData1.size(); i++)
            vect.set(i, testData1[i]);
        for (auto i = 0; i < testData1.size(); i++)
            assertEquals(testData1[i], vect.get(i));
        for (auto i = testData1.size(); i < testData.size(); i++)
            assertEquals(testData[i], vect.get(i));

        cout << "remove all objects" << endl;

        auto const size = vect.size();
        for (auto i = 0; i < size; i++)
        {
            vect.pop_back();
            assertEquals(size - 1 - i, vect.size());
        }

        cout << "check empty pop" << endl;
        try
        {
            vect.pop_back();
            assert(false);
        }
        catch (out_of_range & e)
        { }

        cout << "check out of bounds behaviour" << endl;
        try
        {
            vect.get(vect.size());
            assert(false);
        }
        catch (out_of_range & e)
        { }

        cout << "fill vector with data" << endl;
        for (auto i : testData)
            vect.push_back(i);

        cout << "copy vector" << endl;
        ASD::COWVector<int> vect1(vect);

        cout << "check ref count" << endl;
        assertEquals(2, (int)vect.refCount());
        assertEquals(2, (int)vect1.refCount());

        cout << "check elements in copied vector" << endl;
        for (auto i = 0; i < testData.size(); i++)
            assertEquals(testData[i], vect1.get(i));

        cout << "change element in orignal vector" << endl;
        for (auto i = 0; i < testData1.size(); i++)
            vect.set(i, testData1[i]);

        cout << "check ref count" << endl;
        assertEquals(1, (int)vect.refCount());
        assertEquals(1, (int)vect1.refCount());

        cout << "check data in original vector" << endl;

        for (auto i = 0; i < testData1.size(); i++)
            assertEquals(testData1[i], vect.get(i));
        for (auto i = testData1.size(); i < testData.size(); i++)
            assertEquals(testData[i], vect.get(i));

        cout << "check data in copied vector" << endl;
        for (auto i = 0; i < testData.size(); i++)
            assertEquals(testData[i], vect1.get(i));
    }
    catch (exception & e)
    {
        cerr << "unexpected exception occured: " << e.what() << endl;
        return -1;
    }

    cout << "finished" << endl;
    return 0;
}