package com.zillionstar.pictologm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWeb = (WebView) findViewById(R.id.web);
        mWeb.setWebViewClient(new MyWebClient());
        WebSettings set = mWeb.getSettings();

        set.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);

        set.setJavaScriptEnabled(true);
        //set.setBuiltInZoomControls(true);
        mWeb.loadUrl("http://10.0.2.2:8888/Pictolog/pictolog");
    }

    public void mOnClick(View v) {
        switch(v.getId()) {
            case R.id.btn_home :
                mWeb.loadUrl("http://10.0.2.2:8888/Pictolog/pictolog");
                break;
            case R.id.btn_search :

                break;
            case R.id.btn_add :

                break;
            case R.id.btn_private :

                break;
            case R.id.btn_setting :
                mWeb.loadUrl("http://10.0.2.2:8888/Pictolog/memberSetting");
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
