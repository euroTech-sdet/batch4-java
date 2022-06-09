package com.days.day24;

public class OverLoading {
    public static void main(String[] args) {
        // create 3 methods get the average of the numbers
        // 3 arguments types int,double, long
        // return the averages of the numbers
        // call from main method and print
        // names same
        long a = 1000;
        long b = 2000;
        long c = 3000;

        averageNumbers(10, 20, 30);
        averageNumbers(20, 30, 40);
        averageNumbers(20.0, 30.0, 40.0);
        averageNumbers(a, b, c);
    }

    public static int averageNumbers(int a, int b, int c) {

        int average = (a + b + c) / 2;
        //  return (a + b + c) / 2;
        System.out.println("average = " + average);
        return average;
    }

    public static double averageNumbers(double a, double b, double c) {

        double average = (a + b + c) / 2;
        //  return (a + b + c) / 2;
        System.out.println("average = " + average);
        return average;
    }

    public static long averageNumbers(long a, long b, long c) {

        long average = (a + b + c) / 2;
        //  return (a + b + c) / 2;
        System.out.println("average = " + average);
        return average;
    }


}
