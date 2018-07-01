package com.example.halfdevil.toast_gravity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //overriding the various android lifecycle methods

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //creating a new toast and setting the parameters and saving the refrence in the var t of toast type

            Toast t = Toast.makeText(getApplicationContext(),"Activity Created",Toast.LENGTH_SHORT);
            //now t.setGravity is a method in the toast that allows the message to appear at what part of the
            //screen
            t.setGravity(Gravity.CENTER,0,0);
            //t.show shows the message to display
            t.show();
        }


        protected void onRestart() {
            super.onRestart();
            setContentView(R.layout.activity_main);

            //creating a new toast and setting the parameters and saving the refrence in the var t of toast type

            Toast t = Toast.makeText(getApplicationContext(),"Activity Restarted",Toast.LENGTH_SHORT);
            //now t.setGravity is a method in the toast that allows the message to appear at what part of the
            //screen
            t.setGravity(Gravity.CENTER,0,0);
            //t.show shows the message to display
            t.show();
        }


        protected void onPause() {
            super.onPause();
            setContentView(R.layout.activity_main);

            //creating a new toast and setting the parameters and saving the refrence in the var t of toast type

            Toast t = Toast.makeText(getApplicationContext(),"Activity Paused",Toast.LENGTH_SHORT);
            //now t.setGravity is a method in the toast that allows the message to appear at what part of the
            //screen
            t.setGravity(Gravity.CENTER,0,0);
            //t.show shows the message to display
            t.show();
        }

        protected void onStop() {
            super.onStop();
            setContentView(R.layout.activity_main);

            //creating a new toast and setting the parameters and saving the refrence in the var t of toast type

            Toast t = Toast.makeText(getApplicationContext(),"Activity Stopped",Toast.LENGTH_SHORT);
            //now t.setGravity is a method in the toast that allows the message to appear at what part of the
            //screen
            t.setGravity(Gravity.CENTER,0,0);
            //t.show shows the message to display
            t.show();
        }

        protected void onStart() {
            super.onStart();
            setContentView(R.layout.activity_main);

            //creating a new toast and setting the parameters and saving the refrence in the var t of toast type

            Toast t = Toast.makeText(getApplicationContext(),"Activity Started",Toast.LENGTH_SHORT);
            //now t.setGravity is a method in the toast that allows the message to appear at what part of the
            //screen
            t.setGravity(Gravity.CENTER,0,0);
            //t.show shows the message to display
            t.show();
        }

        protected void onResume() {
            super.onResume();
            setContentView(R.layout.activity_main);

            //creating a new toast and setting the parameters and saving the refrence in the var t of toast type

            Toast t = Toast.makeText(getApplicationContext(),"Activity Resumed",Toast.LENGTH_SHORT);
            //now t.setGravity is a method in the toast that allows the message to appear at what part of the
            //screen
            t.setGravity(Gravity.CENTER,0,0);
            //t.show shows the message to display
            t.show();
        }

    }
