package com.days.day11;

public class ReviewCast {


    public static void main(String[] args) {


        String number = "1";

        int number2 = 3;

        System.out.println(number + 2);

        System.out.println(number2 / 2); //1.5  --> 1

        ///


        double rate1 = 20;

        System.out.println("rate1 = " + rate1); //20.0

        byte num1 = 100; //byte range is cover this value so can handle implicitly !!

        System.out.println(num1);


        ////

        int num2 = (int) 128.0;
        int num3 = (byte) 128.0;
        int num4 = (short) 128.0;
//        int num5 = (long) 128.0; ERROR!!


        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);


        // Type Promotion in Expressions

        byte b1 = 2;
        short s1 = 3;

        short s2 = 2 + 3;
        short s3 = (short)(b1 + s1);

        




    }
}
