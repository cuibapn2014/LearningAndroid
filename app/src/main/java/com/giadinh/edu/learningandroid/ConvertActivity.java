package com.giadinh.edu.learningandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.EventLog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity{
    public static final String TAG = "MyMessage";
    Button btnTotal, btnDiff, btnCal, btnTrade, btnExit, btnUC;
    EditText num_a;
    EditText num_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTotal = (Button) findViewById(R.id.total_number);
        btnDiff = (Button) findViewById(R.id.diff_number);
        btnCal = (Button) findViewById(R.id.cal_number);
        btnTrade = (Button) findViewById(R.id.trad_number);
        btnExit = (Button) findViewById(R.id.btn_exit);
        btnUC = (Button) findViewById(R.id.btn_uoc_chung);


        btnTotal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                ConstraintLayout baseView = findViewById(R.id.main_content);
                num_a = (EditText) findViewById(R.id.number_a);
                num_b = (EditText) findViewById(R.id.number_b);

                if(num_a.getText().length() > 0 && num_b.getText().length() > 0) {
                    int a = Integer.parseInt(num_a.getText() + "");
                    int b = Integer.parseInt(num_b.getText() + "");
                    String total = (String) String.valueOf(a + b);
                    TextView kq = (TextView) findViewById(R.id.kq);
                    kq.setText(total);
                    Snackbar.make(baseView, "Có kết quả rồi đó cha coi đi",Snackbar.LENGTH_SHORT).show();
                    ((EditText) findViewById(R.id.number_a)).setBackgroundTintList(getResources().getColorStateList(R.color.colorSuccess));
                    ((EditText) findViewById(R.id.number_b)).setBackgroundTintList(getResources().getColorStateList(R.color.colorSuccess));
                }else{
                    ((EditText) findViewById(R.id.number_a)).setBackgroundTintList(getResources().getColorStateList(R.color.colorDanger));
                    ((EditText) findViewById(R.id.number_b)).setBackgroundTintList(getResources().getColorStateList(R.color.colorDanger));
                }
            }
        });

        btnDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConstraintLayout baseView = findViewById(R.id.main_content);
                num_a = (EditText) findViewById(R.id.number_a);
                num_b = (EditText) findViewById(R.id.number_b);

                if(num_a.getText().length() > 0 && num_b.getText().length() > 0) {
                    int a = Integer.parseInt(num_a.getText() + "");
                    int b = Integer.parseInt(num_b.getText() + "");
                    String diff = (String) String.valueOf(a - b);
                    TextView kq = (TextView) findViewById(R.id.kq);
                    kq.setText(diff);
                    Snackbar.make(baseView, "Có kết quả rồi đó cha coi đi",Snackbar.LENGTH_SHORT).show();
                    ((EditText) findViewById(R.id.number_a)).setBackgroundTintList(getResources().getColorStateList(R.color.colorSuccess));
                    ((EditText) findViewById(R.id.number_b)).setBackgroundTintList(getResources().getColorStateList(R.color.colorSuccess));
                }else{
                    ((EditText) findViewById(R.id.number_a)).setBackgroundTintList(getResources().getColorStateList(R.color.colorDanger));
                    ((EditText) findViewById(R.id.number_b)).setBackgroundTintList(getResources().getColorStateList(R.color.colorDanger));
                }
            }
        });

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConstraintLayout baseView = findViewById(R.id.main_content);
                num_a = (EditText) findViewById(R.id.number_a);
                num_b = (EditText) findViewById(R.id.number_b);

                if(num_a.getText().length() > 0 && num_b.getText().length() > 0) {
                    int a = Integer.parseInt(num_a.getText() + "");
                    int b = Integer.parseInt(num_b.getText() + "");
                    String cal = (String) String.valueOf(a * b);
                    TextView kq = (TextView) findViewById(R.id.kq);
                    kq.setText(cal);
                    Snackbar.make(baseView, "Có kết quả rồi đó cha coi đi",Snackbar.LENGTH_SHORT).show();
                    ((EditText) findViewById(R.id.number_a)).setBackgroundTintList(getResources().getColorStateList(R.color.colorSuccess));
                    ((EditText) findViewById(R.id.number_b)).setBackgroundTintList(getResources().getColorStateList(R.color.colorSuccess));
                }else{
                    ((EditText) findViewById(R.id.number_a)).setBackgroundTintList(getResources().getColorStateList(R.color.colorDanger));
                    ((EditText) findViewById(R.id.number_b)).setBackgroundTintList(getResources().getColorStateList(R.color.colorDanger));
                }
            }
        });

        btnTrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConstraintLayout baseView = findViewById(R.id.main_content);
                num_a = (EditText) findViewById(R.id.number_a);
                num_b = (EditText) findViewById(R.id.number_b);

                if(num_a.getText().length() > 0 && num_b.getText().length() > 0) {
                    int a = Integer.parseInt(num_a.getText() + "");
                    int b = Integer.parseInt(num_b.getText() + "");
                    String trade = (String) String.valueOf(a / b);
                    TextView kq = (TextView) findViewById(R.id.kq);
                    kq.setText(trade);
                    Snackbar.make(baseView, "Có kết quả rồi đó cha coi đi",Snackbar.LENGTH_SHORT).show();
                    ((EditText) findViewById(R.id.number_a)).setBackgroundTintList(getResources().getColorStateList(R.color.colorSuccess));
                    ((EditText) findViewById(R.id.number_b)).setBackgroundTintList(getResources().getColorStateList(R.color.colorSuccess));
                }else{
                    ((EditText) findViewById(R.id.number_a)).setBackgroundTintList(getResources().getColorStateList(R.color.colorDanger));
                    ((EditText) findViewById(R.id.number_b)).setBackgroundTintList(getResources().getColorStateList(R.color.colorDanger));
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConstraintLayout main_content = findViewById(R.id.main_content);
                finish();
            }
        });

        btnUC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ConstraintLayout baseView = findViewById(R.id.main_content);
                TextView result = (TextView) findViewById(R.id.kq);
                num_a = (EditText) findViewById(R.id.number_a);
                num_b = (EditText) findViewById(R.id.number_b);
                if(num_a.getText().length() > 0 && num_b.getText().length() > 0) {
                    int a = Integer.parseInt(num_a.getText() + "");
                    int b = Integer.parseInt(num_b.getText() + "");
                    int min = a;
                    int kq = 1;
                    if(min > b) min = b;
                    for(int i = 1;i <= min;i++){
                        if(a % i == 0 && b % i == 0)
                            kq = i;
                    }
                        result.setText(String.valueOf(kq));
                        Toast.makeText(MainActivity.this, "Có kết quả rồi đó cha coi đi: " +  String.valueOf(kq), Toast.LENGTH_LONG).show();
                        Snackbar.make(baseView, "Có kết quả rồi đó cha coi đi: " +  String.valueOf(kq), Snackbar.LENGTH_LONG).show();
                    ((EditText) findViewById(R.id.number_a)).setBackgroundTintList(getResources().getColorStateList(R.color.colorSuccess));
                    ((EditText) findViewById(R.id.number_b)).setBackgroundTintList(getResources().getColorStateList(R.color.colorSuccess));
                }else{
                    ((EditText) findViewById(R.id.number_a)).setBackgroundTintList(getResources().getColorStateList(R.color.colorDanger));
                    ((EditText) findViewById(R.id.number_b)).setBackgroundTintList(getResources().getColorStateList(R.color.colorDanger));
                }
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