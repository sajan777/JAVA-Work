package com.example.halfdevil.sharedprefrencedemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button login;
    EditText username,password;
    TextView t,p;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        username = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        t = (TextView)findViewById(R.id.t);
        p = (TextView)findViewById(R.id.email);

        login = (Button)findViewById(R.id.login);


        SharedPreferences sp = getSharedPreferences("pref",MODE_PRIVATE);
        final String usr = sp.getString("Username","");
        final String pas = sp.getString("Password","");
        //String em = sp.getString("Email" ,"");
        //String db = sp.getString("dob","");


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentObj = new Intent(Activity2.this,Activity3.class);

             final  String s1= username.getText().toString();
             final String s2 = password.getText().toString();

             if((usr.equals(s1)) && (pas.equals(s2))){
                 startActivity(intentObj);
             }
             else if(!usr.equals(s1)){
                 Toast.makeText(getApplicationContext(),"Wrong username",Toast.LENGTH_SHORT);
                }
                else{
                 Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_SHORT);
             }



            }
        });


    }
}
