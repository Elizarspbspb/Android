package com.example.lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lesson1.databinding.ActivityTestsBinding

var COUNTER = 0;
class Activity_tests : AppCompatActivity() {
    lateinit var binding : ActivityTestsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_tests)

        binding.buttonTestIq.setOnClickListener()
        {
        }
    }

    fun onClickGoIQ1(view:View)
    {
        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoQuise2(view:View)
    {
        val intent = Intent(this, QuizActivity2::class.java)
        startActivity(intent)
    }

    fun onClickGoExit(view: View)
    {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}