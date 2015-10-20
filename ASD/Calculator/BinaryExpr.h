#ifndef BINARYEXPR_H
#define BINARYEXPR_H

#include <functional>
#include <cmath>
#include "Expression.h"

template <typename Op>
class BinaryExpr: public Expression {
public:
  BinaryExpr(Expression *expr1, Expression *expr2) : mExpr1(expr1), mExpr2(expr2) {}

  virtual ~BinaryExpr() { 
    delete mExpr1;
    delete mExpr2;
  }

  virtual double Evaluate() const override { 
    return Op()(mExpr1->Evaluate(), mExpr2->Evaluate());
  }

private:
  Expression *mExpr1;
  Expression *mExpr2;
};

using AddExpr = BinaryExpr<std::plus<double>>;
using SubExpr = BinaryExpr<std::minus<double>>;
using MultExpr = BinaryExpr<std::multiplies<double>>;
using DivExpr = BinaryExpr<std::divides<double>>;

struct Power: std::binary_function<double, double, double> {
  double operator()(double const x, double const y) const { return pow(x, y); }
};

using PowExpr = BinaryExpr<Power>;

#endif
