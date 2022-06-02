package com.days.day21;

public class Parameters2 {


    public static void main(String[] args) {

//        printBiggerNumber(10, 20);
//        printBiggerNumber(100, 120);
        int number = findBiggerNumber(50, 60);
        System.out.println("number = " + number);

    }
    //  printNumber
    // you will create a method there will 1 integer parameter
    // inside the body you will print this integer value
    // you will call this method 2 times from main method

    public static void printBiggerNumber(int num, int number) {
        if (num > number) {
            System.out.println(num + " is bigger number than " + number);
        } else {
            System.out.println(number + " is bigger number " + num);
        }
    }

    public static int findBiggerNumber(int a, int b) {
        int biggerNumber;
        if (a > b) {
            biggerNumber = a;
        } else {
            biggerNumber = b;
        }

        System.out.println("biggerNumber = " + biggerNumber);
        return biggerNumber;
    }


}
