package com.task.blog.sample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebViewClient;

import com.task.blog.sample.R;

public class WebView extends AppCompatActivity {
        android.webkit.WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        String url = getIntent().getStringExtra("url");
         webView = (android.webkit.WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}
