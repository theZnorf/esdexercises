//
// Created by franz on 02.01.16.
//

#include "Expression.h"
#include "Number.h"

void *Expression::operator new(size_t size)
{
    // check size
    if (size == sizeof(Number))
        return SinglePool<Number>::malloc();
        // TODO: Handle unary and binary expression
    else
        return ::operator new(size);
}

void Expression::operator delete(void *ptr, size_t size)
{
    // check size
    if (size == sizeof(Number))
        SinglePool<Number>::free(ptr);
        // TODO: Handle unary and binary expression
    else
        ::operator delete(ptr);
}
