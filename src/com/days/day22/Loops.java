package com.days.day22;

public class Loops {
    public static void main(String[] args) {
        calculationByWhileLoop(10, 20);
    }


    public static int calculationByWhileLoop(int a, int b) {// a=10
        int sum = 0;
        while (a < b) {//
            sum += a;

            a++;
        }
        System.out.println(sum);
        return sum;
    }
}
