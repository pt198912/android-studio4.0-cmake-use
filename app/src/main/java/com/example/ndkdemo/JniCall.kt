package com.example.ndkdemo

import android.util.Log

object JniCall {

    private const val TAG = "JniCall"

    init{
        Log.d(TAG, "init ")
        System.loadLibrary("test-lib")
    }

    external fun ffmpegVersion():String?

}