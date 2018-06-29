package com.example.halfdevil.toastwithgravity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a new toast and setting down the parameters and saving the refrence in the toast var type t
        Toast t = Toast.makeText(getApplicationContext(),"The Message Appears",Toast.LENGTH_SHORT);
        //setGravity is to set the apperance of message to what part of the screen
        t.setGravity(Gravity.CENTER,0,0);
        //t.show displays message to the screen
        t.show();


    }
}
