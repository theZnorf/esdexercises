cmake_minimum_required(VERSION 3.3)
project(CountPrimes)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(TBB_DIR /opt/tbb)

include_directories(${TBB_DIR}/include/)
link_directories(${TBB_DIR}/lib/intel64/gcc4.4/)

set(SOURCE_FILES CountPrimes.cpp)
add_executable(CountPrimes ${SOURCE_FILES})
target_link_libraries(CountPrimes tbb)