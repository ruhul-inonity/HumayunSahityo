package com.example.inonity.humayunsahityo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Browser extends AppCompatActivity {
    WebView webBrowser;
    String url ;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        webBrowser = (WebView) findViewById(R.id.webBrowser);
        webBrowser.setWebViewClient(new MyBrowser());

        webBrowser.getSettings().setLoadsImagesAutomatically(true);
        webBrowser.getSettings().setJavaScriptEnabled(true);
        webBrowser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webBrowser.loadUrl(url);
       // Toast.makeText(getApplicationContext(),url,Toast.LENGTH_LONG).show();

    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
