package com.putrasamawastduio.ntbzulrohmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class instagram_web extends AppCompatActivity {

    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram_web);
        getSupportActionBar().setTitle("Instagram");


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);


        }

//        String url = "http://www.google.com";
//        WebView web = (WebView) findViewById(R.id.webView);
//        web.loadUrl(url);

        webView1 = (WebView) findViewById(R.id.instagram);

        webView1.setWebViewClient(new instagram_web.MyBrowser());
        String url = "https://www.instagram.com/doktorzulntb1/";
        webView1.getSettings().setLoadsImagesAutomatically(true);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
        webView1.loadUrl(url);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) ;
        finish();
        return super.onOptionsItemSelected(item);

    }

    private class MyBrowser extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
