package com.example.sample_library

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.ShowTost

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         ShowTost().add(2,3,this)
    }
}