package com.example.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.net.HttpURLConnection
import java.net.URL

class ThirdPage : AppCompatActivity()
{
    var heading:TextView?=null
    var editText:EditText?=null
    var enterbutton:Button?=null
    var paragrah:TextView?=null
    var synnonym_heading:TextView?=null
    var button:TextView?=null
    var synnonyms:Spinner?=null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)
        heading=findViewById<TextView>(R.id.Heading_P3)
        editText=findViewById<EditText>(R.id.userenter_para_p3)
        enterbutton=findViewById<Button>(R.id.Enter)
        paragrah=findViewById<TextView>(R.id.textViewpara_p3)
        synnonym_heading=findViewById<TextView>(R.id.synnonym_heading_p3)
        button=findViewById<TextView>(R.id.hardword_p3)
        synnonyms=findViewById<Spinner>(R.id.synnonyms_p3)




        enterbutton?.setOnClickListener {
           // paragrah?.text="Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph. A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and Connors 116). Length and appearance do not determine whether a section in a paper is a paragraph. For instance, in some styles of writing, particularly journalistic styles, a paragraph can be just one sentence long. Ultimately, a paragraph is a sentence or group of sentences that support one main idea. In this handout, we will refer to this as the “controlling idea,” because it controls what happens in the rest of the paragraph.Before you can begin to determine what the composition of a particular paragraph will be, you must first decide on an argument and a working thesis statement for your paper. What is the most important idea that you are trying to convey to your reader? The information in each paragraph must be related to that idea. In other words, your paragraphs should remind your reader that there is a recurrent relationship between your thesis and the information in each paragraph. A working thesis functions like a seed from which your paper, and your ideas, will grow. The whole process is an organic one—a natural progression from a seed to a full-blown paper where there are direct, familial relationships between all of the ideas in the paper."
            paragrah?.text=editText?.text
            editText?.text?.clear()

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

}
