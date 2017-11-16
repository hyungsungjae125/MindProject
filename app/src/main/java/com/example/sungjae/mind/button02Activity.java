package com.example.sungjae.mind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sungjae on 2017-10-05.
 */

public class button02Activity extends AppCompatActivity {

    Button mbutton;
    TextView mtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button02);

        mtextView = (TextView)findViewById(R.id.textView);
        mbutton = (Button) findViewById(R.id.button04);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(button02Activity.this, button04Activity.class);
                startActivity(intent1);
            }
        });
    }
}
