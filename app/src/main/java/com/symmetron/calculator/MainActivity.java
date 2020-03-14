package com.symmetron.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_other);

        Button button0 = findViewById(R.id.button_0);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonDivision = findViewById(R.id.button_division);
        Button buttonMulti = findViewById(R.id.button_multi);
        Button buttonEquals = findViewById(R.id.button_equals);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMulti.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        final EditText screen = findViewById(R.id.editText);

        if (v.getId() == R.id.button_0) {
            writeOnEditTextWhenButtonPressed("0");
        } else if (v.getId() == R.id.button_1) {
            writeOnEditTextWhenButtonPressed("1");
        } else if (v.getId() == R.id.button_2) {
            writeOnEditTextWhenButtonPressed("2");
        } else if (v.getId() == R.id.button_3) {
            writeOnEditTextWhenButtonPressed("3");
        } else if (v.getId() == R.id.button_4) {
            writeOnEditTextWhenButtonPressed("4");
        } else if (v.getId() == R.id.button_5) {
            writeOnEditTextWhenButtonPressed("5");
        } else if (v.getId() == R.id.button_6) {
            writeOnEditTextWhenButtonPressed("6");
        } else if (v.getId() == R.id.button_7) {
            writeOnEditTextWhenButtonPressed("7");
        } else if (v.getId() == R.id.button_8) {
            writeOnEditTextWhenButtonPressed("8");
        } else if (v.getId() == R.id.button_9) {
            writeOnEditTextWhenButtonPressed("9");
        } else if (v.getId() == R.id.button_minus) {
            screen.setText("0");
        } else if (v.getId() == R.id.button_plus) {
            screen.setText("0");
        } else if (v.getId() == R.id.button_multi) {
            screen.setText("0");
        } else if (v.getId() == R.id.button_division) {
            screen.setText("0");
        } else if (v.getId() == R.id.button_equals) {
            screen.setText("0");
        }

    }


    private void writeOnEditTextWhenButtonPressed(String a) {
        final EditText screen = findViewById(R.id.editText);

        if (screen.getText().toString().equals("0")) {
            screen.setText(a);
        } else if (screen.length() < 8)
            screen.append(a);
    }


}
