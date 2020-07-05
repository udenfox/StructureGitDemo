package com.keepsolid.structuregitdemo.model.impl;

import com.keepsolid.structuregitdemo.model.Student;

public class PereverzaMariya extends Student {
    String name;
    String surname;

    public PereverzaMariya(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }
}
