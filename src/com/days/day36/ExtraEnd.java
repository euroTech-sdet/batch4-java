package com.days.day36;

public class ExtraEnd {
    public static void main(String[] args) {
//        Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
//                The string length will be at least 2.
//        extraEnd("Hello") → "lololo"
//        extraEnd("ab") → "ababab"
//        extraEnd("Hi") → "HiHiHi"
        String str = "Hello JAva we are here ready for challenge";
        //            01234

        System.out.println("str.length() = " + str.length());
//        System.out.println("str.substring(3) = " + str.substring(3));
        System.out.println("str.substring(str.length()-2) = " + str.substring(str.length() - 2));
        String sub = str.substring(str.length() - 2);
        System.out.println("sub+sub+sub = " + sub + sub + sub);
        System.out.println("str.substring(0,2) = " + str.substring(0, 2));

    }

    public String lastTwo(String str) {

        String s = str.substring(str.length() - 2);
        return s + s + s;
    }
}
