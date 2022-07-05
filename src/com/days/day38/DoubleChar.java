package com.days.day38;

public class DoubleChar {
    public static void main(String[] args) {

//        Given a string, return a string where for
//        every char in the original, there are two chars.
//
//
//                doubleChar("The") → "TThhee"
//        doubleChar("AAbb") → "AAAAbbbb"
//        doubleChar("Hi-There") → "HHii--TThheerree"
        String str = "The";
        str.charAt(1);
        String dblChar = "";
        for (int i = 0; i < 3; i++) {
            dblChar = dblChar + str.charAt(i) + str.substring(i, (i + 1));
            //                     str.charAt(0) + str.subString(0,1)

        }
        System.out.println("newStr = " + dblChar);

    }

}
