package com.calculator.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class temprature extends AppCompatActivity {
    private Button button17;
    private Button button18;
    private TextView textView4;
    private EditText editTextNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temprature);
        button17=findViewById(R.id.button17);
        button18=findViewById(R.id.button18);
        textView4=findViewById(R.id.textView4);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(temprature.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumber2.getText().toString();
                float fh = Float.parseFloat(k);
                float cl = (fh - 32) * 5/9;
                textView4.setText(cl + " c");
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(temprature.this, "Calculating", Toast.LENGTH_SHORT).show();
                String k = editTextNumber2.getText().toString();
                float fh = Float.parseFloat(k);
                float cl = (fh * 5/9)+32;
                textView4.setText(cl + " f");
            }
        });
    }

    public void setButton18(Button button18) {
        this.button18 = button18;
    }
}