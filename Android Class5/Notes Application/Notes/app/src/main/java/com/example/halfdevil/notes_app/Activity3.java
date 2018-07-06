package com.example.halfdevil.notes_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {

    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        editText2 = (EditText) findViewById(R.id.editText2);
    }
}
