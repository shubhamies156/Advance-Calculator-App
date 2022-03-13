package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class prime extends AppCompatActivity {
    private Button buttonP1;
    private Button buttonP2;
    private TextView textViewP1;
    private EditText editTextNumberP1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);
        buttonP1 = findViewById(R.id.buttonP1);
        buttonP2 = findViewById(R.id.buttonP2);
        textViewP1 = findViewById(R.id.textViewP1);
        editTextNumberP1 = findViewById(R.id.editTextNumberP1);
        buttonP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(prime.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumberP1.getText().toString();
                int a = Integer.parseInt(k);
                int i;
                int b=2;
                String s ="COMPOSITE";
                int n = a / 2;
                for (i = 1; i <= n; i++) {
                    if (a > 3 && a % b == 0) {
                        s = "COMPOSITE";
                        b=0;

                    } else {
                        s = "PRIME";
                    }
                    b++;
                }
                textViewP1.setText(k+" is "+s);
            }
        });
        buttonP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(prime.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumberP1.getText().toString();
                int n;
                String r;
                n = Integer.parseInt(k);
                if (n % 2 == 0) {
                    r="even";
                } else {
                    r="odd";
                }
                textViewP1.setText(k+" is "+r);
            }
        });
    }
}