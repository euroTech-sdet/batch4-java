package com.days.day24;

public class Addition {
    public static void main(String[] args) {
        sum(10, 2);
        sum(10.0, 20);
        sum(10, 20.0);
        sum(10, 20, 30);



    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(double a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, double b) {
        System.out.println(a + b);
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b);
    }


}
