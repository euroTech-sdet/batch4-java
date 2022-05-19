package com.days.day15;

public class More20 {
    public static void main(String[] args) {
//
//        print true if the given non - negative number is 1 or 2 more than a multiple of 20.
//        See also:Introduction to Mod
//
//
//        more20(20) →false
//        more20(21) →true
//        more20(22) →true

        int number = 20;
        if (number % 20 > 0 && number % 20 < 3) { //    number%20==1||number%20==2
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
