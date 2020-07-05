package com.keepsolid.structuregitdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.keepsolid.structuregitdemo.model.Student;
import com.keepsolid.structuregitdemo.model.impl.ExampleStudent;
import com.keepsolid.structuregitdemo.model.impl.PereverzaMariya;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Добавляем в этот список свой класс, с инициализацией
        ArrayList<Student> students = new ArrayList<>();
        students.add(new ExampleStudent());
        students.add(new PereverzaMariya("Mariya","Pereverza"));


    }
}
