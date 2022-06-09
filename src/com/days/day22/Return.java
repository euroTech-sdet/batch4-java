package com.days.day22;

public class Return {
    public static void main(String[] args) {
        int number = 20;
        System.out.println("main method");
        sum(number, 100);
        sum(50, number);
        System.out.println("after method");
        numbers(number);// we pass the value of the number
        System.out.println("number in the main method= " + number);

    }

    public static void sum(int a, int b) {  // signature this whole line name is header
        //public is an  access modifier
        // body
        System.out.println("hello world");
        System.out.println("a = " + a);

    }

    public static void numbers(int number) {
        number = 100;
        System.out.println("number in the method = " + number);


    }


}
