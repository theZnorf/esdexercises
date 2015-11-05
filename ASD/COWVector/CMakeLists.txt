cmake_minimum_required(VERSION 3.2)
project(COWVector)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++14")

set(SOURCE_FILES main.cpp COWVector.h)
add_executable(COWVector ${SOURCE_FILES})
