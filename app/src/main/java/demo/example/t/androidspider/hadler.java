package demo.example.t.androidspider;

import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.TextView;
import android.widget.Toast;
 import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/5.
 */

public class hadler {

        private TextView textView;
        private Document s;
        private GIAdata data;
        private ArrayList<String> string = new ArrayList<String>();

        public hadler(TextView textView) {
                this.textView = textView;
        }

        @JavascriptInterface
        public void se(String data) {

                inits(data);//先拿到数据
                getdata();//再把数据给GIAdata   -bean
        }

        private void inits(String html) {
                s = Jsoup.parse(html);
                this.data = new GIAdata();

                Elements f = s.getElementsByClass("gia-tb");
                Elements k = f.select("td.c2");

                Log.d("data", "数据：" + k.text());
                for (Element t : k
                        ) {
                        string.add(t.text());
                }
                Log.d("data", "字符串数量" + string.size());
        }

        //数据
        private void getdata() {
                getTitle();
                getnumber();
                getShape();
                getTime();
                getPa();
                getPdp();
                getSsp();
                getCrownHgtp();
                getCrownAng();
                getDdgp();
                getDg();
                getCulet();
                getPol();
                getSym();
                getFlr();
                getClearc();
                getSize();
                getWeight();
                getColor();
                getClear();
                getCut();
                getDepp();
                getWidp();
        }

        //标题
        private void getTitle() {
                Elements f = s.getElementsByClass("gia-h1");
                Elements k = f.select("h1");
                Log.d("data", k.text());
                data.setTitle(k.text());
        }

        //证书编号
        private void getnumber() {
                Elements f = s.getElementsByClass("c2");
                Elements k = f.select("p");
                Log.d("data", "证书编号" + k.text());
                data.setNumber(k.text());
        }

        //颁发时间
        private void getTime() {
                Elements f = s.getElementsByClass("c2");
                Elements k = f.select("div");
                Log.d("data", "颁发日期" + k.text());
                data.setNumber(k.text());
        }

        //形状
        private void getShape() {
                Elements f = s.select("h3.c1.f1");
                Log.d("data", "形状" + f.text());
                data.setShape(f.text());
        }


        //亭角
        private void getPa()
        {
                data.setPa(string.get(9));
                Log.d("data", string.get(9));
        }


        //亭深比
        private void getPdp()
        {
                data.setPdp(string.get(10));
                Log.d("data", string.get(10));
        }


        //星小面比
        private void getSsp()
        {
                data.setSsp(string.get(11));
                Log.d("data", string.get(11));
        }


        //冠高比
        private void getCrownHgtp()
        {
                data.setCrownHgtp(string.get(8));
                 Log.d("data", string.get(8));
        }


        //冠角
        private void getCrownAng()
        {
                data.setCrownAng(string.get(7));
                Log.d("data", string.get(7));
        }


        //下腰小面比
        private  void  getDdgp()
        {
                data.setDdgp(string.get(12));
                Log.d("data", string.get(12));

        }


        //腰棱
        private void  getDg()
        {
                data.setDg(string.get(13));
                Log.d("data", string.get(13));
        }


        //底尖
        private  void getCulet()
        {
                data.setCulet(string.get(14));
                Log.d("data", string.get(14));
        }


        //抛光
        private  void  getPol()
        {
                data.setPol(string.get(15));
                Log.d("data", string.get(15));
        }


        //对称
        private  void  getSym()
        {
                data.setSym(string.get(16));
                Log.d("data", string.get(16));
        }


        //荧光
        private  void  getFlr()
        {
                data.setFlr(string.get(17));
                Log.d("data", string.get(17));
        }


        //净度特征
        private void getClearc()
        {
                data.setClearc(string.get(18));
                Log.d("data", string.get(18));
        }


        //尺寸
        private void getSize() {
                data.setSize(string.get(0));
                Log.d("data", string.get(0));
        }

        //重量
        private void getWeight() {
                data.setWeight(string.get(1));
                Log.d("data", string.get(1));
        }

        //颜色
        private void getColor() {
                data.setColor(string.get(2));
                Log.d("data", string.get(2));
        }

        //净度
        private void getClear() {
                data.setClear(string.get(3));
                Log.d("data", string.get(3));
        }

        //切工
        private void getCut()
        {
                data.setCut(string.get(4));
                Log.d("data",string.get(4));
        }

        //全深比
        private void getDepp()
        {
                data.setDepp(string.get(5));
                Log.d("data", string.get(5));
        }


        //台宽比
        private void getWidp()
        {
                data.setWidp(string.get(6));
                Log.d("data", string.get(6));
        }
}