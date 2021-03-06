package com.example.lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lesson1.Fragment_IQ_Question_1.Companion.newInstance

import com.example.lesson1.databinding.ActivityMainBinding
import com.example.lesson1.databinding.ActivityTestsBinding


// https://psytests.org/iq/kot/kotA-run.html
// https://psytests.org/ta/baregoM1.html
// https://psytests.org/emotional/ohiM1.html
// https://psytests.org/ta/baregoM1.html
var COUNTER = 0;
class Activity_tests : AppCompatActivity() {
    lateinit var binding : ActivityTestsBinding

    //var COUNTER = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_tests)
        //supportFragmentManager.beginTransaction().replace(R.id.button_test_iq, Fragment_IQ_Question_1.newInstance()).commit()
        //supportFragmentManager.beginTransaction().replace(R.id.button_test_iq, IQ_Activity.getQuestions()).commit()

        binding.buttonTestIq.setOnClickListener()
        {

            var dialog = Fragment_IQ_Question_1()
            //dialog.show(supportFragmentManager, "customDialog")
            supportFragmentManager.beginTransaction().replace(R.id.button_test_iq, Fragment_IQ_Question_1.newInstance()).commit()
        }
    }

    /*fun onClickGoIQ1(view: View)
    {
        var dialog = Fragment_IQ_Question_1()

        dialog.show(supportFragmentManager, "customDialog")
    }*/

    fun onClickGoIQ1(view:View)
    {
        //val intent = Intent(this, IQ_Activity::class.java)
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