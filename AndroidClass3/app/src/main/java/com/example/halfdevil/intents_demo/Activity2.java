package com.example.halfdevil.intents_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        u = (TextView) findViewById(R.id.u);

        String usr = "";
        String pass = "";

        Bundle b = getIntent().getExtras();
        if (b == null) {
            finish();
        }
        else {

            usr = b.getString("Username");
            pass = b.getString("Passcode");
        }

           if(usr.equals("ADMIN")&& pass.equals("Pass")){
               u.setText("Welcome :"+usr+"\t"+" you are logged in");
           }
           else{
               u.setText("Wrong Username or pass");
           }
        }
        }




