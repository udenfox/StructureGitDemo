package com.keepsolid.structuregitdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> students = new ArrayList<>();
        students.add("Student1");
        students.add("Student2");
        students.add("Student3");
        students.add("Student4");
        students.add("Student5");
        students.add("Student6");
        students.add("Student10");
        students.add("Student11");

    }
}
