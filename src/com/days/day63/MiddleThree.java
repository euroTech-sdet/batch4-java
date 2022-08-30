package com.days.day63;

public class MiddleThree {
    //    Given a string of odd length, return the string length 3 from its middle,
//    so "Candy" yields "and". The string length will be at least 3.
//
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"
//    middleThree("XabcxyzabcX") → "xyz"
    public static void main(String[] args) {
        middleThree("XabcxyzabcX");
        middleThree("solving");
        middleThree("o");
    }

    public static String middleThree(String str) {
        String middle = "";
        if (str.length() > 2) {
            middle = str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
            System.out.println("middle = " + middle);
        } else {
            middle = str;
        }
        return middle;
    }


}
