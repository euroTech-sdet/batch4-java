package com.days.day30;

public class Student {
    String name;
    int number;
    int classYear;
    int birthYear;
    double mathGrade;
    double scienceGrade;
    double literatureGrade;
    static int studentsCount;// how many student are there in a school?
    int numbers;


    Student() {
        studentsCount++;
        numbers++;
        numbers++;
        System.out.println(" a student was registered.");
        System.out.println("school has  " + studentsCount + " student.");
        System.out.println("numbers = " + numbers);
    }

    public void studentInfo() {

        System.out.println(name + " is attending year  " + classYear + " " + name + " 's number is = " + number);
    }


    public void gradeAverage() {
        double average = (mathGrade + scienceGrade + literatureGrade) / 3;
        System.out.println(name + " grade average is " + average);

    }


}
