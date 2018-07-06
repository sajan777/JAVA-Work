package com.example.halfdevil.notes_app;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    EditText editText;
    Button button,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        button3 = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentObj = new Intent(Activity2.this, Activity3.class);
                startActivity(intentObj);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String save = editText.getText().toString();
                newNote(save);
            }
        });
    }

        void newNote(String save){

            try {
                SQLiteDatabase database = this.openOrCreateDatabase("NewDatabase", MODE_PRIVATE, null);
                database.execSQL("create table if not exists list (notetext VARCHAR)");

                database.execSQL("insert into list values('" + save + "')");
                Log.i("save","Done");
                Toast.makeText(getApplicationContext(),"Added",Toast.LENGTH_SHORT).show();
            }catch (Exception e){}
        }

    }


