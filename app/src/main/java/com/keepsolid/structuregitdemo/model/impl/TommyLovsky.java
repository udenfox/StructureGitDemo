package com.keepsolid.structuregitdemo.model.impl;

import com.keepsolid.structuregitdemo.model.Student;

public class TommyLovsky extends Student {

    String name;
    String surname;

    @Override
    public String getName() {
        return "Tommy";
    }

    @Override
    public String getSurname() {
        return "Lovsky";
    }

    public TommyLovsky(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
