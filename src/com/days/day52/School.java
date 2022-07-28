package com.days.day52;

import java.util.ArrayList;

public class School {
    ArrayList<Student2> listofStudents = new ArrayList<>();

    School(ArrayList<Student2> listOfStudnts) {
        this.listofStudents = listOfStudnts;
        System.out.println("listOfStudnts.get(0).literatureGrade = " + listOfStudnts.get(0).literatureGrade);
    }

    public void studentInfo() {
        for (Student2 student : listofStudents) {
            System.out.println("student.name = " + student.name);
        }
    }


}
