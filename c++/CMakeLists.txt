cmake_minimum_required(VERSION 3.0.0)
project(Algorithms VERSION 0.0.0)

include(CTest)
enable_testing()

set(BUILD_DIR ${PROJECT_SOURCE_DIR}/compiled)

set(CPACK_PROJECT_NAME ${PROJECT_NAME})
set(CPACK_PROJECT_VERSION ${PROJECT_VERSION})

set(SOURCES ${PROJECT_SOURCE_DIR}/Sort/BubbleSort.cpp)
SET(EXECUTABLE_OUTPUT_PATH ${BUILD_DIR})
add_executable(BubbleSort ${SOURCES})

add_custom_target(BubbleSort_run
  COMMAND BubbleSort
  WORKING_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}
)

include(CPack)




