package com.days.day36;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // how can we reverse the string Ali ilA
        System.out.println("" + 'A' + 'A');// Ascii 65  130
        String str = "London";
        //            012345
        str.length();
        System.out.println("str.charAt(0) = " + str.charAt(0));//  L
        System.out.println("str.length() = " + str.length());
        String reversed = "";
        str = "Oslo";
        Scanner scan = new Scanner(System.in);
        System.out.println("pls give me a string that you want to make reversed");
        str = scan.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {

            reversed = reversed + str.charAt(i);

            System.out.println("str.charAt(i) = " + str.charAt(i));// L o n d o n

        }
        System.out.println("reversed = " + reversed);


        ReverseString reverse = new ReverseString();
        reverse.reverseString("Golden State");
        reverse.reverseString("Barcelona");

    }


    public String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("reversed = " + reversed);
        return reversed;
    }


}
