package com.example.sungjae.mind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class OpticalActivity extends AppCompatActivity{

    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optical);

        mbutton = (Button) findViewById(R.id.button01);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(OpticalActivity.this, button01Activity.class);
                startActivity(intent1);
            }
        });
        mbutton = (Button) findViewById(R.id.button02);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(OpticalActivity.this, button02Activity.class);
                startActivity(intent2);
            }
        });

    }
}

