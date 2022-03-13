package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class triangle extends AppCompatActivity {
    private Button buttonT1;
    private Button buttonT2;
    private TextView textViewT1;
    private EditText editTextT1;
    private EditText editTextT2;
    private EditText editTextT3;
    private EditText editTextT4;
    private EditText editTextT5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        buttonT1 = findViewById(R.id.buttonT1);
        buttonT2 = findViewById(R.id.buttonT2);
        textViewT1 = findViewById(R.id.textViewT1);
        editTextT1 = findViewById(R.id.editTextT1);
        editTextT2 = findViewById(R.id.editTextT2);
        editTextT3 = findViewById(R.id.editTextT3);
        editTextT4 = findViewById(R.id.editTextT4);
        editTextT5 = findViewById(R.id.editTextT5);
        buttonT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(triangle.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextT1.getText().toString();
                double a = Double.parseDouble(k);
                String s= editTextT2.getText().toString();
                double b = Double.parseDouble(s);
                double ar=(a*b)/2;
                textViewT1.setText("area is "+ar);
            }
        });
        buttonT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(triangle.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextT3.getText().toString();
                double a = Double.parseDouble(k);
                String s= editTextT4.getText().toString();
                double b = Double.parseDouble(s);
                String l= editTextT5.getText().toString();
                double c = Double.parseDouble(l);
                double pr=a+b+c;
                textViewT1.setText("perimeter is "+pr);
            }
        });
    }
}