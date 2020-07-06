package com.keepsolid.structuregitdemo.model.impl;

import com.keepsolid.structuregitdemo.model.Student;

public class VasylyIshkov extends Student {

    private String name, surname;

    public VasylyIshkov() {
        name = "Vasyly";
        surname = "Ishkov";
    }

    public VasylyIshkov(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getSurname() {
        return null;
    }
    public String getInfo()
    {
        return "Name: "+name+" Surname: "+surname;
    }
}
