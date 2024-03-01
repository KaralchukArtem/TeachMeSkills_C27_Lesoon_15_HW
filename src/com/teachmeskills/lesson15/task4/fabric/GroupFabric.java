package com.teachmeskills.lesson15.task4.fabric;

import com.teachmeskills.lesson15.task4.person.Person;
import com.teachmeskills.lesson15.task4.person.impl.Student;
import com.teachmeskills.lesson15.task4.person.impl.Teacher;

import java.util.LinkedHashSet;
import java.util.Set;

public class GroupFabric {
    public static Set<Person> groupSet() {
        Set<Person> list = new LinkedHashSet<>();
        list.add(new Teacher("Андрей", 18));
        list.add(new Student("Aлина", 18));
        list.add(new Student("Aнастасия", 18));
        list.add(new Student("Артём", 18));
        list.add(new Student("Никита", 18));
        list.add(new Student("Олег", 18));
        list.add(new Student("Иван", 18));
        list.add(new Student("Кирилл", 18));
        list.add(new Student("Руслан", 18));
        list.add(new Student("Евгений", 18));
        list.add(new Student("Павел", 18));
        list.add(new Student("Руслан", 18));
        list.add(new Student("Александр", 18));
        list.add(new Student("Владимир", 18));
        list.add(new Student("Андрей", 18));

        list.add(new Teacher("Андрей", 18));
        list.add(new Student("Aлина", 18));
        list.add(new Student("Aнастасия", 18));
        list.add(new Student("Артём", 18));
        list.add(new Student("Никита", 18));
        list.add(new Student("Олег", 18));
        list.add(new Student("Иван", 18));
        list.add(new Student("Кирилл", 18));
        list.add(new Student("Руслан", 18));
        list.add(new Student("Евгений", 18));
        list.add(new Student("Павел", 18));
        list.add(new Student("Руслан", 18));
        list.add(new Student("Александр", 18));
        list.add(new Student("Владимир", 18));
        list.add(new Student("Андрей", 18));
        return list;
    }
}
