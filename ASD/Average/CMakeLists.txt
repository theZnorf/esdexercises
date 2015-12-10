cmake_minimum_required(VERSION 3.3)
project(Average)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++14")

set(TBB_DIR /opt/tbb)

include_directories(${TBB_DIR}/include/)
link_directories(${TBB_DIR}/lib/intel64/gcc4.4/)

set(SOURCE_FILES
    Average.cpp
    Average.h
    main.cpp)

add_executable(Average ${SOURCE_FILES})
target_link_libraries(Average tbb)