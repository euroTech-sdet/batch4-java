package com.days.day35;

public class SubString {
    public static void main(String[] args) {
        String city = "Oslo";
        //             0123
        System.out.println("city.length() = " + city.length());
        System.out.println("city.charAt(0) = " + city.charAt(0));
        System.out.println("city.substring(1,3) = " + city.substring(1, 3));
        System.out.println("city.substring(0,2) = " + city.substring(0, 2));// from 0 to 2 doesnt include 2 Os
        String nba = "Toronto Raptors";
        System.out.println("nba.substring(6) = " + nba.substring(8));
        System.out.println("nba.length() = " + nba.length());
        System.out.println("nba.substring(8,15) = " + nba.substring(8, 15));
        System.out.println("nba.substring(0,8) = " + nba.substring(0, 8));
        // oslo  olso      spain     niaps    Ali   ilA  Faruk kuraF


    }
}
