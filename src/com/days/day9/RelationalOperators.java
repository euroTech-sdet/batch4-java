package com.days.day9;

public class RelationalOperators {
    public static void main(String[] args) {
        int num = 20;
        int num1 = 25;
        System.out.println(num == num1);// whether num is equal to num1 or not ,
        // and returns false , gives boolean value
        // == used for primitive types will not use
        boolean result = true;
        boolean result2 = false;
        System.out.println(result == result2);
        double num3 = 5.5;
        double num4 = 6.6;
        System.out.println("num3==num4 = " + (num3 == num4));
        System.out.println(num3 != num4);// num3 is not equals num4
        System.out.println("result !=result2 = " + (result != result2));//   ! =   result is not equal to result2

        System.out.println("num>num1 = " + (num > num1));// asking num is greater than num1 so result is false
        System.out.println(num < num1);// will return true
        int value = 100;
        int value2 = 100;
        int num5 = 600;
        //    System.out.println("hello" >= "hello2"); this is not appliacable
        System.out.println("value>=value2 = " + (value >= value2));// return true
        System.out.println("value<=num5 = " + (value <= num5));// true


    }
}
