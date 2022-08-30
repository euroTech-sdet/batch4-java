package com.days.day64;

public class UpperCase {
    public static void main(String[] args) {
        String str = "hi there";//  to make last three letters uppercase
        String lastThree = str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        System.out.println("lastThree = " + lastThree);
        //-------------------------------------------------------------------

    }
}
