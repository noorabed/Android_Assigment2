package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Student> studentList = new ArrayList<>();
    RecyclerView student_rv;
    StudentAdapter studentsAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        student_rv = findViewById(R.id.notes_rv);
        student_rv.setLayoutManager(new LinearLayoutManager(this));
       studentsAdapter = new StudentAdapter(this ,studentList );
        student_rv.setAdapter(studentsAdapter);
    }
    private void initData() {
       studentList .add(new Student("1","noor","5",80));
        studentList .add(new Student("2","amal","5",50));
        studentList .add(new Student("3","ali","5",70));
    }
}
