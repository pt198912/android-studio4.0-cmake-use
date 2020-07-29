cmake_minimum_required(VERSION 3.10.2)
project(cdemo)
add_library(test-lib
        SHARED
        test.cpp)
add_library(AVUTILS
        SHARED
        IMPORTED)
set_target_properties(AVUTILS
        PROPERTIES IMPORTED_LOCATION
        /Users/apple/AndroidStudioProjects/NdkDemo/app/src/main/jniLib/${ANDROID_ABI}/libavutil.so)


find_library(log-lib
        log)
include_directories(include)
target_link_libraries(test-lib
        AVUTILS
        ${log-lib})
