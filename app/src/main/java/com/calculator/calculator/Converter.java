package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Converter extends AppCompatActivity {
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Converter.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Converter.this,currency.class);
                startActivity(intent);
            }
        });
        button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Converter.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Converter.this,weight.class);
                startActivity(intent);
            }
        });
        button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Converter.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Converter.this,length.class);
                startActivity(intent);
            }
        });
        button7=findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Converter.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Converter.this,temprature.class);
                startActivity(intent);
            }
        });
    }
}