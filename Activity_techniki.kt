package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson1.databinding.ActivityMainBinding
import com.example.lesson1.databinding.ActivityTechnikiBinding

class Activity_techniki : AppCompatActivity() {
    lateinit var bindingClass : ActivityTechnikiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTechnikiBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
}