//
// Created by franz on 02.01.16.
//

#ifndef FIBONACCIITERATOR_FIBONACCIITERATOR_H
#define FIBONACCIITERATOR_FIBONACCIITERATOR_H

#include <boost/iterator/iterator_facade.hpp>
#include <stdexcept>

template<typename T>
class FibonacciIterator
        : public boost::iterator_facade<FibonacciIterator<T>, T const, std::forward_iterator_tag>
{
    // Definitions
public:
    using difference_type = size_t;
    using reference = T&;

    // C-Tor
public:
    explicit FibonacciIterator(T index = 0)
            : mIndex(index)
    { }

    FibonacciIterator(FibonacciIterator const &) = default;

    // Methods
public:
    reference dereference() const
    {
        static T res;

        res = Fibonacci(mIndex);

        return res;
    }

    bool equal(FibonacciIterator<T> const &iter) const
    {
        return this->mIndex == iter.mIndex;
    }

    void increment()
    {
        mIndex++;
    }

    FibonacciIterator<T> operator+=(difference_type diff)
    {
        for (difference_type i = 0; i < diff; i++)
            increment();

        return *this;
    }

private:
    static T Fibonacci(T index)
    {
        T res = 0;

        if (index > 1)
        {
            T temp0 = 0;
            T temp1 = 1;

            for (T idx = 0; idx < index; idx++)
            {
                res = temp0 + temp1;
                temp0 = temp1;
                temp1 = res;
            }
        }
        else
            if (index == 1)
                res = 1;
            else
                res = 0;

        return res;
    }

    // Member
private:
    T mIndex;
};

template <typename T>
FibonacciIterator<T> MakeFibonacciIterator(T x)
{
    return FibonacciIterator<T>(x);
}

#endif //FIBONACCIITERATOR_FIBONACCIITERATOR_H
