//
// Created by franz on 28.11.15.
//

#ifndef GENERICSET_SET_H
#define GENERICSET_SET_H

#include "BaseSet.h"
#include "CountingSet.h"

#include <algorithm>
#include <ostream>

template<typename T>
class Set : public BaseSet<T>
{
};

template<>
class Set<unsigned char> : public CountingSet<unsigned char>
{
};

template<>
class Set<signed char> : public CountingSet<signed char>
{
};

template<typename T>
class Set<T *> : public BaseSet<T *>
{
    //Methods
public:
    bool Add(T *x)
    {
        if (!Contains(x))
        {
            this->mCont.insert(x);
            return true;
        }

        return false;
    }

    bool Remove(T *x)
    {
        if (Contains(x))
        {
            this->mCont.erase(x);
            return true;
        }

        return false;
    }

    bool Contains(T *x) const
    {
        auto ret = find_if(this->mCont.begin(), this->mCont.end(), [x](T* ptr)
        {
            return *ptr == *x;
        });

        return ret != this->mCont.end();
    }

    void Print(std::ostream &out) const
    {
        bool first = true;
        out << "{";
        for (auto val : this->mCont)
        {
            if (!first)
                out << ", ";
            out << *val;
            first = false;
        }
        out << "}";
    }
};

template<typename T>
inline std::ostream &operator<<(std::ostream &out, Set<T> const &set)
{
    set.Print(out);
    return out;
}

#endif //GENERICSET_SET_H
