#include "OutputFilter.h"
#include "MyFlowControl.h"

#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <algorithm>
#include <chrono>
#include <tbb/pipeline.h>

using namespace std;
using namespace std::chrono;

using Numbers = vector<int>;

bool ExtractNumbers(std::string const &str, Numbers &numbers)
{
    long long number = 0;
    bool isNumber = false;
    for (size_t i = 0; i < str.size(); i++)
    {
        char ch = str[i];
        if (ch == ' ' || ch == '\t' || ch == '\r' || ch == '\n')
        {
            if (isNumber)
            {
                numbers.push_back(int(number));
                isNumber = false;
                number = 0;
            }
        }
        else
            if (ch >= '0' && ch <= '9')
            {
                isNumber = true;
                number = number * 10 + ch - '0';
                if (number > numeric_limits<int>::max())
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
    }
    if (isNumber)
    {
        numbers.push_back((int) number);
    }
    return true;
}

std::string ConvertToString(Numbers const &numbers)
{
    std::string str;
    str.reserve(numbers.size() * 11);
    for (int number : numbers)
    {
        int d = 1;
        while (d <= number / 10)
        {
            d *= 10;
        }
        while (d > 0)
        {
            str += char(number / d + '0');
            number %= d;
            d /= 10;
        }
        str += ' ';
    }
    return str;
}

void Run(string const &inputName, string const &outputName)
{
    ifstream in(inputName);
    ofstream out(outputName);
    string line;
    while (getline(in, line))
    {
        vector<int> numbers;
        if (ExtractNumbers(line, numbers))
        {
            sort(numbers.begin(), numbers.end());
            out << ConvertToString(numbers) << endl;
        }
        else
        {
            out << "*** error ***" << endl;
        }
    }
}

string ReadLine(ifstream &in, MyFlowControl &myFlowControl,
                tbb::flow_control &fc)
{
    string line;
    if (!getline(in, line))
    {
        fc.stop();
        myFlowControl.ReadingFinished = true;
        return string("");
    }
    return line;
}

string SortLine(const string &line)
{
    Numbers numbers;
    ExtractNumbers(line, numbers);
    sort(numbers.begin(), numbers.end());
    return ConvertToString(numbers);
}

void RunTBB(string const &inputName, string const &outputName)
{
    using WriteFilter = OutputFilter<string>;

    ifstream in(inputName);
    ofstream out(outputName);

    if (!in)
        throw runtime_error("Invalid Input file");
    if (!out)
        throw runtime_error("Invalid output file");

    size_t max_number_of_live_tokens = 100000;
    MyFlowControl fc;
    WriteFilter writeFilter(out, fc);

    tbb::parallel_pipeline(max_number_of_live_tokens,
                           tbb::make_filter<void, string>(
                                   tbb::filter::mode::serial_in_order,
                                   bind(ReadLine, ref(in), ref(fc),
                                        placeholders::_1)) &
                           tbb::make_filter<string, string>(
                                   tbb::filter::mode::parallel, &SortLine
                           ) &
                           tbb::make_filter<string, void>(
                                   tbb::filter::mode::serial_in_order,
                                   [&writeFilter](string line)
                                   {
                                       writeFilter(line);
                                   }
                           ));
}

int main(int argc, char *argv[])
{
    if (argc < 3)
    {
        cout << "Not enough arguments.\n";
        return 1;
    }
    try
    {
        RunTBB(argv[1], argv[2]);
    }
    catch (exception &e)
    {
        cerr << "Exception: " << e.what() << endl;
        return -1;
    }

    return 0;
}
