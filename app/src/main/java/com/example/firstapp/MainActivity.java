package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView namText;
    private Button btn,btns;
    int count = 0;
    int cunt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnLog);
        btns = (Button) findViewById(R.id.btnOut);
        namText = (TextView) findViewById(R.id.dText);

        btn.setOnClickListener(this);
        btns.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnLog){
            count++;
            namText.setText("Login " +count+ " times");

        }
        else{
            cunt++;
        namText.setText("Logout " +cunt+ " times");
        }
    }
}