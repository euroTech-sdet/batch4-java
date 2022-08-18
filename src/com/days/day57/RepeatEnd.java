package com.days.day57;

public class RepeatEnd {

    //    Given a string and an int n, return a string
//    made of n repetitions of the last n characters of the string.
//    You may assume that n is between 0 and the length of the string, inclusive.//
//
//    repeatEnd("Hello", 3) → "llollollo"
//    repeatEnd("Hello", 2) → "lolo"
//    repeatEnd("Hello", 1) → "o"
    public static void main(String[] args) {
//        String str = "Hello";
//        System.out.println("str.substring(3) = " + str.substring(str.length() - 3));

        repeatEnd("Hello", 3);
        repeatEnd("Hello", 2);
        repeatEnd("Hello", 1);
    }


    public static String repeatEnd(String str, int n) {
        String word = "";
        for (int i = 0; i < n; i++) {
            word = word + str.substring(str.length() - n);
        }
        System.out.println("word = " + word);
        return word;
    }

}
