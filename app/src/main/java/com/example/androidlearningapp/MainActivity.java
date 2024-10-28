package com.example.androidlearningapp;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView title;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// Initialize UI elements and variables here
        Log.d("MainActivity ===> ", "onCreate() method is called");
        Toast.makeText(this, "onCreate() method is called", Toast.LENGTH_SHORT).show();

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        title = findViewById(R.id.title);

        button.setOnClickListener(v -> {
            String inputName = editText.getText().toString();
            Toast.makeText(
                    MainActivity.this,
                    "Welcome  " + inputName + " to our App",
                    Toast.LENGTH_LONG).show();
//                Intent myIntent = new Intent(MainActivity.this, CounterActivity.class);
//                startActivity(myIntent);
//                Intent myIntent = new Intent(MainActivity.this, UnitConvertorActivity.class);
//                startActivity(myIntent);


            // Intents:- facilitates communication b/w different components of an app as well
            // as different applications.
            // Types of intents:- 1. Explicit, 2. Implicit

        });


       /* TextView myTextView = findViewById(R.id.myTextView);
        myTextView.setText("Hi Gaurav");*/

        /*EditText myEditText = findViewById(R.id.myEditText);
        String inputText = String.valueOf(myEditText.getText());

        myEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                Log.d("Main Activity:===>", s.toString());
//                Log.d("Main Activity:===>", String.valueOf(start));
//                Log.d("Main Activity:===>", String.valueOf(before));
//                Log.d("Main Activity:===>", String.valueOf(count));
                Log.d("Main Activity:===>", inputText);
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("Main Activity:===>", s.toString());
            }
        });*/

        /*Button myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Log.d("Main Activity On Click:====>", "You are clicked on this Button.");
                Toast.makeText(MainActivity.this, "You are clicked on this Button.", Toast.LENGTH_SHORT).show();
            }
        });*/

       /* ImageView imageView = findViewById(R.id.myImageView);
        imageView.setImageResource(R.drawable.messenger);*/


    }
    // Explicit Intent
    /*public void goToSecondActivity(){
        Intent intent = new Intent(this, CounterActivity.class);
        startActivity(intent);
    }*/

    // Implicit Intent
    /*public void openWebPage(){
        Uri webpage = Uri.parse("https://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }*/



    @Override
    protected void onStart() {
        super.onStart();
        /// Start animations or UI-related tasks
        Log.d("MainActivity ===> ", "onStart() method is called");
        Toast.makeText(this, "onStart() method is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        /// Start sensors, location updates etc...
        Log.d("MainActivity ===> ", "onResume() method is called");
        Toast.makeText(this, "onResume() method is called", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        /// Release resources, pause ongoing operations etc...
        Log.d("MainActivity ===> ", "onPause() method is called");
        Toast.makeText(this, "onPause() method is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        /// Release resources, save data etc...
        Log.d("MainActivity ===> ", "onStop() method is called");
        Toast.makeText(this, "onStop() method is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        /// Perform necessary restart tasks
        Log.d("MainActivity ===> ", "onRestart() method is called");
        Toast.makeText(this, "onRestart() method is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        /// Clean up resources, finalize tasks etc...
        Log.d("MainActivity ===> ", "onDestroy() method is called");
        Toast.makeText(this, "onDestroy() method is called", Toast.LENGTH_SHORT).show();
    }
}