cmake_minimum_required(VERSION 3.3)
project(AVS_View)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES src/simpleppm.c src/AVS.cpp src/sdlppmview.cpp)

add_executable(AVS_View ${SOURCE_FILES})

INCLUDE(FindPkgConfig)

PKG_SEARCH_MODULE(SDL REQUIRED sdl)

INCLUDE_DIRECTORIES(${SDL_INCLUDE_DIRS})
TARGET_LINK_LIBRARIES(${PROJECT_NAME} ${SDL2_LIBRARIES})
