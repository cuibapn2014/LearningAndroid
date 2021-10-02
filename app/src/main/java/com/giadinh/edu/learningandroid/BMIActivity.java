package com.giadinh.edu.learningandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.snackbar.Snackbar;

public class ConvertActivity extends AppCompatActivity{
    Button btnToCel, btnToFah, btnSwipe, btnClear;
    EditText cel;
    EditText fah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        btnSwipe = (Button) findViewById(R.id.btn_swipe2);
        btnToCel = (Button) findViewById(R.id.to_celsius);
        btnToFah = (Button) findViewById(R.id.to_fahrenheit);
        btnClear = (Button) findViewById(R.id.btn_clear);
        cel = (EditText) findViewById(R.id.cel);
        fah = (EditText) findViewById(R.id.fah);

        btnSwipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConvertActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnToCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kq;
                if(fah.getText().length() > 0) {
                    double fahrenheit = Double.parseDouble(fah.getText().toString());
                    kq = (fahrenheit - 32) / 1.8;
                    cel.setText(String.valueOf(kq));
                }
            }
        });

        btnToFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cel.getText().length() > 0) {
                    double celsius = Double.parseDouble(cel.getText().toString());
                    fah.setText(String.valueOf(celsius * 1.8 + 32));
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View base = findViewById(R.id.convert_content);
                cel.setText("");
                fah.setText("");
                Snackbar.make(base,"Đã làm sạch",Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Thank you for used application", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}