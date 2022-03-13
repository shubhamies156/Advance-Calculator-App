package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class rectangle extends AppCompatActivity {
    private Button buttonR1;
    private Button buttonR2;
    private TextView textViewR1;
    private EditText editTextNumberR1;
    private EditText editTextNumberR2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        buttonR1 = findViewById(R.id.buttonR1);
        buttonR2 = findViewById(R.id.buttonR2);
        textViewR1 = findViewById(R.id.textViewR1);
        editTextNumberR1 = findViewById(R.id.editTextNumberR1);
        editTextNumberR2 = findViewById(R.id.editTextNumberR2);
        buttonR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(rectangle.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumberR1.getText().toString();
                double a = Double.parseDouble(k);
                String s= editTextNumberR2.getText().toString();
                double b = Double.parseDouble(s);
                double ar=a*b;
                textViewR1.setText("area is "+ar);
            }
        });
        buttonR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(rectangle.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumberR1.getText().toString();
                double a = Double.parseDouble(k);
                String s= editTextNumberR2.getText().toString();
                double b = Double.parseDouble(s);
                double pr=2*(a+b);
                textViewR1.setText("area is "+pr);
            }
        });
    }
}