package com.days.day22;

public class LoopsMethod {
    public static void main(String[] args) {
        // if i want to get sum of the value between 0 and 100
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println("sum = " + sum);
        getSum();
        getSumBetween(200, 500);
        getSumBetween(1000, 1500);
        getSumBetween(10, 50);
        boolean compare = compareResult(50, 80);
        System.out.println("compare = " + compare);
    }
    public static boolean compareResult(int a, int b) {// a=50  b=80
        int sum = getSumBetweenByDoWhile(a, b);
        int sum1 = getSumBetween(a, b);
        boolean result = false;
        if (sum == sum1) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static int getSumBetween(int a, int b) {// a=200   b=500
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println("sum  of the numbers between  " + a + " and " + b + " = " + sum);
        return sum;
    }

    public static int getSumBetweenByDoWhile(int a, int b) {
        int sum = 0;
        do {

            sum = sum + a;
            a++;

        } while (a <= b);
        return sum;
    }

    public static void getSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }




}
