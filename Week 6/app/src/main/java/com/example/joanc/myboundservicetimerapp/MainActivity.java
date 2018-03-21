package com.example.joanc.myboundservicetimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    Button btnStartServices;
    Button btnStopServices;
    Button btnStart;
    Button btnStop;
    Button btnReset;
    TextView counter;
    Handler customHandler = new Handler();

    //Starting the time
    long tStart = System.currentTimeMillis();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartServices = (Button) findViewById(R.id.btnStartServices);
        btnStopServices = (Button) findViewById(R.id.btnStopServices);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnReset = (Button) findViewById(R.id.btnReset);
        counter = (TextView) findViewById(R.id.counter);

        /*

        btnStartServices.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void onClick (View v);
            {
                StartTimer = SystemClock.uptimeMillis();


            }
        } ;

        btnStart.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void onClick (View v);
            {
            }
        } ;


        btnStop.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void onClick (View v){
            }
        } ;

        btnPause.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void onClick (View v){
            }
        } ;

        btnStopServices.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void onClick (View v)
            {

            }
        } ;
*/
    }
}