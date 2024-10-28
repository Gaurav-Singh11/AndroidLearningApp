package com.example.androidlearningapp;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UnitConvertorActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_convertor);
        textView = findViewById(R.id.unitConvertorTextView);
        editText = findViewById(R.id.unitConvertorEditText);
        button = findViewById(R.id.unitConvertorButton);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                hideKeyboard(UnitConvertorActivity.this);

                // Getting the input user input (Kilos)
                String input = editText.getText().toString();

                // Converting a string into double
                double kilos = Double.parseDouble(input);

                // Conversion kilos into pounds
                double pounds = makeConversion(kilos);

                // Displaying the conversion result
                textView.setText("" + pounds);


            }
        });
    }

    public double makeConversion(double kilos) {
        // 1 kilo = 2.20462 pounds

        return kilos * 2.2046;
    }


    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
