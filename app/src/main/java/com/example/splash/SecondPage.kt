package com.example.splash
//public class Question implements Serializable`
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class SecondPage : AppCompatActivity()
{
    //var question:TextView?=null
    var word:TextView?=null
    var buttonYes:Button?=null
    var buttonNo:Button?=null

    var Words =ArrayList<String>()
    var easywords_p2=ArrayList<String>()
    var hardwords_p2=ArrayList<String>()
    var easywords_frm_p1=ArrayList<String>()
    var word1="Pink"
    var word2="Green"
    var word3="Flower"
    var buttonnext:Button?=null

    var flagg=0

    @SuppressLint("SuspiciousIndentation")
    override fun onPostCreate(savedInstanceState: Bundle?)
    {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.second_page)
//        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


//        easywords_frm_p1=intent
        getSupportActionBar()?.hide()
        var flag=0
        word=findViewById<TextView>(R.id.page2_word_1)
        buttonYes=findViewById<Button>(R.id.page2_word1_yes)
        buttonNo=findViewById<Button>(R.id.page2_word1_no)
       // button=findViewById<Button>(R.id.button4)
        buttonnext=findViewById<Button>(R.id.page2nextbtn)


        Words.add(word1)
        Words.add(word2)
        Words.add(word3)
        Words.add("Ganges")
        Words.add("Nile")
        Words.add("Furia")
        Words.add("Lion")
        Words.add("Tiger")
        //Words.add()

        val length=Words.size

//println(length)

//create a func , int default value 0 , yes or no increment  by 1 , check with size of the arraylist,,


        var itr = Words.listIterator()    // or, use `iterator()`
        if(itr.hasNext())
        {
            word?.text=(itr.next())
//            flagg+=1
//            println(flagg)

          //  println(word?.text)
           // println("===========    =============================================================================================================")
        }
      //  println(itr.)
     //   hardwords.add("mictesting halooooooooooooooooooooooooooooooooooooooooo")
        buttonYes?.setOnClickListener {
            if (itr.hasNext()) {
               // println(word?.text.toString())
                //hardwords.add(word?.text as String)
                addhardwords(word?.text.toString(),length)
                flagg+=1
                word?.text = (itr.next())
               // hardwords.add("chiii")
//                for(s in hardwords) {
//                    println(s)
//                }
////                addhardwords(word?.text.toString())

               // println(flagg)
                if(flagg==length-1)
                {

                    addhardwords(word?.text.toString(),length

                    )
                }
            }

       // addhardwords(word?.text.toString())
        }
        buttonNo?.setOnClickListener {
            if (itr.hasNext()) {
                //println(word?.text)
               // easywords.add(word?.text.toString())
                addeasywords(word?.text.toString(),length)
                flagg+=1
                word?.text = (itr.next())
             //   println(flagg)
                if(flagg==length-1)
                {

                    addeasywords(word?.text.toString(),length)
                }


            }


        }

        buttonnext?.setOnClickListener( {
            val intent = Intent(this, ThirdPage::class.java)
            startActivity(intent)
        })

//        for(s in hardwords)
//        {
//            println(s)
//        }
////        while (itr.hasNext() && flag==1)
//        {
//            //println(itr.next())
//
//
//        }
//        for(s in Words)
//        {
//
//         //   val handler = Handler()
//            handler.postDelayed(Runnable {
//                // yourMethod();
//            }, 5000)
            //while (flag==0)
           // {
//
//
//           // }
//
//
//        }
//
//        println("============================================================================================================================================")
//        var itrr = easywords.listIterator()
//        while (itrr.hasNext())
//{
//    println(itrr.next())
//}
//        println("============================================================================================================================================")
//for(s in hardwords.toString())
//{
//    println(s)
//}
//        println("============================================================================================================================================")

//        for(s in hardwords)
//        {
//            println(s)
//        }


     //   funcc()





    }

//    private fun funcc()
//    {
//        println("easy wordssssssssssssssssssssssssss")
//        for(s in easywords)
//        {
//            println(s)
//        }
//        println("hard wordssssssssssssssssssssssssss")
//        for(s in hardwords)
//        {
//            println(s)
//        }
//    }

    private fun addeasywords(toString: String, length: Int)
    {
        easywords_p2.add(toString)
        if(flagg==length-1)
        {
            println("easy wordssssssssssssssssssssssssss")
            println(easywords_p2)
//            for(s in easywords_p2)
//            {
//                println(s)
//            }
            println("hard wordssssssssssssssssssssssssss")
            println(hardwords_p2)
//            for(s in hardwords_p2)
//            {
//                println(s)
//            }
        }

    }

    private fun addhardwords(toString: String,length: Int)
    {
        hardwords_p2.add(toString)
        if(flagg==length-1)
        {
            println("easy wordssssssssssssssssssssssssss")
            println(easywords_p2)
//            for(s in easywords_p2)
//            {
//                println(s)
//            }
            println("hard wordssssssssssssssssssssssssss")
            println(hardwords_p2)
        //            for(s in hardwords_p2)
//            {
//                println(s)
//            }
        //getStrin
        }

    }



}