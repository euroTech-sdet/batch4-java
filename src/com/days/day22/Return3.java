package com.days.day22;

public class Return3 {
    public static void main(String[] args) {
        int number = 10;
        int number2 = 20;
        System.out.println(checkLastDigit(number, number2));// what type of value yhis line has?

        boolean result = checkLastDigit(12, 13);
        System.out.println("result = " + result);
    }

    // i will check last digits of 2 numbers
    // if last digits are equals eachother i will return true
    // otherwise i will return false

    public static boolean checkLastDigit(int a, int b) {
        boolean value;
        if (a % 10 == b % 10) {
            value = true;
        } else {
            value = false;
        }
        return value;
    }


}
