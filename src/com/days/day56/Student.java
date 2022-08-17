package com.days.day56;

public class Student {
    // for private access modifier
    private int studentNumber;
    private static String schoolName = "Yale Univercity";

//    private Student() {
// if we make constructor private then not possible to generate any object from that class.
//    }

    private void printNumber() {
        System.out.println("studentNumber = " + studentNumber);
    }

    private static void printSchoolName() {
        System.out.println("schoolName = " + schoolName);

    }
}
