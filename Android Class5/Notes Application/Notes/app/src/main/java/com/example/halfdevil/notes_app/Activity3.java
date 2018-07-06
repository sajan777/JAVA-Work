package com.example.halfdevil.notes_app;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity3 extends AppCompatActivity {

    EditText editText2;
    ArrayList<String> save;
    ArrayAdapter<String> arrayAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

       // editText2 = (EditText) findViewById(R.id.editText2);
        listView = (ListView)findViewById(R.id.list);

        takeNotes();
    }
    void takeNotes(){
        save = new ArrayList<String>();
        try{
            SQLiteDatabase database = this.openOrCreateDatabase("NewDatabase",MODE_PRIVATE,null);
            Cursor cursor = database.rawQuery("select * from list",null);
            int note = cursor.getColumnIndex("notetext");
            cursor.moveToFirst();
            while (cursor != null){
                Log.i("save",cursor.getString(note));
                save.add(cursor.getString(note));
                cursor.moveToNext();
            }

        }catch (Exception e){}
        finally {
            {
                arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,save);
                listView.setAdapter(arrayAdapter);
            }
        }
    }
}
