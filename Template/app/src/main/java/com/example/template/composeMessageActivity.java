package com.example.template;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class composeMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message);
        Intent i = getIntent();
        String name = i.getStringExtra("Name");

        TextView t = findViewById(R.id.toTxtView);
        t.setText(name);
    }
}