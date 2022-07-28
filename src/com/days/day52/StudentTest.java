package com.days.day52;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    public static void main(String[] args) {
        Student2 david = new Student2("David");
        Student2 ronaldo = new Student2("Ronaldo");
        david.peGrade = 90;
        david.literatureGrade = 60;
        david.mathGrade = 60;
        ronaldo.peGrade = 100;
        ronaldo.mathGrade = 20;
        ronaldo.literatureGrade = 60;
        david.averageGrades();
        //double resultRon = ronaldo.averageGrades();
        System.out.println("ronaldo.getAverage() = " + ronaldo.getAverage());
        Student2 michael = new Student2("Michael");
        Student2 stephen = new Student2("Stephen");
        Student2 kobe = new Student2("Kobe");
        System.out.println("Student2.nameListOfStudents = " + Student2.nameListOfStudents);
        michael.setGrades(30, 40, 60);
        kobe.setGrades(50, 60, 70);
        stephen.setGrades(70, 80, 90);
        System.out.println("Student2.mathGradesOfAllStudents = " + Student2.mathGradesOfAllStudents);
        ArrayList<Student2> studentList = new ArrayList<>(Arrays.asList(ronaldo, michael, stephen, kobe));
        studentList.add(david);
        System.out.println("studentList.size() = " + studentList.size());
        System.out.println("studentList.get(0).getAverage() = " + studentList.get(0).getAverage());
        System.out.println("ronaldo.getAverage() = " + ronaldo.getAverage());
        System.out.println("studentList.get(1).name = " + studentList.get(1).name);
        School londonSchool = new School(studentList);
        londonSchool.studentInfo();

    }
}
