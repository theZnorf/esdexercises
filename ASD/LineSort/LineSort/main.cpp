#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <algorithm>
#include <chrono>
#include <mutex>
#include <condition_variable>
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

struct MyFlowControl
{
    bool ReadingFinished;
    condition_variable cv;
    mutex m;
};


string ReadLine(ifstream &in, MyFlowControl &myFlowControl,
                tbb::flow_control &fc)
{

    string line;
    getline(in, line);
    if (in.eof())
    {
        fc.stop();
        unique_lock<mutex> ul(myFlowControl.m);
        myFlowControl.ReadingFinished = true;
        myFlowControl.cv.notify_all();
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

void WriteLine(ofstream &out, MyFlowControl &myFlowControl,
               const string &line)
{
    unique_lock<mutex> ul(myFlowControl.m);
    while (!myFlowControl.ReadingFinished)
        myFlowControl.cv.wait(ul);
    out << line << endl;
}

void RunTBB(string const &inputName, string const &outputName)
{
    MyFlowControl myFlowControl;
    myFlowControl.ReadingFinished = false;

    ifstream in(inputName);
    ofstream out(outputName);
    string line;
    size_t max_number_of_live_tokens = 100000;

    tbb::parallel_pipeline(max_number_of_live_tokens,
                           tbb::make_filter<void, string>(
                                   tbb::filter::mode::serial_in_order,
                                   bind(ReadLine, ref(in), ref(myFlowControl),
                                        placeholders::_1)) &
                           tbb::make_filter<string, string>(
                                   tbb::filter::mode::parallel, &SortLine
                           ) &
                           tbb::make_filter<string, void>(
                                   tbb::filter::mode::serial_in_order,
                                   bind(WriteLine, ref(out), ref(myFlowControl),
                                        placeholders::_1)
                           ));
}

void TestRuntime(string const &inputName, string const &outputName)
{
    cout << "\nRuntime:\n";
    auto startTime = high_resolution_clock::now();
    Run(inputName, outputName);
    auto endTime = high_resolution_clock::now();
    double time1 = duration<double>(endTime - startTime).count();
    cout << "Serial: " << time1 << endl;
    startTime = high_resolution_clock::now();
    RunTBB(inputName, outputName);
    endTime = high_resolution_clock::now();
    double time2 = duration<double>(endTime - startTime).count();
    cout << "Parallel: " << time2 << " (Speedup: " <<
    time1 / time2 << ")\n";
}

int main(int argc, char *argv[])
{
    if (argc < 3)
    {
        cout << "Not enough arguments.\n";
        return 1;
    }
    TestRuntime(argv[1], argv[2]);
    return 0;
}
