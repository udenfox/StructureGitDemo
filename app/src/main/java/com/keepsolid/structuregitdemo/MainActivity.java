package com.keepsolid.structuregitdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.keepsolid.structuregitdemo.model.Student;
import com.keepsolid.structuregitdemo.model.impl.AlexZhuravlov;
import com.keepsolid.structuregitdemo.model.impl.AlexanderSuprun;
import com.keepsolid.structuregitdemo.model.impl.ExampleStudent;
import com.keepsolid.structuregitdemo.model.impl.PereverzaMariya;
import com.keepsolid.structuregitdemo.model.impl.VasylyIshkov;
import com.keepsolid.structuregitdemo.model.impl.VladBerestenko;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Добавляем в этот список свой класс, с инициализацией
        ArrayList<Student> students = new ArrayList<>();
        students.add(new ExampleStudent());
        students.add(new AlexZhuravlov());
        students.add(new PereverzaMariya("Mariya", "Pereverza"));
        students.add(new VladBerestenko("Vlad", "Berestenko"));
        students.add(new AlexanderSuprun());
        students.add(new VasylyIshkov("Vasyly", "Ishkov"));
        students.add(new WilliamNovitskiy());
        students.add(new MariiaKozhushan("Mariia", "Kozhushan"));
        students.add(new VolodymyrHolichenko("Volodymyr", "Holichenko"));

    }
}
