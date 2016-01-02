#ifndef UNARYEXPR_H
#define UNARYEXPR_H

#include <functional>
#include <memory>
#include "Expression.h"

template <typename Op>
class UnaryExpr: public Expression {
public:
  explicit UnaryExpr(std::unique_ptr<Expression> &&expr) : mExpr(std::move(expr)) {}
  virtual double Evaluate() const { return Op()(mExpr->Evaluate()); }
private:
  std::unique_ptr<Expression> mExpr;
};

using NegativeExpr = UnaryExpr<std::negate<double>>;

#endif
