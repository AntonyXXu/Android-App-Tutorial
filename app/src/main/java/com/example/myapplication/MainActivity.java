package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disable(View v) {
        v.setEnabled(false);
        Log.d("success", "button disabled");
        Button button = (Button) v;
        button.setText("Button now disabled");
    }

    public void changeText(View v) {
       TextView myView = findViewById(R.id.HelloWorld);
       myView.setText("Goodbye...");
    }
}