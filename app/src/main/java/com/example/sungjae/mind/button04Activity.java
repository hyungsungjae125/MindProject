package com.example.sungjae.mind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by sungjae on 2017-11-05.
 */

public class button04Activity extends AppCompatActivity {
    TextView mtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button04);

        mtextView = (TextView)findViewById(R.id.textView4);

    }
}
