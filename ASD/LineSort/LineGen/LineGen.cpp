#include <iostream>
#include <fstream>
#include <string>
#include <ctime>
#include <functional>
#include <random>

using namespace std;

void Generate(std::string const &filename, int nrLines, int maxLen, int maxVal)
{
    default_random_engine engine((unsigned int) time(0));
    auto rgenLen = bind(uniform_int_distribution<int>(0, maxLen), engine);
    auto rgenVal = bind(uniform_int_distribution<int>(0, maxVal), engine);
    ofstream out(filename.c_str());
    for (int i = 0; i < nrLines; i++)
    {
        int len = rgenLen();
        for (int j = 0; j < len; j++)
        {
            out << rgenVal() << " ";
        }
        out << endl;
    }
}

int main(int argc, char *argv[])
{
    string filename;
    if (argc > 1)
    {  // filename passed as command-line parameter
        filename = argv[1];
    }
    else
    {  // read filename from cin
        cout << "Filename: ";
        cin >> filename;
    }
    int nrLines = 0;
    int maxLen = 0;
    int maxVal = 0;
    cout << "Nr. lines: ";
    cin >> nrLines;
    cout << "Max. line length: ";
    cin >> maxLen;
    cout << "Max. value: ";
    cin >> maxVal;
    Generate(filename, nrLines, maxLen, maxVal);
    return 0;
}
