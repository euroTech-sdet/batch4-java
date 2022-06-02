package com.days.day21;

public class Operators {
    public static void main(String[] args) {

        mod3(100);
        mod3(5);
      int number=  returnMod3(50);
        System.out.println("number = " + number);
    }

    public static void mod3(int number) {// number=100

        System.out.println(number % 3);// number%3

    }
    public static int returnMod3(int num) {
        int modThree = num % 3;
        return modThree;
    }
}
