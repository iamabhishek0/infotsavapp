package com.infotsav.test.Main_Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.infotsav.test.R;

public class RegisterActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.infotsav.in/register");
        final TextView loading=findViewById(R.id.loading);
        final ProgressBar progressBar=findViewById(R.id.progressBarRegister);
        final TextView error=findViewById(R.id.error);
        myWebView.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                // do your stuff here
                myWebView.postDelayed(new Runnable() {
                    public void run() {
                        myWebView.setVisibility(View.VISIBLE);
                    }
                }, 0);
            }
        });
        loading.postDelayed(new Runnable() {
            public void run() {
                loading.setVisibility(View.INVISIBLE);
            }
        }, 15000);
        progressBar.postDelayed(new Runnable() {
            public void run() {
                progressBar.setVisibility(View.INVISIBLE);
            }
        }, 15000);
        error.postDelayed(new Runnable() {
            public void run() {
                error.setVisibility(View.VISIBLE);
            }
        }, 15000);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (myWebView.canGoBack()) {
                        myWebView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
}
