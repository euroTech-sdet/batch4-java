package com.days.day17;

public class Remainings {
    public static void main(String[] args) {
        // numbers can be divided to 5  without remainings between 1-101
        // if the number can be divided to 5 without remainings print it
        //  1  2  3  4  5  6  7  8  9  10  11

        for (int num = 1; num < 101; num++) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
        }
        for (int num = 5; num < 101; num += 5) {
            System.out.println("num = " + num);

        }



    }
}
