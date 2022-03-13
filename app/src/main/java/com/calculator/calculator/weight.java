package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class weight extends AppCompatActivity {
    private Button button22;
    private Button button23;
    private EditText editTextNumber5;
    private TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        textView3 = findViewById(R.id.textView3);
        editTextNumber5 = findViewById(R.id.editTextNumber5);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(weight.this, "Calculating", Toast.LENGTH_SHORT).show();
                String s = editTextNumber5.getText().toString();
                float kg = Float.parseFloat(s);
                float pound = (float) (2.205 * kg);
                textView3.setText(pound + " pound");
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(weight.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumber5.getText().toString();
                float kg = Float.parseFloat(k);
                float pound = (float) (kg / 2.205);
                textView3.setText(pound + " kg");
            }
        });
    }}