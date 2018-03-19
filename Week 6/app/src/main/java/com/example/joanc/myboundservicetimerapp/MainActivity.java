package com.example.joanc.myboundservicetimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnStartServices;
    Button btnStopServices;
    Button btnStart;
    Button btnPause;
    Button btnReset;
    TextView txtTimer;
    Handler customHandler = new Handler();
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartServices = (Button)findViewById(R.id.btnStartServices);
        btnStopServices = (Button)findViewById(R.id.btnStopServices);
        btnStart = (Button)findViewById(R.id.btnStart);
        btnPause = (Button)findViewById(R.id.btnPause);
        btnStop = (Button)findViewById(R.id.btnStop);
        txtTimer = (TextView)findViewById(R.id.timerValue);

        }


    }
}
