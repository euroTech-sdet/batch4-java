package com.days.day22;

public class LocalVariables {


    public static void main(String[] args) {
        int a = 20;
        numbers(a);
        numbers2();
        int number = 1;
        numbers(number);
        System.out.println("number int he main method  = " + number);

    }

    public static void numbers(int a) {// a and number are local variables
        System.out.println("a = " + a);
        int number = 100;
        System.out.println("number in the numbers method"+number);
    }

    public static void numbers2() {// number is local variable
        int number = 500;
        System.out.println("number in the numbers2 method  = " + number);
    }
}
