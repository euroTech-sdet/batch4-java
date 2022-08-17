package com.days.day56;

public class Employee {
    //for protected access modifier

    protected String name;
    protected static String city = "Munich";

    public Employee(String name) {
        this.name = name;
    }


    protected void printName() {
        System.out.println("name of the employer= " + name);
    }

    protected static void printCity() {
        System.out.println("city = " + city);
    }

}
