package com.days.day60;

import java.time.LocalDateTime;

public class Person {

    String name;
    int birthYear;
    int age;

    Person(String name, int year) {
        this.name = name;
        this.birthYear = year;
        LocalDateTime time = LocalDateTime.now();
        age = time.getYear() - year;
    }

    public void sleeping() {
        System.out.println(name + " sleeping.");
    }


    //  staff  abstract
    //  acamician assistant lecturer


}
