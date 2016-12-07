package demo.example.t.androidspider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int i =0;
    private static Thread s;
    private static getGia net;
    private TextView textView;
    private WebView webView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initwebView();
        net = new getGia(webView,textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                net.loadrl("http://www.eegem.com/gia/?no=1172924404");
            }
        });

    }
    private void initwebView()
    {
        webView = (WebView) findViewById(R.id.webView);
        button = (Button) findViewById(R.id.button);
        textView= (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

}
