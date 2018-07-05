package com.example.halfdevil.database_implement;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Toast.makeText(getApplicationContext(),"Welcome USER",Toast.LENGTH_SHORT).show();
        tv = (TextView)findViewById(R.id.textView);
    }
}
