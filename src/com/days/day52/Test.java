package com.days.day52;

public class Test {

    public static void main(String[] args) {
        Student student1 = new Student();
        // static block only 1 time
        // instance block
        // constructor
        Student student2 = new Student();
        //  instance block
        //  constructor
        Student student3 = new Student();
        // instance block
        // constructor
        System.out.println("student1.schoolNumber = " + student1.schoolNumber);
        System.out.println("student3.schoolNumber = " + student3.schoolNumber);

    }
}
