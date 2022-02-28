package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText e1,e2;
    private Button b1,b2,b3,b4,b5;
    private TextView t;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.num1);
        e2=findViewById(R.id.num2);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        t=findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1=e1.getText().toString();
                final int n1=Integer.parseInt(num1);
                String num2=e2.getText().toString();
                final int n2=Integer.parseInt(num2);

                result=n1+n2;
                t.setText(Integer.toString(result));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1=e1.getText().toString();
                final int n1=Integer.parseInt(num1);
                String num2=e2.getText().toString();
                final int n2=Integer.parseInt(num2);

                result=n1-n2;
                t.setText(Integer.toString(result));

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1=e1.getText().toString();
                final int n1=Integer.parseInt(num1);
                String num2=e2.getText().toString();
                final int n2=Integer.parseInt(num2);

                result=n1*n2;
                t.setText(Integer.toString(result));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1=e1.getText().toString();
                final int n1=Integer.parseInt(num1);
                String num2=e2.getText().toString();
                final int n2=Integer.parseInt(num2);

                result=n1/n2;
                t.setText(Integer.toString(result));
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1=e1.getText().toString();
                final int n1=Integer.parseInt(num1);
                String num2=e2.getText().toString();
                final int n2=Integer.parseInt(num2);

                result=n1%n2;
                t.setText(Integer.toString(result));
            }
        });



    }
}