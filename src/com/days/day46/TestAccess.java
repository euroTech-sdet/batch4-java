package com.days.day46;

import com.days.day47.Student;

public class TestAccess {


    public static void main(String[] args) {


        Student st1 = new Student(1001);

        st1.studentId = 1;

        System.out.println("Student.totalStudent = " + Student.totalStudent);

    }
}
