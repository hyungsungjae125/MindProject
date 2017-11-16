package com.example.sungjae.mind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class button03Activity extends AppCompatActivity{

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button03);
        setTitle("추천!!");
        textView = (TextView)findViewById(R.id.textView3);
    }
}
