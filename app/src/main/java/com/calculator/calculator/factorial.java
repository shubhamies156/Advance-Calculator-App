package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class factorial extends AppCompatActivity {
    private Button buttonF1;
    private Button buttonF2;
    private TextView textViewF1;
    private EditText editTextNumberF1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        buttonF1 = findViewById(R.id.buttonF1);
        buttonF2 = findViewById(R.id.buttonF2);
        textViewF1 = findViewById(R.id.textViewF1);
        editTextNumberF1 = findViewById(R.id.editTextNumberF1);
        buttonF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(factorial.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumberF1.getText().toString();
                float n =Float.parseFloat(k);
                int i;
                float s = 1;
                for (i = 1; i <= n; i++) {
                    s = s * i;
                }
                textViewF1.setText("factorial = "+s);
            }
        });
        buttonF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(factorial.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumberF1.getText().toString();
                float n =Float.parseFloat(k);
                int i;
                float s = 0;
                for (i = 1; i <= n; i++) {
                    s = s + i;
                }
                textViewF1.setText("total sum = "+s);
            }
        });
    }
}