package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class square extends AppCompatActivity {
    private Button buttonS1;
    private Button buttonS2;
    private TextView textViewS1;
    private EditText editTextNumberS1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        buttonS1 = findViewById(R.id.buttonS1);
        buttonS2 = findViewById(R.id.buttonS2);
        textViewS1 = findViewById(R.id.textViewS1);
        editTextNumberS1 = findViewById(R.id.editTextNumberS1);
        buttonS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(square.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumberS1.getText().toString();
                double a = Double.parseDouble(k);
                double ar=a*a;
                textViewS1.setText("area is "+ar);
            }
        });
        buttonS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(square.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumberS1.getText().toString();
                double a = Double.parseDouble(k);
                double Pr=4*a;
                textViewS1.setText("perimeter is "+Pr);
            }
        });
    }
}