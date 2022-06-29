package com.days.day36;

public class NonStart {
    public static void main(String[] args) {

//        Given 2 strings, return their concatenation,
//        except omit the first char of each. The strings will be at least length 1.
//
//
//        nonStart("Hello", "There") → "ellohere"
//        nonStart("java", "code") → "avaode"
//        nonStart("shotl", "java") → "hotlava"
        String a = "Hello";
        String b = "There";
        System.out.println("a.substring(1) = " + a.substring(1));
        System.out.println("b.substring(1) = " + b.substring(1));
        String substring = a.substring(1);
        String substring1 = b.substring(1);
        System.out.println("substring.concat(substring1) = " + substring.concat(substring1));


    }
}
