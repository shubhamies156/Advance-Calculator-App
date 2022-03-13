package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class length extends AppCompatActivity {
    private Button button19;
    private Button button20;
    private EditText editTextNumber3;
    private TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        button19=findViewById(R.id.button19);
        button20=findViewById(R.id.button20);
        editTextNumber3=findViewById(R.id.editTextNumber3);
        textView5=findViewById(R.id.textView5);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(length.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumber3.getText().toString();
                float m = Float.parseFloat(k);
                float foot = (float) (m *  3.281);
                textView5.setText(foot + " feet");
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(length.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumber3.getText().toString();
                float km = Float.parseFloat(k);
                float foot = (float) (km / 3.281);
                textView5.setText(foot + " meter");
            }});
        }}