package com.days.day49;

public class Person {
    String name;
    int birthYear;
    private int age;
    char gender;
    String surname;
    Add ad = new Add();
    private String city = "Munich";

    //    Person() {
//        System.out.println(" an object created from Person class");
//    }


    public String getCity() {
        city = "Oslo";
        System.out.println("city = " + name + " for " + city);
        return city;
    }

    public int getAge() {
        return age;
    }


    Person(String n, int year) {
        this.name = n;
        birthYear = year;
    }

    Person(String n) {

    }


    public void printName() {

        System.out.println(name);

    }

    public void calculateAge() {

        age = ad.calculateAge(birthYear);
    }

    public void print() {
        ad.getSum(20, 30);
    }


    public void anotherGetForCity() {

        System.out.println("city = " + name + " " + city);

    }
}
