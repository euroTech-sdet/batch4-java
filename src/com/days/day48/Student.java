package com.days.day48;

public class Student {
    // name schoolname class schoolNumber

    private String name;
    private int schoolClass;
    private int schoolNumber;
    static String schoolName = "Turkmen High School";
    static int studentCount;// after first registration school count is 1


    Student(String name, int schoolClass) {
        studentCount++;
        this.name = name;
        this.schoolClass = schoolClass;
        schoolNumber = studentCount;
        System.out.println("studentCount = " + studentCount);
    }

    public int getSchoolNumber() {
        System.out.println("schoolNumber  of  " + name +" = "+ schoolNumber);
        return schoolNumber;
    }

    public String getName() {
        return name;

    }

    public int getSchoolClass() {

        return schoolClass;
    }

}
