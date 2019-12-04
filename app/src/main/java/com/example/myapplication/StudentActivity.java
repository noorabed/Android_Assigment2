package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        String id = getIntent().getStringExtra("id");
        String name = getIntent().getStringExtra("name");
        String level = getIntent().getStringExtra("level");
        String avg = getIntent().getStringExtra("avg");
    }
}




