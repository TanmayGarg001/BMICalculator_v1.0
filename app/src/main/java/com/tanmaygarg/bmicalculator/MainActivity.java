/*
* Made by - Tanmay Garg
* Date - 12/2/2021
*
*App for Android JellyBean and above that
* calculates and categorizes your BMI.
*
* */

package com.tanmaygarg.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateBMI(View view) {
        //variables to solve calculate the BMI
        double weight;
        double height;
        double bmi;
        String message = "";


        //references
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        findViewById(R.id.buttonTwo);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        //parsing values
        weight = Double.parseDouble(editText1.toString());
        height = Double.parseDouble(editText2.toString());

        //BMI FORMULA
        bmi = weight / (height * height);

        //display values
        textView1.setText(String.valueOf(bmi));

        if (bmi < 18.5) {
            message = "Under-Weight";
        } else if (bmi >= 18.5 && bmi < 25) {
            message = "Normal";
        } else if (bmi >= 25) {
            message = "Over-Weight";
        }

        textView2.setText(message);

    }
}