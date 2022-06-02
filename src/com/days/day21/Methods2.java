package com.days.day21;

public class Methods2 {
    public static void main(String[] args) {
// first destination of the jvm
        System.out.println("I am in the main method");
        method1();
        method1();
        System.out.println("after the method");
        method3();
        System.out.println("main method again");
        method2();

    }


    public static void method1() {
// method body
        System.out.println("Method 1 is called");

    }

    public static void method2() {

        System.out.println("method 2 is called ");

    }

    public static void method3() {


        System.out.println("method 3 is called");

    }


}
