cmake_minimum_required(VERSION 3.3)
project(CountPrimes)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -pthread")

set(SOURCE_FILES CountPrimes.cpp)
add_executable(CountPrimes ${SOURCE_FILES})