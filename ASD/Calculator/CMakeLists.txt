cmake_minimum_required(VERSION 3.3)
project(Calculator)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++14")

set(SOURCE_FILES
    base.h
    Calculator.cpp
    Calculator.h
    main.cpp
    scanner.cpp
    scanner.h
    scanner_impl.cpp
    scanner_impl.h
    symbol.cpp
    symbol.h)

add_executable(Calculator ${SOURCE_FILES})