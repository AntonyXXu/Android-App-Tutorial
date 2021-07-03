package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
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

    public void handleTextView(View v) {
        EditText text = findViewById(R.id.nameTextField);
        String input = text.getText().toString();
        Button b = (Button) v;
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();

        Log.d("info", input);
    }

    public void launchSettings(View v) {
        // launch a new activity
        EditText text = findViewById(R.id.nameTextField);
        String input = text.getText().toString();
        Intent i = new Intent(this, SettingsActivity.class);
        i.putExtra("Cool", input);
        startActivity(i);

    }
}