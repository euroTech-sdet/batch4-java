package com.days.day60;

public class MinCat {
//    Given two strings, append them together (known as "concatenation") and return the result.
//    However, if the strings are different lengths, omit chars from the longer string so it is the
//    same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
//
//
//    minCat("Hello", "Hi") → "loHi"
//    minCat("Hello", "java") → "ellojava"
//    minCat("java", "Hello") → "javaello"

    public static void main(String[] args) {
        minCat("Hello", "Hi");
        minCat("Hello", "java");
        minCat("java", "Hello");
    }

    public static String minCat(String a, String b) {
        String combined = "";
        int n1 = a.length();
        int n2 = b.length();
        if (a.length() > b.length()) {
            combined = a.substring(n1 - n2) + b;
        } else {
            combined = a + b.substring(n2 - n1);
        }
        System.out.println("combined = " + combined);
        return combined;
    }
}
