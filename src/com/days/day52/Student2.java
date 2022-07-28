package com.days.day52;

import java.util.ArrayList;

public class Student2 {
    String name;
    int studentNumber;
    private double average;

    double mathGrade;
    double literatureGrade;
    double peGrade;
    static ArrayList<String> nameListOfStudents;
    static ArrayList<Double> mathGradesOfAllStudents;
    static ArrayList<Double> averageGradeOfAllStudents;

    static {
        nameListOfStudents = new ArrayList<>();
        mathGradesOfAllStudents = new ArrayList<>();
        averageGradeOfAllStudents = new ArrayList<>();
    }

    Student2(String name) {
        this.name = name;
        nameListOfStudents.add(name);
    }

    public void setGrades(double mathGrade, double litGrade, double peGrade) {
        this.mathGrade = mathGrade;
        this.literatureGrade = litGrade;
        this.peGrade = peGrade;
        mathGradesOfAllStudents.add(mathGrade);
    }


    public double averageGrades() {
        double result = (mathGrade + literatureGrade + peGrade) / 3;
//        return result;
        System.out.println("result = " + result);
        average = result;
        averageGradeOfAllStudents.add(average);
        return (mathGrade + literatureGrade + peGrade) / 3;
    }

    public double getAverage() {
        averageGrades();
        return average;
    }


}
