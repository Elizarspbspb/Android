package com.example.lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lesson1.databinding.ActivityMainBinding
import com.example.lesson1.databinding.ActivityHelpBinding

class ActivityHelp : AppCompatActivity() {
    lateinit var bindingClass : ActivityHelpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityHelpBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }


    fun onClickGoExit(view: View)
    {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}