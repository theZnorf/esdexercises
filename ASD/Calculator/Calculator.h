#ifndef CALCULATOR_H
#define CALCULATOR_H

#include <string>
#include <memory>
#include <functional>
#include "scanner.h"

using Expression = std::function<double()>;

class Calculator {
public:

  // Parse and executes the given command. 
  void Execute(std::string const &cmd);

  bool IsRunning() const { return mRunning; }

private:
  enum Commands { exit, eval, avg, median };

  bool mRunning = true;

  static std::string AddSpaces(std::string const &cmd);
  void AddKeywords(scanner &scan);
  void EvalExpr(scanner &scan) const;

  static Expression ParseExpression(scanner &scan);
  static Expression ParseMultExpr(scanner &scan);
  static Expression ParsePowExpr(scanner &scan);
  static Expression ParseFactor(scanner &scan);
};

#endif
