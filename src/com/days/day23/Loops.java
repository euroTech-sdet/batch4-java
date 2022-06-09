package com.days.day23;

public class Loops {
    public static void main(String[] args) {
        // let get sum of the numbers between 0-100
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
        int sum1 = sumOfThe(50, 100);
        int sum2 = sumOfThe(200, 300);

        System.out.println(sum1 > sum2);

    }
    // create a method print sum in it make dynamic


    public static int sumOfThe(int a, int b) {// 200 300
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        return sum;
    }
}
