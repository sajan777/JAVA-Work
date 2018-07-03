package com.example.halfdevil.sharedprefrencedemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Login,signup;
    EditText UserId,Pass,Email,dob;
    TextView u,p,e,d;


    //SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        UserId = (EditText)findViewById(R.id.UserId);
        Email = (EditText)findViewById(R.id.Email);
        Pass = (EditText)findViewById(R.id.Pass);
        dob = (EditText)findViewById(R.id.dob);


        u = (TextView)findViewById(R.id.email);
        p = (TextView)findViewById(R.id.email);
        e = (TextView)findViewById(R.id.e);
        d = (TextView)findViewById(R.id.dob);


        Login = (Button)findViewById(R.id.login);
        signup = (Button)findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentObj = new Intent(MainActivity.this,Activity2.class);
               // sp = getSharedPreferences("userid",MODE_PRIVATE);
                SharedPreferences.Editor editor = getSharedPreferences("pref",MODE_PRIVATE).edit();
                editor.putString("Username",UserId.getText().toString());
                editor.putString("Email",Email.getText().toString());
                editor.putString("Password",Pass.getText().toString());
                editor.putString("dob",dob.getText().toString());
                editor.apply();
                startActivity(intentObj);

    }
});

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentObj1 = new Intent(MainActivity.this,Activity2.class);
                startActivity(intentObj1);
            }
        });



    }
}