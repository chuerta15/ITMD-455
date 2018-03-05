package com.example.joanc.midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText username;
    EditText2 password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.button);
        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);

        submit.setOnClickListener(new View.onClickListener()){
            @Override
                    public void onClick(View v){
                login();
            }
            public void login() {
            if username = "iitconsuelo";


        }
        }
    }
}
