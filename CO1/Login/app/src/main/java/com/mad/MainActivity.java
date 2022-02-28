package com.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    private EditText etUser,etPass;
    private Button btLogin;
    private TextView t1;
    int count=5;
    String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser=findViewById(R.id.etUser);
        etPass=findViewById(R.id.etPass);
        btLogin=findViewById(R.id.btLogin);
        t1=findViewById(R.id.tv);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username=etUser.getText().toString();
                password=etPass.getText().toString();

                if (username.equals("admin") && password.equals("1234"))
                {
                    Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();
                   startActivity(new Intent(MainActivity.this,MainActivity2.class));
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                    count--;
                    t1.setText("Login attempts Remaining:"+count);
                    if (count==0)
                    {
                        Toast.makeText(MainActivity.this,"Login Button Disabled",Toast.LENGTH_SHORT).show();
                        btLogin.setEnabled(false);
                    }
                }
            }
        });
    }
}