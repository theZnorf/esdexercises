cmake_minimum_required(VERSION 3.3)
project(CountPrimes)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

include_directories(/opt/tbb/include/)
link_directories(/opt/tbb/lib/intel64/gcc4.4/)

set(SOURCE_FILES CountPrimes.cpp)
add_executable(CountPrimes ${SOURCE_FILES})