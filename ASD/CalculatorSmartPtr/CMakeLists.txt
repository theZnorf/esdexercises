cmake_minimum_required(VERSION 3.3)
project(CalculatorSmartPtr)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++14")
find_package( Boost COMPONENTS system thread REQUIRED )

include_directories(BOOST_INCLUDE)

set(SOURCE_FILES
    base.h
    BinaryExpr.h
    Calculator.cpp
    Calculator.h
    Expression.cpp
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

add_executable(CalculatorSmartPtr ${SOURCE_FILES})
target_link_libraries(CalculatorSmartPtr ${Boost_LIBRARIES})