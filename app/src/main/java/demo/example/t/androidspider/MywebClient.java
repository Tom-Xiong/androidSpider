package demo.example.t.androidspider;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Administrator on 2016/12/5.
 */

public class MywebClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        Log.d("WebView","onPageStarted");
        super.onPageStarted(view, url, favicon);
}

    @Override
    public void onPageFinished(WebView view, String url) {
        Log.d("WebView","onPageFinished ");
        view.loadUrl("javascript:window.ss.se('<head>'+" +
                "document.getElementsByTagName('body')[0].innerHTML+'</head>');");
        super.onPageFinished(view, url);
    }
}
