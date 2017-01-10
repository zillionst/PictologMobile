package com.zillionstar.pictologm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mWeb;
    private String name = "Hello Ji sung Kwon!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWeb = (WebView) findViewById(R.id.web);
        mWeb.setWebViewClient(new MyWebClient());
        WebSettings set = mWeb.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        mWeb.loadUrl("http://203.233.199.165:8888/Pictolog/");
    }

    public void mOnClick(View v) {
        switch(v.getId()) {
            case R.id.btn_home :
                break;

            case R.id.btn_search :
                break;

            case R.id.btn_add :
                break;

            case R.id.btn_private :
                break;

            case R.id.btn_setting :
                break;

            default :
                break;
        }
    }

    class MyWebClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());

            return true;
        }
    }

}
