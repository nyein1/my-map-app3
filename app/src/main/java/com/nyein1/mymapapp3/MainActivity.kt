package com.nyein1.mymapapp3

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.allowFileAccess = true
        web.settings.allowContentAccess = true
        web.settings.mixedContentMode = android.webkit.WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE
        web.webViewClient = WebViewClient()
        web.loadUrl("file:///android_asset/index.html")
        setContentView(web)
    }
}
