package com.days.day36;

public class WithoutEnd {
    public static void main(String[] args) {

//        Given a string, return a version without the first and last char,
//        so "Hello" yields "ell". The string length will be at least 2.

//        withoutEnd("Hello") → "ell"
//        withoutEnd("java") → "av"
//        withoutEnd("coding") → "odin"
        String str = "Hello";
        //            01234   length is 5
        System.out.println("str.substring(1,4) = " + str.substring(1, str.length() - 1));
    }
}
