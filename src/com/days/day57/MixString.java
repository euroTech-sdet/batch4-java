package com.days.day57;

public class MixString {

    //    Given two strings, a and b, create a bigger string made of the first
//    char of a, the first char of b, the second char of a, the second char of b,
//    and so on. Any leftover chars go at the end of the result.//
//
//    mixString("abc", "xyz") → "axbycz"
//    mixString("Hi", "There") → "HTihere"
//    mixString("xxxx", "There") → "xTxhxexre"
    public static void main(String[] args) {
        MixString obj = new MixString();

        obj.mixString("abcd", "xyz");
        obj.mixString("123", "123");
        obj.mixString("xxx", "There");// ere
    }


    public String mixString(String a, String b) {
        String mixStr = "";
        int num = Math.min(a.length(), b.length());
        for (int i = 0; i < num; i++) {
            mixStr = mixStr + a.charAt(i) + b.charAt(i);
        }
        if (a.length() > b.length()) {
            mixStr = mixStr + a.substring(b.length());
        } else {
            mixStr = mixStr + b.substring(a.length());
        }
        System.out.println("mixStr = " + mixStr);
        return mixStr;
    }


}
