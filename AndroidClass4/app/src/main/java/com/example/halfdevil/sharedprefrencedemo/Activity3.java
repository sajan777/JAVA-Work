package com.example.halfdevil.sharedprefrencedemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    EditText username,email,dob,password;
    TextView u,p,e,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        u = (TextView)findViewById(R.id.u);
        p = (TextView)findViewById(R.id.p);
        e = (TextView)findViewById(R.id.e);
        d = (TextView)findViewById(R.id.d);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        email = (EditText)findViewById(R.id.user);
        dob = (EditText)findViewById(R.id.dob);


        SharedPreferences sp = getSharedPreferences("pref",MODE_PRIVATE);
        final String usr = sp.getString("Username","");
        final String pas = sp.getString("Password","");
        final String em = sp.getString("Email" ,"");
        final String db = sp.getString("dob","");


        username.setText(usr);
        password.setText(pas);
        email.setText(em);
        dob.setText(db);
    }
}
