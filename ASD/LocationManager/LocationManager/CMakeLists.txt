
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++14")

set(SOURCES Location.cpp LocationManager.cpp)

add_library(LocationManager ${SOURCES})