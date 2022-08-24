package com.days.day60;

public class ExtraFront {

//    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
//    The string may be any length. If there are fewer than 2 chars, use whatever is there.
//
//
//    extraFront("Hello") → "HeHeHe"
//    extraFront("ab") → "ababab"
//    extraFront("H") → "HHH"

    public static void main(String[] args) {
        extraFront("Hello");
        extraFront("ab");
        extraFront("H");
    }

    public static String extraFront(String str) {
        String combined = "";
        if (str.length() < 2) {
            combined = str + str + str;
        } else {
            combined = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
        System.out.println("combined = " + combined);
        return combined;
    }


}

