package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view) {
        EditText eurosTextView = (EditText) findViewById(R.id.eurosTextView);
        EditText dollarsTextView = (EditText) findViewById(R.id.dollarsTextView);
        EditText poundsTextView = (EditText) findViewById(R.id.poundsTextView);

        String eurosAmount = eurosTextView.getText().toString();
        String dollarsAmount = dollarsTextView.getText().toString();
        String poundsAmount = poundsTextView.getText().toString();

        double euros = Double.parseDouble(eurosAmount);
        double dollars = Double.parseDouble(dollarsAmount);
        double pounds = Double.parseDouble(poundsAmount);

        Log.i("Value", "Euros: " + eurosAmount);
        Log.i("Value", "Dollars: " + dollarsAmount);
        Log.i("Value", "Pounds: " + poundsAmount);

        if(euros != 0) {
            dollars = euros * 1.09;
            pounds = euros * 0.88;
        } else if(dollars != 0) {
            euros = dollars * 0.92;
            pounds = dollars * 0.80;
        } else {
            euros = pounds * 1.14;
            dollars = pounds * 1.24;
        }

        eurosTextView.setText(Double.toString(euros));
        dollarsTextView.setText(Double.toString(dollars));
        poundsTextView.setText(Double.toString(pounds));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
