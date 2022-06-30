package com.days.day37;

import java.util.Random;

public class Review {


    public static void main(String[] args) {

        Random random = new Random();

        int randomInt = random.nextInt();

        System.out.println("randomInt = " + randomInt);


        System.out.println("random.nextInt(11) = " + random.nextInt(11));// (inc)0 <= x <11 (exc)


        System.out.println("random.nextDouble() = " + random.nextDouble()); // (inc)0.0 <= x <1.0 (exc)


        //  -1.0 < randomNumber<=0.0
        System.out.println("random.nextDouble()  * -1 = " + random.nextDouble() * -1);


        // generate ~max 20 dijit invoice number randomly , and return it as String!

        System.out.println("20 digit random = " + (Math.abs(random.nextInt() * 4) + "" + (Math.abs(random.nextInt() * 4))));

        String number = 10 + "";


        System.out.println(Math.round(2.5));



    }

    // Create 3 unique dynamic studentIds value 5 digit:  10000 - 100000
    public static void generate3uniqueNo() {
        // random.nextInt(high - min) + min   // high exc!!
        Random random = new Random();
        int num1 = random.nextInt(90000) + 10000;
        int num2;
        int num3;

        do {
            num2 = random.nextInt(90000) + 10000;
            num3 = random.nextInt(90000) + 10000;
        } while (num2 == num1 || num2 == num3 || num1 == num3);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

    }


    //long way with while loop
    public static void studentId() {

        Random value = new Random();
        int num1 = value.nextInt((100000 - 10000) + 10000);
        int num2 = value.nextInt((100000 - 10000) + 10000);

        while (num1 == num2) {
            num2 = value.nextInt((100000 - 10000) + 10000);
        }
        int num3 = value.nextInt((100000 - 10000) + 10000);
        while (num3 == num2 || num3 == num1) {
            num3 = value.nextInt((100000 - 10000) + 10000);

        }

        System.out.println("1. number= " + num1);
        System.out.println("2. number= " + num2);
        System.out.println("3. number= " + num3);
    }

}
