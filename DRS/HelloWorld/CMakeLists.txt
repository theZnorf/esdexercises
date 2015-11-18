cmake_minimum_required(VERSION 3.3)
project(HelloWorld)
SET(CMAKE_SYSTEM_NAME Linux)
SET(CMAKE_SYSTEM_VERSION 1)
SET(CMAKE_C_COMPILER /usr/bin/arm-linux-gnueabi-gcc-5)
SET(CMAKE_CXX_COMPILER /usr/bin/arm-linux-gnueabi-g++-5)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp)
SET(CMAKE_FIND_ROOT_PATH /home/franz/raspberry/rootfs)
add_executable(HelloWorld ${SOURCE_FILES})


SET(CMAKE_FIND_ROOT_PATH_MODE_PROGRAM NEVER)
SET(CMAKE_FIND_ROOT_PATH_MODE_LIBRARY ONLY)
SET(CMAKE_FIND_ROOT_PATH_MODE_INCLUDE ONLY)

add_custom_command(TARGET
        ${CMAKE_PROJECT_NAME}
        POST_BUILD
        COMMAND scp ${CMAKE_PROJECT_NAME} pi@192.168.0.5:/home/pi/dev/)