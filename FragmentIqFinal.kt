package com.example.lesson1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.lesson1.databinding.FragmentIqFinalBinding

class FragmentIqFinal: DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding = FragmentIqFinalBinding.inflate(inflater)

        binding.FinalTextView.text = "Ваш результат: &COUNTER" + COUNTER

        binding.exitButton.setOnClickListener()
        {
            dismiss()
        }

        return binding.root
        //return inflater.inflate(R.layout.fragment_iq_question_1, container, false)
    }

    companion object{
        @JvmStatic
        fun newInstance() = FragmentIqFinal()
    }

}