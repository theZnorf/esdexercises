
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

enable_testing()

add_subdirectory(gtest)
include_directories(gtest_SOURCE_FILES/include)
include_directories(../Set)

add_executable(SetTest SetTest.cpp)
target_link_libraries(SetTest gtest gtest_main)

include_directories(../Set)
add_executable(PrintSet PrintSet.cpp)