package com.days.day25;

public class ReturnMethodsReview {


    public static void main(String[] args) {

        System.out.println(sum(5, 4));


        double sum = sum(5, 4);
        System.out.println("sum = " + sum);
    }


    public static double sum(double num1, double num2) {

//        double sum = num1 + num2;
//        return sum;
        return num1 + num2;  // Good practice!!!
    }
}
