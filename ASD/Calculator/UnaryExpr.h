#ifndef UNARYEXPR_H
#define UNARYEXPR_H

#include <functional>
#include "Expression.h"

template <typename Op>
class UnaryExpr: public Expression {
public:
  explicit UnaryExpr(Expression *expr) : mExpr(expr) {}
  virtual ~UnaryExpr() { delete mExpr; }
  virtual double Evaluate() const override { return Op()(mExpr->Evaluate()); }
private:
  Expression *mExpr;
};

using NegativeExpr = UnaryExpr<std::negate<double>>;

#endif
