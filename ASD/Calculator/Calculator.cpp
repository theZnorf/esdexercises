#include <iostream>
#include <sstream>
#include <cassert>
#include <stdexcept>
#include "Calculator.h"
#include "UnaryExpr.h"
#include "BinaryExpr.h"
#include "Number.h"

using namespace std;

void Calculator::Execute(string const &cmd)
{
    string newcmd = AddSpaces(cmd);
    istringstream str(newcmd);
    scanner scan(str);
    AddKeywords(scan);
    if (scan.symbol_is_keyword(exit))
    {
        mRunning = false;
    }
    else
    {
        EvalExpr(scan);
    }
}

string Calculator::AddSpaces(string const &cmd)
{
    // Add spaces after + and - operator to prevent scanner from interpreting expressions such as +3 oder -2 as integer literals
    string newcmd;
    for (
            size_t i = 0; i < cmd.length(); i++)
    {
        char ch = cmd[i];
        newcmd += ch;
        if (ch == '+' || ch == '-')
        {
            newcmd += ' ';
        }
    }
    return newcmd;
}

void Calculator::AddKeywords(scanner &scan)
{
    scan.add_keyword("exit", exit);
    scan.add_keyword("avg", avg);
    scan.add_keyword("median", median);
}

// Evaluation = Expression.
void Calculator::EvalExpr(scanner &scan) const
{
    try
    {
        auto expr = ParseExpression(scan);
        if (scan.symbol_is_eof())
        {
            cout << expr->Evaluate() << endl;
        }
        else
        {
            cout << "Invalid command\n";
        }
        delete expr;
    }
    catch (exception const &e)
    {
        cout << e.what() << endl;
    }
}

// Expression = ["+" | "-"] MultExpr {("+" | "-") MultExpr}.
Expression *Calculator::ParseExpression(scanner &scan)
{
    char sign = '+';
    if (scan.symbol_is_plus())
    {
        scan.next_symbol();
    }
    else if (scan.symbol_is_minus())
    {
        sign = '-';
        scan.next_symbol();
    }
    auto expr = ParseMultExpr(scan);
    if (sign == '-')
    {
        expr = new NegativeExpr(expr);
    }
    while (scan.symbol_is_plus() || scan.symbol_is_minus())
    {
        bool add = scan.symbol_is_plus();
        scan.next_symbol();
        auto expr2 = ParseMultExpr(scan);
        if (add)
        {
            expr = new AddExpr(expr, expr2);
        }
        else
        {
            expr = new SubExpr(expr, expr2);
        }
    }
    return expr;
}

// MultExpr = PowExpr {("*" | "/") PowExpr}.
Expression *Calculator::ParseMultExpr(scanner &scan)
{
    auto expr = ParsePowExpr(scan);
    while (scan.symbol_is_multiply() || scan.symbol_is_division())
    {
        bool mult = scan.symbol_is_multiply();
        scan.next_symbol();
        auto expr2 = ParsePowExpr(scan);
        if (mult)
        {
            expr = new MultExpr(expr, expr2);
        }
        else
        {
            expr = new DivExpr(expr, expr2);
        }
    }
    return expr;
}

// PowExpr = Factor ["^" Factor]
Expression *Calculator::ParsePowExpr(scanner &scan)
{
    auto expr = ParseFactor(scan);
    if (scan.symbol_is_power())
    {
        scan.next_symbol();
        auto expr2 = ParseFactor(scan);
        expr = new PowExpr(expr, expr2);
    }
    return expr;
}

// Factor = Number | "(" Expression ")".
Expression *Calculator::ParseFactor(scanner &scan)
{
    if (scan.symbol_is_integer())
    {
        int x = scan.get_integer();
        scan.next_symbol();
        return new Number(x);
    }
    if (scan.symbol_is_real())
    {
        double x = scan.get_real();
        scan.next_symbol();
        return new Number(x);
    }
    if (!scan.symbol_is_lpar())
    {
        throw runtime_error("invalid factor");
    }
    scan.next_symbol();
    auto expr = ParseExpression(scan);
    if (!scan.symbol_is_rpar())
    {
        throw runtime_error("missing ')'");
    }
    scan.next_symbol();
    return expr;
}
