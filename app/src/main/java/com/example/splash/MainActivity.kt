package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity()
{
    var buttoneasy:Button?=null
     var buttonhard:Button?=null
     var textView:TextView?=null
     var editText:EditText?=null
     var textView2:TextView?=null
     var buttonNext:Button?=null
    var buttonFinish:Button?=null
    lateinit var easyWord:String
    lateinit var diffWord:String

    var easywords_p1=ArrayList<String>()
    var hardwords_p1=ArrayList<String>()

    var no_of_easy_words=0
    var no_of_hard_words=0
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoneasy=findViewById<Button>(R.id.button3)
        buttonhard=findViewById<Button>(R.id.button)
        textView=findViewById<TextView>(R.id.textView7)
        editText=findViewById<EditText>(R.id.readWord)
        textView2=findViewById<EditText>(R.id.textView6)
        buttonNext=findViewById<Button>(R.id.button2)
        buttonFinish=findViewById<Button>(R.id.buttonFinish)
//        editText.isActivated()
//        editText.addTextChangedListener(onTextChanged={easyWord=editText.text})
    buttoneasy?.setOnClickListener(View.OnClickListener {
        easyWord= editText?.text.toString()
        textView?.append("\n $easyWord")
        addeasywords(easyWord,no_of_easy_words)
        editText?.text=null
    })

       buttonhard?.setOnClickListener(View.OnClickListener {
           diffWord=editText?.text.toString()
           textView2?.append("\n $diffWord")
           addhardwords(diffWord,no_of_hard_words)
           editText?.text=null
       })


        buttonFinish?.setOnClickListener({
            print_easy_diff()
        })


        buttonNext?.setOnClickListener({
            val intent = Intent(this, SecondPage::class.java)
            intent.putExtra("EasyWords", easywords_p1);
            startActivity(intent)
        })



    }

    private fun print_easy_diff()
    {

        println("Easyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy")
        println(easywords_p1)
//        for (s in easywords_p1)
//        {
//            println(s)
//        }
        println("Hardddddddddddddddddddddddddddddddddddddddddddddddddddddd")
        println(hardwords_p1)
//        for(s in hardwords_p1)
//        {
//            println(s)
//        }

    }

    private fun addhardwords(diffWord: String, noOfHardWords: Int)
    {
        hardwords_p1.add(diffWord)
    }

    private fun addeasywords(easyWord: String, noOfEasyWords: Int)
    {
        easywords_p1.add(easyWord)
    }
}