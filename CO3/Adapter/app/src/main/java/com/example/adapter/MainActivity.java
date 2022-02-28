package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ListView lv=findViewById(R.id.lv);
        String[] colors={"Green","Yellow","Blue","Red"};
        ArrayAdapter<String> colorAdapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,colors);
        try {
            lv.setAdapter(colorAdapter);
        }catch (Exception e)
        {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        }

    }
}