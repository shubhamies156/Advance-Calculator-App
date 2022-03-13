package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class currency extends AppCompatActivity {
    private Button button15;
    private Button button16;
    private EditText editTextNumber4;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        button15=findViewById(R.id.button15);
        button16=findViewById(R.id.button16);
        editTextNumber4=findViewById(R.id.editTextNumber4);
        textView2=findViewById(R.id.textView2);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(currency.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumber4.getText().toString();
                float rupya= Float.parseFloat(k);
                float dollar = (float)(rupya / 74.64);
                textView2.setText(dollar + " dollar");
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(currency.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumber4.getText().toString();
                float rupya= Float.parseFloat(k);
                float dollar = (float) (rupya * 74.64);
                textView2.setText(dollar + " rupees");
            }
        });
    }
}