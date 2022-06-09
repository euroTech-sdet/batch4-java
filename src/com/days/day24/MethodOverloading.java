package com.days.day24;

public class MethodOverloading {
    public static void main(String[] args) {
        sumOfNumbers(10, 20);
        sumOfNumbers(110.0, 20.0);// double double
        sumOfNumbers(10);
        sumOfNumbers(40, 50);
        age(40, "Ali");
        age("Veli", 50);
        sumOfNumbers(10,20,30);
        // name must be same
        // parametrs count must be different
        // parameter types must be different
        // sequjence of the parameters must be different
    }


    static int sumOfNumbers(int a) {

        return a;
    }

    public static void sumOfNumbers(double a) {


    }

    public static void sumOfNumbers(int a, int b) {

        System.out.println(a + b);

    }

    public static void sumOfNumbers(int a, int b, int c) {

        System.out.println(a + b + c);

    }


    public static void sumOfNumbers(double a, double b) {

        System.out.println(a + b);

    }

    public static void age(int num, String name) {

        System.out.println(name + num + " years old ");


    }

    public static void age(String name, int num) {

        System.out.println(name + num + " years old ");

    }


}
