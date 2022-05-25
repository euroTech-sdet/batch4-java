package com.days.day18;

public class Remaining {
    public static void main(String[] args) {
        // we will find the numbers between 1 - 100
        // divided by 4 without remaining
// 1  2  3  4  5  6  7  8  9 10 .......
        int lastPoint = 500;
        int divident = 7;
        int total = lastPoint / divident;
        int count = 0;
        int i;
        for (i = 1; i <= lastPoint; i++) {//  500-1 499
            if (i % divident == 0) {
                // count++;
                System.out.println(i + " can be divided to " + divident + " without remaining.");
            }
            count++;
        }
        if (i == count) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println("i = " + i);  // will be 501
        System.out.println("total = " + total);
        System.out.println("count = " + count);

    }
}
