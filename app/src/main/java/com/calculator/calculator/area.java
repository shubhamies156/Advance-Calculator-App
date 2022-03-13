package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class area extends AppCompatActivity {
    private Button button12;
    private Button button21;
    private Button button24;
    private Button button25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        button12=findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(area.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(area.this,square.class);
                startActivity(intent);
            }
        });
        button21=findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(area.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(area.this,rectangle.class);
                startActivity(intent);
            }
        });
        button24=findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(area.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(area.this,circle.class);
                startActivity(intent);
            }
        });
        button25=findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(area.this, "opening", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(area.this,triangle.class);
                startActivity(intent);
            }
        });
    }
}