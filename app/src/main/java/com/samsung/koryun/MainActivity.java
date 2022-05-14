package com.samsung.koryun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView text;
    int[] btns = {
            R.id.btn1,
            R.id.btn2,
            R.id.btn3,
            R.id.btn4,
            R.id.btn5,
            R.id.btn6,
            R.id.btn7,
            R.id.btn8,
            R.id.btn9,
            R.id.btn10,
            R.id.btn11,
            R.id.btn12,
            R.id.btn13,
            R.id.btn14,
            R.id.btn15,
            R.id.btn16,
            R.id.btn17,
            R.id.btn18,
            R.id.btn19,
    };


    TextView textViewArray [] = new TextView[btns.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         text = findViewById(R.id.textView);
        for (int i = 0; i < btns.length; i++) {
            textViewArray[i].setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:

        }

    }
}