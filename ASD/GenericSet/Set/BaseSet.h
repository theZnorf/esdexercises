//
// Created by franz on 28.11.15.
//

#ifndef GENERICSET_BASESET_H
#define GENERICSET_BASESET_H

#include <set>
#include <ostream>
#include <algorithm>

template<typename T>
class BaseSet
{
    // Definitions
protected:
    using Container = std::set<T>;

    // Methods
public:
    bool Add(T const &x)
    {
        auto ret = mCont.insert(x);

        return std::get<1>(ret);
    }

    bool Remove(T const &x)
    {
        auto ret = mCont.erase(x);

        return ret > 0;
    }

    bool Contains(T const &x) const
    {
        return mCont.find(x) != mCont.end();
    }

    size_t Count() const
    {
        return mCont.size();
    }

    virtual void Print(std::ostream &out) const
    {
        bool first = true;
        out << "{";
        for (auto val : mCont)
        {
            if (!first)
                out << ", ";
            out << val;
            first = false;
        }
        out << "}";
    }

    // Member
protected:
    Container mCont;
};


#endif //GENERICSET_BASESET_H
