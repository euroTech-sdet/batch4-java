package com.days.day50;

public class Persontest {
    public static void main(String[] args) {
        Person per1 = new Person();
        per1.city = "Oslo";
        per1.setName("David");
        String per1Name = per1.getName();
        System.out.println("per1Name = " + per1Name);
        Person per2 = new Person();
        per2.setBirthYear(2000);
        per2.setName("Ronaldo");
        System.out.println("per2.getName() = " + per2.getName());
        System.out.println("per2.getBirthYear() = " + per2.getBirthYear());


    }
}
