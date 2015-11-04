#ifndef EXPRESSION_H
#define EXPRESSION_H

class Expression {
public:
  virtual ~Expression() {}
  virtual double Evaluate() const = 0;
};

#endif
