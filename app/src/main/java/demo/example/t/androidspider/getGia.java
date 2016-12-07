package demo.example.t.androidspider;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/12/5.
 */

public class getGia {
    private WebView webView;
    private TextView textView;
   public getGia(WebView webView, TextView textView)
    {
        this.webView = webView;
        this.textView = textView;
    }

    public void loadrl(String url)
    {
        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new hadler(textView),"ss");
        webView.setWebViewClient(new MywebClient());

    }
}
