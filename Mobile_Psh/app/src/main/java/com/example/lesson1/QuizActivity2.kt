package com.example.lesson1

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity2 : AppCompatActivity() {


    var quizs = ArrayList<Question2>()
    var numberOfGoodAnswer: Int = 0
    var currentQuizIndex2: Int = 0
    var count = 0;
    var count2 = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)

        quizs.add(Question2("Если тебя неожиданно уволили с работы, твои действия?", "Приму, как должное", "Будет обидно, но уйду достойно", "Напишу жалобу в инспекцию труда", 1, 2, 3))
        quizs.add(Question2("Машина проехала по луже и окатила тебя водой, твоя реакция?", "Расстроюсь и пойду переодеваться", "Запомню номер машины, чтоб в следующий раз предъявить водителю претензии", "Буду кричать и махать руками", 1, 2, 3))
        quizs.add(Question2("Как ты реагируешь на соседей, которые шумят?", "Стучу по батареям", "Затыкаю ушы, не обращаю внимания", "Вызываю полицию", 3, 1, 2))
        quizs.add(Question2("Как ты реагируешь на людей, которые проходят вперед вне очереди?", "Сделаю замечание", "Никак", "Закачу скандал", 2, 1, 3))
        quizs.add(Question2("Часто ли ты говоришь неприятные слова сгоряча?", "Нет, держу в себе", "Да, часто", "Бывает", 1, 3, 2))

        showQuestion(quizs.get(currentQuizIndex2))
    }

    fun showQuestion(quiz: Question2)
    {
        txtQuestion.setText(quiz.Quiz)
        answer1.setText(quiz.answer1)
        answer2.setText(quiz.answer2)
        answer3.setText(quiz.answer3)
    }

    fun handleAnswer(answerID: Int)
    {
        val quiz = quizs.get(currentQuizIndex2)
        count2 = quiz.countResult(answerID)
        count = count + count2;
        /*if(quiz.isCorrect(answerID))
        {
            numberOfGoodAnswer++
            Toast.makeText(this, "^", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(this, "^", Toast.LENGTH_SHORT).show()
        }*/

        currentQuizIndex2++

        if(currentQuizIndex2 >= quizs.size)
        {
            var alert = AlertDialog.Builder(this)
            alert.setTitle("Поздравляю")
            if(count>10)
                alert.setMessage("Ваш результат " + count + ". Вы просто псих!")
            else if(count>5 && count < 11)
                alert.setMessage("Ваш результат " + count + ". Вы уравновешенный человек!")
            else if(count>0 && count < 6)
                alert.setMessage("Ваш результат " + count + ". Вы само спокойствие!")

            alert.setPositiveButton("К тестам"){dialogInterfase: DialogInterface?, i: Int -> finish()}
            alert.show()
        }
        else
        {
            showQuestion(quizs.get(currentQuizIndex2))
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