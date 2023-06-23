package com.example.odv3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Blog : AppCompatActivity() {


    lateinit var detailWebView: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)


        val detailWebView = findViewById<WebView>(R.id.detailWebView)
        detailWebView.settings.javaScriptEnabled = true

        detailWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }

        detailWebView.loadUrl("https://www.linkedin.com/in/ahmet-emre-atan-4538ab1a9/")


    }
}