package com.example.halfdevil.database_implement;

import android.content.Intent;
import android.content.SharedPreferences;
import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Login,signup;
    EditText username,Email,dob,password;
    TextView u,p,e,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = (EditText)findViewById(R.id.Email);
        username = (EditText)findViewById(R.id.username);
        dob = (EditText)findViewById(R.id.dob);
        password = (EditText)findViewById(R.id.password);


        u = (TextView)findViewById(R.id.u);
        p = (TextView)findViewById(R.id.p);
        e = (TextView)findViewById(R.id.e);
        d = (TextView)findViewById(R.id.d);


        Login = (Button)findViewById(R.id.login);
        signup = (Button)findViewById(R.id.signup);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DBHelper dbh=new DBHelper(getApplicationContext());
                Contacts cont=new Contacts("username.getText().toString()","password.getText().toString()","Email.getText().toString()","dob.getText().toString()");
                dbh.addContact(cont);
                Intent intentObj = new Intent(MainActivity.this,Activity2.class);
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
