package com.example.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
Button b;
EditText e;
TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.helloButton);
        e=  (EditText) findViewById(R.id.personName);
        message=  (TextView) findViewById(R.id.textView);
         b.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 message.setText("Hello " + e.getText());

             }
         });
    }


}