package com.keepsolid.structuregitdemo.model.impl;

import com.keepsolid.structuregitdemo.model.Student;

public class MariiaKozhushan extends Student {

    String name;
    String surname;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    public MariiaKozhushan(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
}
