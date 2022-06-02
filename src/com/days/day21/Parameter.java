package com.days.day21;

public class Parameter {
    public static void main(String[] args) {
        System.out.println("Main method");
        String person = "Ronaldo";
        int number = 37;
        hello("Ali");
        hello("Veli");
        personAge(person, number);
        personAge("Michael",50);

        System.out.println("end of main method");
    }

    public static void hello(String name) {

        System.out.println("Hello " + name);

    }

    public static void personAge(String a, int age) {// a=ronaldo
        System.out.println(a + " is " + age + " years old");//  ronaldo is 37 years old
        System.out.println("person age");// person age
    }


}
