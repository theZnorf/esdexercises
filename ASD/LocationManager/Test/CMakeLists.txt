set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++14")

include_directories(../LocationManager)

set(SOURCES LocationManagerTest.cpp)

add_executable(Tests ${SOURCES})

target_link_libraries(Tests LocationManager)