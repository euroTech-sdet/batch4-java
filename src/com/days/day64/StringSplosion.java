package com.days.day64;



public class StringSplosion {

//    Given a non-empty string like "Code" return a string like "CCoCodCode".

//    stringSplosion("Code") → "CCoCodCode"
//                                                      C
//                                                      Co
//                                                      Cod
//                                                      Code
//    stringSplosion("abc") → "aababc"
//    stringSplosion("ab") → "aab"

    public static void main(String[] args) {
        String str = "Code";
        String splosion = "";
        for (int i = 0; i < str.length(); i++) {
            for (int l = 0; l <= i; l++) {
                splosion = splosion + str.charAt(l);
            }
        }
        System.out.println("splosion = " + splosion);

        String ab = "";
        for (int i = 0; i < str.length(); i++) {
            ab = ab + str.substring(0, i + 1);
        }
        System.out.println("ab = " + ab);
    }
}
