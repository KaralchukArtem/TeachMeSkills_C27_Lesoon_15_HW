package com.teachmeskills.lesson15.task4.person.impl;

import com.teachmeskills.lesson15.task4.person.Person;

public class Teacher extends Person {
    boolean isTeacher;

    public Teacher(String name, int age) {
        super(name, age);
        this.isTeacher = true;
    }

    @Override
    public String toString() {
        return "Teacher " + super.toString();
    }
}
