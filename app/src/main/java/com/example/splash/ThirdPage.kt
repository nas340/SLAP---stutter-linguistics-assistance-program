package com.example.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ThirdPage : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    var heading:TextView?=null
    var editText:EditText?=null
    var enterbutton:Button?=null
    var paragrah:TextView?=null
    var synnonym_heading:TextView?=null
    var buttonHardwords:TextView?=null
    var synnonyms:Spinner?=null
    var hardwords_p3= ArrayList<String>()
    var options= ArrayList<String>()
    var options2=ArrayList<String>()
    var options3=ArrayList<String>()
    var options4=ArrayList<String>()

    var buttonNextPage3:Button?=null
//    var op=ArrayList<String>()
    var Adapter: ArrayAdapter<CharSequence>?=null
    var hashMap : HashMap<String, ArrayList<String>> = HashMap<String, ArrayList<String>>()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)
        heading=findViewById<TextView>(R.id.Heading_P3)
        editText=findViewById<EditText>(R.id.userenter_para_p3)
        enterbutton=findViewById<Button>(R.id.Enter)
        paragrah=findViewById<TextView>(R.id.textViewpara_p3)
        synnonym_heading=findViewById<TextView>(R.id.synnonym_heading_p3)
        buttonHardwords=findViewById<TextView>(R.id.hardword_p3)
        synnonyms=findViewById<Spinner>(R.id.synnonyms_p3)
        buttonNextPage3=findViewById<Button>(R.id.buttonnxt_p3)





        options.add("section")
        options.add("subdivision")
        options.add("subsection")
        options.add("division")
        hashMap.put("PARAGRAPHS",options)



        options2.add("structure")
        options2.add("construction")
        options2.add("establishment")
        options2.add("pile")
        hashMap.put("BUILDING",options2)





        options3.add("phrase")
        options3.add("expression")
        options3.add("denomination")
        options3.add("label")
        hashMap.put("TERMS",options3)


        options4.add("category")
        options4.add("classification")
        options4.add("set")
        options4.add("type")
        hashMap.put("GROUP",options4)
4

//        enterbutton?.setOnClickListener {
////            for ((k, v) in hashMap)
////            {
////
////                buttonHardwords?.text=k
////                buttonHardwords?.setOnClickListener{
////                    Adapter=ArrayAdapter(this, android.R.layout.simple_spinner_item,v as List<CharSequence>)
////                    Adapter?.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
////                    synnonyms?.adapter=Adapter
////                    synnonyms?.onItemSelectedListener=this
////                    synnonyms?.setVisibility(View.VISIBLE);
////
////
////                }
////
////            }
//
//
//        }
        val len=hashMap.size
        var flag=0
        println("=======================================================")
        println("len:$len")
        println("fla:$flag")
        println("=======================================================")
        val i=hashMap.keys.iterator()
        enterbutton?.setOnClickListener {
            paragrah?.text="Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph. A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and Connors 116). Length and appearance do not determine whether a section in a paper is a paragraph. For instance, in some styles of writing, particularly journalistic styles, a paragraph can be just one sentence long. Ultimately, a paragraph is a sentence or group of sentences that support one main idea. In this handout, we will refer to this as the “controlling idea,” because it controls what happens in the rest of the paragraph.Before you can begin to determine what the composition of a particular paragraph will be, you must first decide on an argument and a working thesis statement for your paper. What is the most important idea that you are trying to convey to your reader? The information in each paragraph must be related to that idea. In other words, your paragraphs should remind your reader that there is a recurrent relationship between your thesis and the information in each paragraph. A working thesis functions like a seed from which your paper, and your ideas, will grow. The whole process is an organic one—a natural progression from a seed to a full-blown paper where there are direct, familial relationships between all of the ideas in the paper."
            //paragrah?.text=editText?.text
            editText?.text?.clear()

            if(i.hasNext())
            {
                val key=i.next()
                val value=hashMap[key]
                buttonHardwords?.text=key
                Adapter=ArrayAdapter(this@ThirdPage, android.R.layout.simple_spinner_item,value as List<CharSequence>)
                Adapter?.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                synnonyms?.adapter=Adapter
                synnonyms?.onItemSelectedListener=this
                synnonyms?.setVisibility(View.VISIBLE);
                flag=flag+1

                println("=======================================================")
                println("len:$len")
                println("fla:$flag")
                println("=======================================================")

            }


        }
        buttonNextPage3?.setOnClickListener {

            if (i.hasNext())
            {
                val key=i.next()
                val value=hashMap[key]

                buttonHardwords?.text=key
                Adapter=ArrayAdapter(this@ThirdPage, android.R.layout.simple_spinner_item,value as List<CharSequence>)
                Adapter?.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                synnonyms?.adapter=Adapter
                synnonyms?.onItemSelectedListener=this
                synnonyms?.setVisibility(View.VISIBLE);
                flag=flag+1
                println("=======================================================")
                println("len:$len")
                println("fla:$flag")
                println("=======================================================")

            }
//            println("=======================================================")
//            println("len:$len")
//            println("fla:$flag")
//            println("=======================================================")

//            if (flag==len)
//            {
//
//                val key=i.next()
//                val value=hashMap[key]
//
//                buttonHardwords?.text=key
//                Adapter=ArrayAdapter(this@ThirdPage, android.R.layout.simple_spinner_item,value as List<CharSequence>)
//                Adapter?.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//                synnonyms?.adapter=Adapter
//                synnonyms?.onItemSelectedListener=this
//                synnonyms?.setVisibility(View.VISIBLE);
//                flag=flag+1
//            }

        }





























//        val myWebView: WebView = findViewById(R.id.webview)
//        myWebView.loadUrl("file:///android_asset/index.html")
//        myWebView.settings.javaScriptEnabled = true
//        myWebView.webViewClient = WebViewClient()

//        val url = URL("http://www.android.com/")
//
//        val urlConnection = url.openConnection() as HttpURLConnection
//
//        try {
//            val text = urlConnection.inputStream.bufferedReader().readText()
//            Log.d("UrlTest", text)
//        } finally {
//            urlConnection.disconnect()
//        }
//    private fun webViewSetup()
//    {
//
//    }

    }

    private fun showsynnonyms()
    {

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        var text:String
        text= p0?.getItemAtPosition(p2) as String
        Toast.makeText(p0.context,text,Toast.LENGTH_SHORT).show();
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }

}
