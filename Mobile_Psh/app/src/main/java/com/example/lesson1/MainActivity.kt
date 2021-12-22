package com.example.lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.lesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{

    lateinit var bindingClass:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    fun onClickGoTechniki(view:View)
    {
        val intent = Intent(this, StressActivity::class.java)
        startActivity(intent)
    }

    fun onClickGoTests(view:View)
    {
        val intent = Intent(this, Activity_tests::class.java)
        startActivity(intent)
    }

    fun onClickGoHelp(view:View)
    {
        val intent = Intent(this, ActivityHelp::class.java)
        startActivity(intent)
    }

    fun onClickGoExit(view:View)
    {
        System.exit(-1)
    }

    override fun onStart() {
        super.onStart()
        Log.d("AppSt", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("AppSt", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("AppSt", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("AppSt", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("AppSt", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("AppSt", "onDestroy")
    }
}