package com.days.day48;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ali", 9);
        String name1 = student1.getName();
        int class1 = student1.getSchoolClass();
        System.out.println("name1 = " + name1);
        System.out.println("class1 = " + class1);
        Student student2 = new Student("Veli", 10);
        Student student3 = new Student("Toby", 7);
//        System.out.println("student1.schoolNumber = " + student1.schoolNumber);
//        System.out.println("student2.schoolNumber = " + student2.schoolNumber);
//        System.out.println("student2.schoolNumber = " + student3.schoolNumber);
//        student1.schoolNumber = 25;
//        System.out.println("student1 = " + student1.schoolNumber);
        student1.getSchoolNumber();
        student2.getSchoolNumber();
        student3.getSchoolNumber();
        Student student4 = new Student("Ronaldo", 3);
        student4.getSchoolNumber();



    }
}
