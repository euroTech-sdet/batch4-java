package com.days.day30;

public class Student {
    String name;// instant variable
    String surname;
    int number;
    int birthYear;
    static String schoolName = "London College";

    public void studying() {

        System.out.println(name + " student is studying");

    }

    public void sleeping() {
        System.out.println("number = " + number);
        System.out.println("name = " + name);
    }

    public static void studentMakeSport() {
        System.out.println("schoolName = " + schoolName);
        //cant reach instance variables inside a static method
    }

    public void studentInfo(){
        System.out.println("Student info ");
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println( name +" "+ surname+ " number = " + number);
    }
}
