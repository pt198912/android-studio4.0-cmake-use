# android-studio4.0-cmake-use

这是一个简单使用ffmpeg的例子，对其中遇到的问题简单记录下：

1、More than one file was found with OS independent path 'lib/armeabi-v7a/libavutil.so'. If you are using jniLibs and CMake IMPORTED targets, see https://developer.android.com/studio/preview/features#automatic_packaging_of_prebuilt_dependencies_used_by_cmake

还记得之前说的有坑的地方吧，创建的目录为jniLibs，找的很多方案，也不知道具体的原因，AS版本为4.0，然后尝试将jniLibs这个文件夹的名字修改，我将s去掉，然后修改CMakeLists.txt文件中的第一步 set(ffmpeg_lib_dir ${CMAKE_SOURCE_DIR}/../jniLib/${ANDROID_ABI}) 就可以打包成功了

2、CMakeLists.txt添加头文件目录

include_directories(include)其中include为头文件目录的相对路劲

3、如何在自己的项目使用第三方so

add_library(AVUTILS SHARED IMPORTED) set_target_properties(AVUTILS PROPERTIES IMPORTED_LOCATION /Users/apple/AndroidStudioProjects/NdkDemo/app/src/main/jniLib/${ANDROID_ABI}/libavutil.so) target_link_libraries(test-lib AVUTILS ${log-lib})
