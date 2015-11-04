#include <iostream>
#include <string>
#include "Calculator.h"

#ifdef _MSC_VER
#include <crtdbg.h>
#endif

using namespace std;

namespace {

  void Run() {
    Calculator calc;
    while (calc.IsRunning()) {
      cout << "> ";
      string cmd;
      getline(cin, cmd);
      calc.Execute(cmd);
    }
  }

} // namespace

int main() {
  // enable memory leak detection under MSVC
#if defined(_MSC_VER) && defined (_DEBUG)
  _CrtSetDbgFlag(_CrtSetDbgFlag(_CRTDBG_REPORT_FLAG) | _CRTDBG_LEAK_CHECK_DF);
#endif
  Run();
  return 0;
}
