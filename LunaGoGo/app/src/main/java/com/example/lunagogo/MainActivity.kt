package com.example.lunagogo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn1: Button?=null
        btn1= findViewById(R.id.kotak_dont_have_1)
        kotak_dont_have_1?.setOnClickListener(this)
    }
}