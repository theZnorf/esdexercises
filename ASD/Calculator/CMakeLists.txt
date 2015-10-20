cmake_minimum_required(VERSION 3.3)
project(Calculator)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++14")

set(SOURCE_FILES
    base.h
    BinaryExpr.h
    Calculator.cpp
    Calculator.h
    Expression.h
    main.cpp
    Number.h
    scanner.cpp
    scanner.h
    scanner_impl.cpp
    scanner_impl.h
    symbol.cpp
    symbol.h
    UnaryExpr.h)

add_executable(Calculator ${SOURCE_FILES})