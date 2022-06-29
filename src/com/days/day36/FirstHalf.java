package com.days.day36;

public class FirstHalf {
    public static void main(String[] args) {

//        Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

//         firstHalf("WooHoo") → "Woo"
//        firstHalf("HelloThere") → "Hello"
//        firstHalf("abcdef") → "abc"
        String str = "HelloThere";
        //            012345  length is 6
        System.out.println("str.substring(0,3) = " + str.substring(0, str.length() / 2));


    }
}
