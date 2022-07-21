package com.days.day48;

public class Person {
    private String name;
    String surname;
    int birthYear;
    char gender;
    private int age;
    boolean univercity;
    String country;



    Person(String name, int birthYear) {
        age = 2022 - birthYear;//    2022- 1990;
    }

    public void eating() {

        System.out.println(name + " is eating.");
    }

    public void reading() {


    }

    public String getName() {

//        System.out.println("name = " + name);

        return name;
    }

    public int getAge() {

        System.out.println("age = " + age);

        return age;
    }


}
