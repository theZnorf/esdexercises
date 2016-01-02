#ifndef EXPRESSION_H
#define EXPRESSION_H

#include <stddef.h>
#include <boost/pool/singleton_pool.hpp>

class Expression
{
    // Definitions
private:
    template<typename T>
    using SinglePool = boost::singleton_pool<T, sizeof(T)>;

public:
    virtual ~Expression()
    { }

    virtual double Evaluate() const = 0;

    // overloaded memory methods
    void * operator new(size_t size);
    void operator delete(void * ptr, size_t size);
};

#endif