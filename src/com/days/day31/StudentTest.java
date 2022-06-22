package com.days.day31;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Ali";
        student1.classYear = 11;
        student1.literatureGrade = 90.0;
        student1.mathGrade = 95.6;
        student1.scienceGrade = 88.9;
        student1.birthYear = 2006;
        student1.number = 200;
        Student student2 = new Student();
        student2.name = "Michael";
        student2.literatureGrade = 88.0;
        student2.mathGrade = 98.6;
        student2.scienceGrade = 60.9;
        student2.birthYear = 2004;
        student2.number = 500;
        student2.classYear = 13;
        Student student3 = new Student();
        student3.name = "Ronaldo";
        student3.literatureGrade = 66.0;
        student3.mathGrade = 33.6;
        student3.scienceGrade = 77.9;
        student3.birthYear = 2000;
        student3.number = 700;
        student3.classYear = 12;
        student1.name = "Veli";

        student1.studentInfo();
        student2.studentInfo();
        student3.studentInfo();

        student1.gradeAverage();
        student2.gradeAverage();
        student3.gradeAverage();



    }
}
