package com.example.odv3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Github : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)


        val detailWebView = findViewById<WebView>(R.id.githubWebView)
        detailWebView.settings.javaScriptEnabled = true

        detailWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }

        detailWebView.loadUrl("https://github.com/AhmetEmreAtan/")


    }
}