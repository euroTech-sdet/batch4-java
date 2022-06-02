package com.days.day21;

public class Methods3 {
    public static void main(String[] args) {
        System.out.println("i am in the main method");
        method3();


        //i am in the main method
        //method3
        //method2
        //method1

    }

    public static void method1() {
        method2();
        System.out.println("method1");

    }
    public static void method2() {

        System.out.println("method2");
    }
    public static void method3() {

        System.out.println("method3");

        method1();

    }

}
