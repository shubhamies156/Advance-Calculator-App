package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Advance extends AppCompatActivity {
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        button8=findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Advance.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Advance.this,root.class);
                startActivity(intent);
            }
        });
        button9=findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Advance.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Advance.this,prime.class);
                startActivity(intent);
            }
        });
        button10=findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Advance.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Advance.this,factorial.class);
                startActivity(intent);
            }
        });
        button11=findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Advance.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Advance.this,area.class);
                startActivity(intent);
            }
        });
    }
}