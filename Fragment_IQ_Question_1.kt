package com.example.lesson1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.lesson1.databinding.FragmentIqQuestion1Binding


class Fragment_IQ_Question_1:DialogFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        /*var rootView: View = inflater.inflate(R.layout.fragment_iq_question_1, container, false)

        rootView.exitButton.setOnClickListener
        {
            dismiss()
        }


        return rootView*/

        val binding = FragmentIqQuestion1Binding.inflate(inflater)

        binding.exitButton.setOnClickListener()
        {
            dismiss()
        }

        binding.nextButton.setOnClickListener()
        {
            COUNTER = COUNTER + 1

            val selectedID = binding.ratingRadioGroup.checkedRadioButtonId
            val radio = binding.root.findViewById<RadioButton>(selectedID)
            var ratingResult = radio.text.toString()
            Toast.makeText(context, "You rated: $ratingResult", Toast.LENGTH_LONG).show()



            //var dialog = FragmentIqFinal()
            //dialog.

            dismiss()

        }

        return binding.root
        //return inflater.inflate(R.layout.fragment_iq_question_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object{
        @JvmStatic
        fun newInstance() = Fragment_IQ_Question_1()
    }
}