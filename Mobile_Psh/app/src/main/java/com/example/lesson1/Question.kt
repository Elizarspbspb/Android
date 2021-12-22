package com.example.lesson1

class Question(var Quiz: String, var answer1: String, var answer2: String, var answer3: String, var correctAnswerNumber: Int) {
    fun isCorrect(answerNumber: Int) : Boolean {
        if(answerNumber == correctAnswerNumber)
            return true
        else
            return false
    }
}