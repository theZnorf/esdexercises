//
// Created by franz on 28.11.15.
//

#ifndef GENERICSET_COUNTINGSET_H
#define GENERICSET_COUNTINGSET_H

#include <bitset>
#include <algorithm>
#include <ostream>

template<typename T>
class CountingSet
{
    // Definitions
private:
    static const size_t maxVal = std::numeric_limits<T>::max() +
                                 abs(std::numeric_limits<T>::min());

    using Container = std::bitset<maxVal + 1>;
    using UnsignedType = typename std::make_unsigned<T>::type;
    using PrintType = int;

    // Methods
public:
    bool Add(T const &x)
    {
        if (!mCont.test((UnsignedType) x))
        {
            mCont.set((UnsignedType) x);
            return true;
        }

        return false;
    }

    bool Remove(T const &x)
    {
        if (mCont.test((UnsignedType) x))
        {
            mCont.reset((UnsignedType) x);
            return true;
        }

        return false;
    }

    bool Contains(T const &x) const
    {
        return mCont.test((UnsignedType) x);
    }

    size_t Count() const
    {
        return mCont.count();
    }

    void Print(std::ostream &out) const
    {
        bool first = true;

        out << "{";
        for (auto val = std::numeric_limits<T>::min();
             val < std::numeric_limits<T>::max(); val++)
        {
            if (mCont.test((UnsignedType) val))
            {
                if (!first)
                    out << ", ";
                out << (PrintType)val;
                first = false;
            }
        }
        out << "}";
    }

    // Member
private:
    Container mCont;
};


#endif //GENERICSET_COUNTINGSET_H
