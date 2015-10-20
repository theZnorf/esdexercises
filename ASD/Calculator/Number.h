#ifndef NUMBER_H
#define NUMBER_H

#include "Expression.h"

class Number: public Expression {
public:
  explicit Number(double value) : mValue(value) {}
  virtual double Evaluate() const override { return mValue; }
private:
  double mValue;
};

#endif
