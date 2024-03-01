package com.teachmeskills.lesson15.task4.person.impl;

import com.teachmeskills.lesson15.task4.person.Person;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString() {
        return "Student " + super.toString();
    }
}
