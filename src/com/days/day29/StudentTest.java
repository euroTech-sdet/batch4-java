package com.days.day29;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Ronaldo";
        student1.number = 7;
        student1.surname = "Pele";
        student1.birthYear = 2000;
        Student student2 = new Student();
        student2.name = "Stephen";
        student2.surname = "Curry";
        student2.number = 1000;
        student2.birthYear = 1990;

        System.out.println("student1.name = " + student1.name);
        System.out.println("student2.name = " + student2.name);
        student1.studying();
        student2.studying();
        Student.studentMakeSport();
        student1.studentInfo();
        student2.studentInfo();




    }


}
