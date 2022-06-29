package com.days.day35;

public class Methods {
    public static void main(String[] args) {
        String str = "Hello Java";
        //            01
        //          10
        String city = new String("London");
        String club = new String();
        club = "Manchester United";
        int lengthOfStr = str.length();// 10
        System.out.println("lengthOfStr = " + lengthOfStr);
        System.out.println(city.length());
        String special = "       ";
        System.out.println("special.length() = " + special.length());
        System.out.println("str.charAt(1) = " + str.charAt(1));
        // Hello Java    length is 10  but last index of this string is 9
        // 0123456789
        System.out.println("str.charAt(9) = " + str.charAt(9));
        System.out.println("club.charAt(0) = " + club.charAt(0));// Manchester United

        String basketClub = "GoldenWarriors";
        //                   01234567890123   last letter index number is 13
        System.out.println("basketClub.length() = " + basketClub.length());// 14

        System.out.println("basketClub.charAt(basketClub.length()-1) = " + basketClub.charAt(basketClub.length() - 1));




    }
}
