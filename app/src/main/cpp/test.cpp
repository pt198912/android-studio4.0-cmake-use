#include <string>
#include <jni.h>
#include <android/log.h>
using namespace std;
extern "C"{
#include <libavutil/avutil.h>
}
extern "C" JNIEXPORT jstring JNICALL
Java_com_example_ndkdemo_JniCall_ffmpegVersion(JNIEnv *env, jobject thiz) {
    string hello="hello from c++";
    unsigned int version=avutil_version();
    __android_log_print(ANDROID_LOG_INFO,"pengtao","version:%d",version);
    string v=to_string(version);
    return env->NewStringUTF(v.c_str());
}