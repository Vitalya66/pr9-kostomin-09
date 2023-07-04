package com.example.vitalya_pr_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;


public class map extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        web = findViewById(R.id.webView);
        // включаем поддержку JavaScript
        web.getSettings().setJavaScriptEnabled(true);
        // указываем страницу загрузки
        web.loadUrl("https://google.com/");
    }
}