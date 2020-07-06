package com.keepsolid.structuregitdemo.model.impl;

import com.keepsolid.structuregitdemo.model.Student;

public class VladBerestenko extends Student {

    String name, surname;

    public VladBerestenko (String ename, String esurname) {
        name=ename;
        surname=esurname;
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
