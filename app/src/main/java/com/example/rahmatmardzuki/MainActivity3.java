package com.example.rahmatmardzuki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void beranda2(View view) {
        Intent e = new Intent(MainActivity3.this , MainActivity.class);
        startActivity(e);
    }

    public void artikel2(View view) {
        Intent f = new Intent(MainActivity3.this , MainActivity2. class);
        startActivity(f);
    }
}