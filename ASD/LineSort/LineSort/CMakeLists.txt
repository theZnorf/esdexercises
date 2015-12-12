
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++14 -lpthread")

set(TBB_DIR /opt/tbb)

include_directories(${TBB_DIR}/include/)
link_directories(${TBB_DIR}/lib/intel64/gcc4.4/)

set(SOURCES main.cpp)

add_executable(LineSort ${SOURCES})
target_link_libraries(LineSort tbb)