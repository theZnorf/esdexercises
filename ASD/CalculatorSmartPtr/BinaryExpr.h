#ifndef BINARYEXPR_H
#define BINARYEXPR_H

#include <functional>
#include <memory>
#include <cmath>
#include "Expression.h"

template <typename Op>
class BinaryExpr: public Expression {
public:
  BinaryExpr(std::unique_ptr<Expression> &&expr1, std::unique_ptr<Expression> &&expr2) : mExpr1(std::move(expr1)), mExpr2(std::move(expr2)) {}

  virtual double Evaluate() const override { return Op()(mExpr1->Evaluate(), mExpr2->Evaluate()); }

private:
  std::unique_ptr<Expression> mExpr1;
  std::unique_ptr<Expression> mExpr2;
};

using AddExpr = BinaryExpr<std::plus<double>>;
using SubExpr = BinaryExpr<std::minus<double>>;
using MultExpr = BinaryExpr<std::multiplies<double>>;
using DivExpr = BinaryExpr<std::divides<double>>;

struct Power : std::binary_function<double, double, double> {
  double operator()(double const x, double const y) const { return pow(x, y); }
};

using PowExpr = BinaryExpr<Power>;

#endif
