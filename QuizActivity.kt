package com.example.lesson1

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {


    var quizs = ArrayList<Question>()
    var numberOfGoodAnswer: Int = 0
    var currentQuizIndex: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        quizs.add(Question("«За какое минимальное количество разрезов можно поделить торт на восемь одинаковых частей?", "8", "3", "4", 2))
        quizs.add(Question("5 машин текстильной фабрики производят 5 вещей за 5 минут. За сколько минут 100 машин изготовят 100 вещей?", "10", "100", "5", 3))
        quizs.add(Question("Теннисный мяч и ракетка вместе стоят 1 доллар и 10 центов. При это ракетка стоит на 1 доллар дороже мяча. Сколько стоит мяч?", "10", "5", "2", 2))
        quizs.add(Question("Без 15 пять – это 45 минут четвертого?", "Да", "Нет", "Не знаю :)", 2))
        quizs.add(Question("Сколько пар лап в сумме у трех кошек и двух уток?", "5", "8", "16", 2))
        quizs.add(Question("Сигареты подорожали на треть, а вы стали курить на треть меньше. Это значит, что вы стали тратить больше денег на сигареты или меньше?", "Меньше", "Больше", "Столько же", 1))
        quizs.add(Question("В доме 9 окон. После того, как помыли 4 окна, чистых стало в 2 раза больше, чем грязных. Сколько чистых окон было изначально?", "4", "2", "3", 2))
        showQuestion(quizs.get(currentQuizIndex))
    }

    fun showQuestion(quiz: Question)
    {
        txtQuestion.setText(quiz.Quiz)
        answer1.setText(quiz.answer1)
        answer2.setText(quiz.answer2)
        answer3.setText(quiz.answer3)
    }

    fun handleAnswer(answerID: Int)
    {
        val quiz = quizs.get(currentQuizIndex)

        if(quiz.isCorrect(answerID))
        {
            numberOfGoodAnswer++
            Toast.makeText(this, "+1", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(this, "+0", Toast.LENGTH_SHORT).show()
        }

        currentQuizIndex++

        if(currentQuizIndex >= quizs.size)
        {
            var alert = AlertDialog.Builder(this)
            alert.setTitle("Поздравляю")
            alert.setMessage("Ваш IQ " + numberOfGoodAnswer + " из " + currentQuizIndex)
            alert.setPositiveButton("К тестам"){dialogInterfase: DialogInterface?, i: Int -> finish()}
            alert.show()
        }
        else
        {
            showQuestion(quizs.get(currentQuizIndex))
        }
    }

    fun OnAnswerOne(view: View)
    {
        handleAnswer(1)
    }
    fun OnAnswerTwo(view: View)
    {
        handleAnswer(2)
    }
    fun OnAnswerThree(view: View)
    {
        handleAnswer(3)
    }

}