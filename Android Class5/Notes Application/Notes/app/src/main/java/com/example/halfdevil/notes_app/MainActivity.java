package com.example.halfdevil.notes_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button takeNote,showNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    takeNote = (Button)findViewById(R.id.button1);
        showNote = (Button)findViewById(R.id.button2);

        takeNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentObj = new Intent(MainActivity.this,Activity2.class);
                startActivity(intentObj);

            }
        });

        showNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentObj1 = new Intent(MainActivity.this,Activity3.class);
                startActivity(intentObj1);

            }
        });

    }
}
