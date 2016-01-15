//
// Created by franz on 02.01.16.
//

#include "Expression.h"
#include "Number.h"
#include "BinaryExpr.h"
#include "UnaryExpr.h"

void *Expression::operator new(size_t size)
{
    if (size == sizeof(Number))
    {
        return SinglePool<Number>::malloc();
    }
    else if (size == sizeof(AddExpr)) // same size as other binary expressions
    {
        return SinglePool<AddExpr>::malloc();
    }
    else if (size == sizeof(NegativeExpr)) // same size as other unary expressions
    {
        return SinglePool<NegativeExpr>::malloc();
    }
    else
        return ::operator new(size);
}

void Expression::operator delete(void *ptr, size_t size)
{
    if (size == sizeof(Number))
    {
        SinglePool<Number>::free(ptr);
    }
    else if (size == sizeof(AddExpr)) // same size as other binary expressions
    {
        SinglePool<AddExpr>::free(ptr);
    }
    else if (size == sizeof(NegativeExpr)) // same size as other unary expressions
    {
        SinglePool<NegativeExpr>::free(ptr);
    }
    else
        ::operator delete(ptr);
}
