package com.days.day32;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ScannerString {


    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Please type your full name: ");

        String name = scanner.next(); // take only first string till first space!!
//        String name = scanner.nextLine(); // it will take all chars before press enter
        String surname = scanner.nextLine();
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);


        scanner.close();



    }
}
