cmake_minimum_required(VERSION 3.3)
project(FibonacciIterator)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++14")

find_package(Boost REQUIRED)
include_directories(BOOST_INCLUDE)

add_subdirectory(FibonacciIterator)
add_subdirectory(Test)