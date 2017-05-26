package com.example.sunpeng.certaintextbolddemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mText;
    private String content = "赵老师评语：看看就开始的开放式的法律框架理论就离开看了看我i我i分级基金";
    private String content1 = "<b>赵老师评语：</b>看看就开始的开放式的法律框架理论就离开看了看我i我i分级基金";
    private String content3 = "看看就开始的开放式的法律框架理论就离开看了看我i我i分级基金";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = (TextView) findViewById(R.id.tv_text);
        SpannableStringBuilder ssb = new SpannableStringBuilder(content);
        ssb.setSpan(new StyleSpan(Typeface.BOLD), 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mText.setText(ssb);
//        mText.setText(Html.fromHtml(content1));
        String str = String.format(getResources().getString(R.string.comment),"赵老师",content3);
//        mText.setText(Html.fromHtml(str));
    }
}
