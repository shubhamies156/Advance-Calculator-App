package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class circle extends AppCompatActivity {
    private Button buttonC1;
    private Button buttonC2;
    private TextView textViewC1;
    private EditText editTextNumberC1;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        buttonC1 = findViewById(R.id.buttonC1);
        buttonC2 = findViewById(R.id.buttonC2);
        textViewC1 = findViewById(R.id.textViewC1);
        editTextNumberC1 = findViewById(R.id.editTextNumberC1);
        buttonC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(circle.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumberC1.getText().toString();
                float a = Float.parseFloat(k);
                float ar=(float) (3.14*a*a);
                textViewC1.setText("area is "+ar);
            }
        });
        buttonC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(circle.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumberC1.getText().toString();
                float a = Float.parseFloat(k);
                float cr=(float) ((3.14*a)*2);
                textViewC1.setText("circumference "+cr);
            }
        });
    }
}