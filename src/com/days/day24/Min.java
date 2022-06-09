package com.days.day24;

public class Min {
    public static void main(String[] args) {
//        int result = min(10, 20);
//        System.out.println("result = " + result);
        find(100, 200);
        find(500, 300);
    }

    // create 4 methods name of min
    // get 2 argument int, double,long, float
    // return the smaller one
    // call from main method
    public static int max(int a, int b) {
        int num;
        if (a > b) {
            num = a;
        } else {
            num = b;
        }
        System.out.println(b + " is bigger number ");
        return num;
    }

    public static void find(int a, int b) {
        min(a, b);
        max(a, b);
    }

    public static long min(long a, long b) {
        long num;
        if (a < b) {
            num = a;
        } else {
            num = b;
        }
        return num;
    }

    public static float min(float a, float b) {
        float num;
        if (a < b) {
            num = a;
        } else {
            num = b;
        }
        return num;

    }

    public static double min(double a, double b) {
        double num;
        if (a < b) {
            num = a;
        } else {
            num = b;
        }
        return num;
    }

    public static int min(int a, int b) {
        int num;
        if (a < b) {
            num = a;
        } else {
            num = b;
        }
        System.out.println("smaller number is = " + num);
        return num;
    }

}
