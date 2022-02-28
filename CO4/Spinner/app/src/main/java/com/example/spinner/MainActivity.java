package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] name={"Apple","Tomato","Fizz","Badham","Lettuce",};
    String[] details={"Fruit","Vegetable","Juice","Nuts","Leaves",};

    ArrayAdapter<String> adapter;

    Spinner sp;
    TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=findViewById(R.id.sp);
        tv=findViewById(R.id.tv);

        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,name);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i)
                {
                    case 0:
                        tv.setText(details[i]);
                        break;
                    case 1:
                        tv.setText(details[i]);
                        break;
                    case 2:
                        tv.setText(details[i]);
                        break;
                    case 3:
                        tv.setText(details[i]);
                        break;
                    case 4:
                        tv.setText(details[i]);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}