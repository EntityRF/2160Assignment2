package com.example.a2160assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring Widgets
    EditText editText;
    TextView textView, textView2, valueOfFah, textView4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiating Widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        valueOfFah = findViewById(R.id.valueOfFah);
        textView4 = findViewById(R.id.textView4);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);

//        // Adding click event for button
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ConvertCelsToFah();
//            }
//
//            private void ConvertCelsToFah() {
//                String valueinCels = editText.getText().toString();
//
//                //converting string to number
//                double Cels = Double.parseDouble(valueinCels);
//
//                //converting cels to fah formula
//                double Fah = (Cels * 1.8) + 32;
//
//                //Display result in textView
//                textView4.setText("" + Fah);
//            }
//            });
    }

    public void onClick(View view) {
        ConvertCelstoFah();
    }

    private void ConvertCelstoFah() {
        String valueinCels = editText.getText().toString();

        //converting string to number
        double Cels = Double.parseDouble(valueinCels);

        //converting cels to fah formula
        double Fah = (Cels * 1.8) + 32;

        //Display result in textView
        valueOfFah.setText("" + Fah);
    }


}