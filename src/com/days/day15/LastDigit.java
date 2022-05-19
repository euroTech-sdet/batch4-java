package com.days.day15;

public class LastDigit {
    public static void main(String[] args) {// 1 solution
        int number = 18;
        int num = 28;
        boolean result;
        if (number % 10 == num % 10) {
            result = true;
            System.out.println(true);
        } else {
            result = false;
            System.out.println(false);
        }
        System.out.println("result = " + result);


        System.out.println(number % 10 == num % 10);// second solution
        boolean b=number % 10 == num % 10;// third solution
        System.out.println("b = " + b);
    }
}
