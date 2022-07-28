package com.days.day51;

public class Student {

    int age;//      Student student1=new Student(); student1.age=20; student1.name="Ronaldo"   student1 is 20 years old
    String name;
    static String city = "Munich";
    int studentNumber;
    static int totalStudentNumber;


    Student(String n) {
        System.out.println("studentNumber  before increment= " + studentNumber);
        studentNumber++;
        System.out.println("studentNumber = " + studentNumber);
        totalStudentNumber++;
        System.out.println("totalStudentNumber = " + totalStudentNumber);
        this.name = n;
        studentNumber = totalStudentNumber;
    }

    public void playing(String game) {
        System.out.println();

    }

    public void sleeping() {


    }

    void studying() {

    }

}
