package com.example.ndkdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object{
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test=findViewById<TextView>(R.id.tv_test)
        test.text=JniCall.ffmpegVersion()
        Log.d(TAG, "onCreate: "+JniCall.ffmpegVersion())
    }

}