cmake_minimum_required(VERSION 3.3)
project(Means)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -pthread")

set(SOURCE_FILES main.cpp Means.cpp)
add_executable(Means ${SOURCE_FILES})