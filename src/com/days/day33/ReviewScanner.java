package com.days.day33;

import com.days.day22.Breaks;

import java.util.Scanner;


public class ReviewScanner {

//Breaks obje1= new Breaks();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name surname and id number: ");

//        String name = scanner.next();
//        String surname = scanner.next();

        String groupNumber = scanner.next();

        String nameSurname = scanner.nextLine();

        String natio = scanner.next();

        int idNumber = scanner.nextInt();

//        System.out.println("name = " + name);
//        System.out.println("surname = " + surname);
        System.out.println("groupNumber = " + groupNumber);
        System.out.println("nameSurname = " + nameSurname);
        System.out.println("natio = " + natio);
        System.out.println("idNumber = " + idNumber);




    }

}
