package com.example.lesson1

class Question2(var Quiz: String, var answer1: String, var answer2: String, var answer3: String, var correct1: Int, var correct2: Int, var correct3: Int) {
    fun countResult(answerNumber: Int) : Int
    {
        var correct = 0
        if(answerNumber == 1) {
            correct = correct1;
            return correct
        }
        if(answerNumber == 2) {
            correct = correct2;
            return correct
        }
        if(answerNumber == 3) {
            correct = correct3;
            return correct
        }
        return correct;
    }
}