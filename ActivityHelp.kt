package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson1.databinding.ActivityMainBinding

class ActivityHelp : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
}