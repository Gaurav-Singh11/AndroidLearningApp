package com.example.androidlearningapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {

    TextView titleText, counterText;
    Button button;
    int counter = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        titleText = findViewById(R.id.counterTitle);
        counterText = findViewById(R.id.counter);
        button = findViewById(R.id.counterButton);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ++counter;
                counterText.setText(""+counter);
            }
        });
    }


}

