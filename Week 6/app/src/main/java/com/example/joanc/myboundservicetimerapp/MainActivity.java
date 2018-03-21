package com.example.joanc.myboundservicetimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btnStartServices;
    Button btnStopServices;
    Button btnStart;
    Button btnPause;
    Button btnReset;
    TextView counter;
    Handler customHandler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartServices = (Button) findViewById(R.id.btnStartServices);
        btnStopServices = (Button) findViewById(R.id.btnStopServices);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnPause = (Button) findViewById(R.id.btnPause);
        TextView = (TextView) findViewById(R.id.counter);

        btnStartServices.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void onClick (View view);
            {
                StartTimer = SystemClock.uptimeMillis();


            }
        } ;

        btnStart.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void onClick (View view);
            {
            }
        } ;


        btnStop.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void onClick (View view){
            }
        } ;

        btnPause.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void onClick (View view){
            }
        } ;

        btnStopServices.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void onClick (View view)
            {

            }
        } ;

    }
