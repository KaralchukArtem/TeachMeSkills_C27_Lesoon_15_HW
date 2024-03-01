package com.teachmeskills.lesson15.task4;

import com.teachmeskills.lesson15.task4.person.Person;

import java.util.Set;

import static com.teachmeskills.lesson15.task4.fabric.GroupFabric.groupSet;

public class Runner {

    public static void main(String[] args) {

        Set<Person> list = groupSet();

        System.out.println("Group C27 -> ");
        for (Person agr:list) {
            System.out.println(agr);
        }
    }

}
