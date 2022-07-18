package com.days.day46.EX1;

public class SDET {

    String name;
    int age;
    String gender;
    String company;
    double salary;
    boolean isSuccessful;

    public SDET (){

    }

    public SDET(String name, int age, String gender, String company, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.salary = salary;
        this.isSuccessful = true;
    }

    public void increaseSalary(double raiseAmount){
        this.salary += raiseAmount;
    }

    public void companyChange(String newCompany){
        this.company = newCompany;
    }
}
