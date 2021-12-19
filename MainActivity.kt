package com.example.lesson1

import android.app.Application
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.lesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{

    lateinit var bindingClass:ActivityMainBinding

    val a = 0
    val MaxPerson = 90
    val currentPerson = 35

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
       /* bindingClass.buttonTechniki.text = "Техники"

        bindingClass.buttonTechniki.setOnClickListener{    // Обработка нажатия кнопки
            //bindingClass.textViewMPS.visibility = View.GONE // Текст исчезнет
            if(MaxPerson > currentPerson) {
                bindingClass.textViewMPS.text = ">>>"
                bindingClass.textViewMPS.setBackgroundColor(Color.GREEN)
            }
            else
                bindingClass.textViewMPS.text = "<<<"

            //when(currentPerson > MaxPerson)
            when(currentPerson)
            {
                //true -> bindingClass.textViewMPS.text = "Норм предел"
                in 0..MaxPerson -> bindingClass.textViewMPS.text = "Норм предел"

                91 -> bindingClass.textViewMPS.setBackgroundColor(Color.GREEN)

                92 -> bindingClass.textViewMPS.setBackgroundColor(Color.GREEN)

                else -> bindingClass.textViewMPS.text = "Превышен"
            }

            //val intent = Intent(this, Activity_techniki::class.java)
            //startActivity(intent)
        }

        bindingClass.buttonHelp.setOnClickListener{    // Обработка нажатия кнопки
            val result = a + 100
            bindingClass.textViewMPS.text = "Res =  : $result"

            bindingClass.textViewMPS.text = if(MaxPerson > currentPerson)
                ">>>"
            else
                "<<<"
            //val intent = Intent(this, ActivityHelp::class.java)
            //startActivity(intent)
        }

        bindingClass.buttonTests.setOnClickListener{    // Обработка нажатия кнопки
            val result = a - 100
            bindingClass.textViewMPS.text = "Res =  : " + result
            bindingClass.textViewMPS.setBackgroundColor(Color.YELLOW)

            //val intent = Intent(this, Activity_tests::class.java)
            //startActivity(intent)
        }*/
    }

    fun onClickGoTechniki(view:View)
    {
        //val intent = Intent(this, Activity_techniki::class.java)
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



//var tv : TextView? = null
    // Or
    //lateinit var tv1 : TextView
    // TextView появится только после функции setContentView из onCreate.

   /* lateinit var button_techniki1 : Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Запуск активити или экрана. Зпустить разметку, взять ресурс
        val tv0 = findViewById<TextView>(R.id.textView_MPS) // Локальная переменная, существует пока активна эта функция.
        tv0.text = "Старт"
        Log.d("AppSt", "onCreate1")
        Log.d("AppSt", "onCreate2")
        //tv?.text = "Hi"
        //tv1.text = "Hi"
        button_techniki1 = findViewById(R.id.button_techniki)
        button_techniki1.setOnClickListener()
        {
            tv0.text = "Техники"
        }
    }
    // Глобальные переменные
    // сразу приравнять переменную к типу данных.
    val counter_val = 0 // val - запись только 1 раз навсегда.

    //////////////////////////////////////////////////////////////////////

    var counter0:Boolean = true
    var counter = 0   // многократная перезапись/ 0 - Литерал. Литерал - это конкретное значение.
    var counter2:Byte = 0  // 1 байт от -128 до 127
    var counter3:Short = 0 // 2 байта памяти
    // Int  4 байта
    var counter4:Long = 0 // 8 байт

    var counter5:Float = 120.0f // 4 байта
    var counter6:Double = 120.0 // 8 байт

    ////////////////////////////////////////////////////////////////////

    var text1:String = "Hello" // указание типа данных переменной.
    var testChaer:Char = 'a'

    // Глобальные переменные существуют пока не закончит работу приложение
    fun onClickTest(view:View)
    {
        val MPS1 = findViewById<TextView>(R.id.textView_MPS) // Локальная переменная, существует пока активна эта функция.
        //val MPS2 : TextView = findViewById(R.id.textView_MPS) // Или так
        //counter_val = 1 // ERROR
        counter = 1 + 6
        MPS1.text = counter.toString() // преобразование из int в string
        MPS1.text = "Помощь"
    }*/

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