package com.days.day64;

public class FrontTimes {
    //    Given a string and a non-negative int n,
//    we'll say that the front of the string is the first 3 chars,
//    or whatever is there if the string is less than length 3. Return n copies of the front;
//
//
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Abc", 3) → "AbcAbcAbc"
    public static void main(String[] args) {
        frontTimes("Chocolate", 2);
        frontTimes("Chocolate", 3);
        frontTimes("Abc", 3);
    }

    public static String frontTimes(String str, int n) {
        String front = "";
        if (str.equals("")) {

        } else if (str.length() < n && str.length() > 0) {
            for (int i = 0; i < n; i++) {
                front = front + str;
            }
        } else if (str.length() >= n) {
            for (int i = 0; i < n; i++) {
                front = front + str.substring(0, 3);
            }

        }
        System.out.println("front = " + front);
        return front;
    }
}
