package com.example.dubo.countdownbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import views.CountdownButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CountdownButton tv = (CountdownButton) findViewById(R.id.test);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.start();
            }
        });
    }
}
