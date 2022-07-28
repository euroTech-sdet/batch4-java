package com.days.day51;

public class StudentList {

    public static void main(String[] args) {
        Student student1 = new Student("Curry");
//        System.out.println("student1.name = " + student1.name);
        Student student2 = new Student("Benzema");
//        System.out.println("student2.name = " + student2.name);
//        System.out.println("Student.city = " + Student.city);
//
//        System.out.println("Student.totalStudentNumber = " + Student.totalStudentNumber);
        Student student3 = new Student("Murat");
        System.out.println("Student.totalStudentNumber = " + Student.totalStudentNumber);// 3  3
        System.out.println("student1.studentNumber = " + student1.studentNumber);// 0  1  1
        System.out.println("student2.studentNumber = " + student2.studentNumber);// 0  1  2
        System.out.println("student3.studentNumber = " + student3.studentNumber);// 0  1  3


    }
}
