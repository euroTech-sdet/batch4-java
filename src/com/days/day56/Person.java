package com.days.day56;

public class Person {
    // for public access modifier

    public String name;
    public static String city = "London";


    public Person(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name of the person is =" + name);
    }

    public static void printCity() {
        System.out.println("city = " + city);
    }

}
