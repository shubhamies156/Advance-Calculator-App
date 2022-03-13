package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class root extends AppCompatActivity {
    private Button button13;
    private Button button14;
    private TextView textView;
    private EditText editTextNumber156;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        textView = findViewById(R.id.textView);
        editTextNumber156 = findViewById(R.id.editTextNumber156);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(root.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumber156.getText().toString();
                float number = Float.parseFloat(k);
                float root1 = (float) Math.sqrt(number);
                textView.setText(root1+"");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(root.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumber156.getText().toString();
                float number = Float.parseFloat(k);
                float root1 = (float) Math.cbrt(number);
                textView.setText(root1+"");
            }
        });
    }
}