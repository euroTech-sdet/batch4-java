package com.days.day22;

public class Return2 {
    public static void main(String[] args) {
        int num = 30;
        int number = 50;
        printSum(10, 20);
        int result = returnSum(num, number);// value is now 80
        System.out.println("result = " + result);


    }

    public static void printSum(int a, int b) {
        int total = a + b;
        System.out.println(a + b);
        System.out.println("total = " + total);
    }

    public static int returnSum(int a, int b) {
        int total = a + b;// 30+50
        //total is 80
        return total;// 80
    }

}
