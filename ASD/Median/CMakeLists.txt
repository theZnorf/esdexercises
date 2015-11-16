cmake_minimum_required(VERSION 3.3)
project(Median)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES Median.cpp)
add_executable(Median ${SOURCE_FILES})