package com.days.day15;

public class NearTen {
    public static void main(String[] args) {

//        Given a non-negative number "num", print true if num is within 2 of a multiple of 10.
//    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
//
//
//        nearTen(12) → true
//        nearTen(17) → false
//        nearTen(19) → true
        int number = 19;

//        8 9   11 12
//        18 19  21 22

        if (number % 10 == 1 || number % 10 == 2 || number % 10 == 8 || number % 10 == 9) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }


    }
}
