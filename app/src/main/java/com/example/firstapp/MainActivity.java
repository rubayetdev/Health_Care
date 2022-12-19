package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView namText, descriptionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namText = (TextView) findViewById(R.id.nameText);
        namText.setText("Developed by:");
        descriptionText = (TextView) findViewById(R.id.dText);
        descriptionText.setText("Sheikh Md. Rubayet");
    }
}