package com.days.day52;

public class Student {
    String name;
    static String schoolName;
    int schoolNumber;
    static int totalStudentNumber;


    static {
        totalStudentNumber = 100;
        totalStudentNumber++;// 101
        schoolName = "London College";
        System.out.println("static block is being executed");
    }

    //instance block
    {
        schoolNumber = totalStudentNumber++;//101
        System.out.println(" instance block executed , an object is created");
    }

    Student() {
        System.out.println(" constructor executed");
    }

    Student(int a) {

    }

    public static void schoolInfo() {
        System.out.println("schoolName = " + schoolName);
        //  System.out.println("name = " + name);we cant reach any non static variable inside a static method
        // studying(); you cant invoke nonstatic method inside a static method
    }

    public void studying() {
        System.out.println("schoolName = " + schoolName);// static variables can be reached in every method
        // static int a = 10;// we cant create any static variable inside any kind of method
        schoolInfo();// you can invoke a static method inside a nonstatic method
    }

}
