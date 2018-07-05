package com.example.halfdevil.database_implement;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button login;
    EditText useremail,password;
    TextView t,p;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        useremail = (EditText)findViewById(R.id.mail);
        password = (EditText)findViewById(R.id.password);
        t = (TextView)findViewById(R.id.t);


        login = (Button)findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DBHelper dbh=new DBHelper(getApplicationContext());

                String newemail = useremail.getText().toString();
                String pass = password.getText().toString();

               if(dbh.validateLogin(newemail,pass))
               {
                   Intent intentObj = new Intent(Activity2.this,Activity3.class);
                   startActivity(intentObj);
               }
               else {
                   Toast.makeText(getApplicationContext(),"Wrong username or password",Toast.LENGTH_SHORT).show();
             }




            }
        });


    }
}
