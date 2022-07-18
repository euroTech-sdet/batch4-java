package com.days.day46.EX1;

public class TestSdet {


    public static void main(String[] args) {


        SDET student1 = new SDET("Umit",18, "M","Motorola", 90000);

        System.out.println("student1.salary = " + student1.salary);

        student1.companyChange("BMW");

        System.out.println("student1.company = " + student1.company);

        student1.increaseSalary(11000);

        System.out.println("student1.salary = " + student1.salary);

        System.out.println("student1.isSuccessful = " + student1.isSuccessful);


        System.out.println("\n///////////////////////////\n");


        SDET student2 = new SDET("Alejandro",58, "M","Mercedes", 85000);

        student2.companyChange("Freelancer");

        student2.isSuccessful = false;


        System.out.println("\n///////////////////////////\n");


        SDET student3 = new SDET();
        student3.name = "Malgorzata";
        student3.age  = 35;
        student3.gender = "F";
        student3.company = "Meta";
        student3.salary = 100000;



        System.out.println("\n///////////////////////////\n");


        SDET student4;

//        System.out.println("student4.isSuccessful = " + student4.gender); NOT INIT!!!! comp error
        student4 = new SDET();


    }
}
