package com.symmetron.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_0 = findViewById(R.id.button_0);
        Button button_1 = findViewById(R.id.button_1);
        Button button_2 = findViewById(R.id.button_2);
        Button button_3 = findViewById(R.id.button_3);
        Button button_4 = findViewById(R.id.button_4);
        Button button_5 = findViewById(R.id.button_5);
        Button button_6 = findViewById(R.id.button_6);
        Button button_7 = findViewById(R.id.button_7);
        Button button_8 = findViewById(R.id.button_8);
        Button button_9 = findViewById(R.id.button_9);
        Button button_plus = findViewById(R.id.button_plus);
        Button button_minus = findViewById(R.id.button_minus);
        Button button_division = findViewById(R.id.button_division);
        Button button_multi = findViewById(R.id.button_multi);
        Button button_equals = findViewById(R.id.button_equals);
        final EditText screen = findViewById(R.id.editText);

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen.getText().toString().equals("0")){
                    screen.setText("0");
                }
                else if (screen.length()<8)
                    screen.append("0");
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen.getText().toString().equals("0")){
                    screen.setText("1");
                }
                else if (screen.length()<8)
                    screen.append("1");
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen.getText().toString().equals("0")){
                    screen.setText("2");
                }
                else if (screen.length()<8)
                    screen.append("2");
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen.getText().toString().equals("0")){
                    screen.setText("3");
                }
                else if (screen.length()<8)
                    screen.append("3");
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen.getText().toString().equals("0")){
                    screen.setText("4");
                }
                else if (screen.length()<8)
                    screen.append("4");
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen.getText().toString().equals("0")){
                    screen.setText("5");
                }
                else if (screen.length()<8)
                    screen.append("5");
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen.getText().toString().equals("0")){
                    screen.setText("6");
                }
                else if (screen.length()<8)
                    screen.append("6");
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen.getText().toString().equals("0")){
                    screen.setText("7");
                }
                else if (screen.length()<8)
                    screen.append("7");
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen.getText().toString().equals("0")){
                    screen.setText("8");
                }
                else if (screen.length()<8)
                    screen.append("8");
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen.getText().toString().equals("0")){
                    screen.setText("9");
                }
                else if (screen.length()<8)
                    screen.append("9");
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("0");
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("0");
            }
        });
        button_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("0");
            }
        });
        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("0");
            }
        });
        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("0");
            }
        });



    }


}
