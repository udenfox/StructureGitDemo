package com.keepsolid.structuregitdemo.model.impl;

import com.keepsolid.structuregitdemo.model.Student;

public class ExampleStudent extends Student {
    @Override
    public String getName() {
        return "Primer";
    }

    @Override
    public String getSurname() {
        return "Examplovich";
    }
}
