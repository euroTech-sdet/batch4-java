package com.days.day15;

public class Less20 {
    public static void main(String[] args) {
//        print true if the given non-negative number is 1 or 2 less than a multiple of 20.
//    So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
//
//
//        less20(18) → true
//        less20(19) → true
//        less20(20) → false  20 - 17  6
        int number = 40;
        if (number % 20 < 20 && number % 20 > 17) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }



    }
}
