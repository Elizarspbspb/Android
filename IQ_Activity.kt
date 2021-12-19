package com.example.lesson1



import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_iq.*
import org.json.JSONArray
import org.json.JSONException
import android.os.AsyncTask
import android.net.ConnectivityManager
import android.widget.Toast

//import okhttp3.OkHttpClient
//import okhttp3.Request
//import okhttp3.*


//@Suppress("DEPRECCATION")
class IQ_Activity : AppCompatActivity() {

    lateinit var context : Context
    var QuestionList : MutableList<Question> = ArrayList()
    var index=-1
    var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iq)
        context = this
        btn_next.isEnabled = false
        btn_next.alpha - 0.5.toFloat()
        //getQuestions().execute()
    }

    fun UpdateQuestion()
    {
        /*val selected = rg_choice.checkedRadioButtonId
        if(selected == -1)
        {
            Toast.makeText(this, "Please select answer", Toast.LENGTH_SHORT).show()
            return
        }
        if(index<QuestionList.size)
        {
            when(selected)
            {
                rb_choice1.id->{
                    if(QuestionList[index].Answer == 1)
                        score++
                }
                rb_choice2.id->{
                    if(QuestionList[index].Answer == 2)
                        score++
                }
                rb_choice3.id->{
                    if(QuestionList[index].Answer == 3)
                        score++
                }
                rb_choice4.id->{
                    if(QuestionList[index].Answer == 4)
                        score++
                }
            }
            index++
            if(index<QuestionList.size)
            {
                tv_question.text=QuestionList[index].Question
                rb_choice1.text = QuestionList[index].Option1
                rb_choice2.text = QuestionList[index].Option2
                rb_choice3.text = QuestionList[index].Option3
                rb_choice4.text = QuestionList[index].Option4
                rg_choice.clearCheck()
                if((index+1)==QuestionList.size)
                    btn_next.text = "Finish"
            }
            else
            {
                val dialog = AlertDialog.Builder(context)
                dialog.setTitle("Result")
                dialog.setMessage("Your answered correctly" + score + "out of" + QuestionList.size + "Questions.")
                dialog.setPositiveButton("Close", DialogInterface.OnClickListener(){dialogInterface: DialogInterface, i: Int ->
                    dialogInterface.dismiss()
                    finish()
                })
                dialog.show()
            }
        }*/
    }

    internal inner class getQuestions : AsyncTask<Void, Void, String>()
    {

        lateinit var progressDialog : ProgressDialog
        var hasInternet = false

        override fun onPreExecute(){
            super.onPreExecute()
            progressDialog = ProgressDialog(context)
            progressDialog.setMessage("Downloading Quastions...")
            progressDialog.setCancelable(false)
            progressDialog.show()
        }

        /*override fun doInBackground(vararg p0: Void?): String{
            if(isNetworkAvailable())
            {
                hasInternet = true
                val client = OkHttpClient()
                val url = ""
                val request = Request.Builder().url(url).build()
                val response = client.newCall(request).execute()
                return response.body()?.string().toString()
            }
            else
            {
                return ""
            }
        }*/

        override fun onPostExecute(result: String?)
        {
            super.onPostExecute(result)
            progressDialog.dismiss()

            /*if(hasInternet)
            {
                try{
                    val resultArray = JSONArray(result)

                    for(i in 0..(resultArray.length()-1))
                    {
                        val currentObject = resultArray.getJSONObject(i)
                        val obj = Question()
                        obj.Question = currentObject.getString("Question")
                        obj.Option1 = currentObject.getString("Option1")
                        obj.Option2 = currentObject.getString("Option2")
                        obj.Option3 = currentObject.getString("Option3")
                        obj.Option4 = currentObject.getString("Option4")
                        obj.Answer = currentObject.getInt("Answer")
                        QuestionList.add(obj)
                    }

                    if(index == -1)
                    {
                        index++
                        tv_question.text=QuestionList[index].Question
                        rb_choice1.text = QuestionList[index].Option1
                        rb_choice2.text = QuestionList[index].Option2
                        rb_choice3.text = QuestionList[index].Option3
                        rb_choice4.text = QuestionList[index].Option4
                    }

                    btn_next.isEnabled = true
                    btn_next.alpha = 1.toFloat()
                    btn_next.setOnClickListener({UpdateQuestion()})
                }
                catch(e: JSONException)
                {

                }
            }*/
        }

        override fun doInBackground(vararg p0: Void?): String {
            TODO("Not yet implemented")
        }
    }
}