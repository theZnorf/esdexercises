#ifndef CALCULATOR_H
#define CALCULATOR_H

#include <string>
#include <memory>
#include "scanner.h"
#include "Expression.h"

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

  static std::unique_ptr<Expression> ParseExpression(scanner &scan);
  static std::unique_ptr<Expression> ParseMultExpr(scanner &scan);
  static std::unique_ptr<Expression> ParsePowExpr(scanner &scan);
  static std::unique_ptr<Expression> ParseFactor(scanner &scan);
};

#endif
