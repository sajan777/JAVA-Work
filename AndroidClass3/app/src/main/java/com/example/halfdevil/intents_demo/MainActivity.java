package com.example.halfdevil.intents_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText u1,p1;
    Button login1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        u1 = (EditText)findViewById(R.id.u1);
        p1 = (EditText)findViewById(R.id.p1);

        login1 = (Button)findViewById(R.id.login1);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentObj = new Intent(MainActivity.this,Activity2.class);

                intentObj.putExtra("Username",u1.getText().toString());
                intentObj.putExtra("Passcode",p1.getText().toString());

                //intentObj.setData(Uri.parse("https://www.google.com/"));
                startActivity(intentObj);
            }
            });
    }


}


