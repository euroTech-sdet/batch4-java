package com.days.day13;

public class NestedIf {


    public static void main(String[] args) {

        int num = 60;

        // lets print then num can divided to 6 - 2 AND 3
        // while checking this req,
        // also print if number is even and
        // also is number is not multiply of 3

        if ((num % 2 == 0) && (num % 3 == 0)) {
            System.out.println("Number can devided to 6!!");
        }
        System.out.println("//////////////////////////////// \n");

        if (num % 2 == 0) {

            System.out.println("Number is EVEN !!");

            if (num % 3 == 0) {
                System.out.println("Number can devided to 6!!");
            } else {
                System.out.println("Number is even but it is NOT multiply of 3!!");
            }

        } else { // num % 2 != 0
            System.out.println("Number is ODD !!");
        }


        System.out.println("//////////////////////////////// \n");

        System.out.println("MULTI-WAY IF ELSE Statements");

        boolean cond1 = false;
        boolean cond2 = false;
        boolean cond3 = false;
        boolean cond4 = true; // my last COND , so it can handle by ELSE!!

        if (cond1) {
            //sta1
        } else if (cond2) {
            // sta2
        } else if (cond3) {
            // sta3
        } else if (cond4) { // or type only else { // sta4} if there is NO extra cond!!!
            // sta4
        }

        // EX-1
//1 -24 if hours outside of thsi range -- print INVALID DATA!!
        //1 - 5 : early morning
        //6 - 11 : morning
        //12 - 14 : noon
        //15 - 17 : afternoon
        //18 - 19  : evening
        //20 - 24  : night

        int hours = 24;
        String message = "";

        if (hours < 1 || hours > 24) {
            message = "INVALID DATA!!";
        } else if (hours <= 5) {
            message = "early morning";
        } else if (hours <= 11) {
            message = "morning";
        } else if (hours <= 14) {
            message = "noon";
        } else if (hours <= 17) {
            message = "afternoon";
        } else if (hours <= 19) {
            message = "evening";
        } else {  //else if (hours<=24)
            message = "night";
        }

        System.out.println("message = " + message);

        System.out.println("//////////////////////////////// \n");

        // EX-2
//        100 - 90 = A
//        89  - 80 = B
//        79  - 70 = C
//        69  - 60 = D
//        59  - 00 = F


        int note = 41;
        String Note = "";

        if (note < 0 || note > 100){
            System.out.println("Invalid Data");
        } else {

            if (note >= 90) {
                Note = "A";
            } else if (note >= 80) {
                Note = "B";
            } else if (note >= 70) {
                Note = "C";
            } else if (note >= 60) {
                Note = "D";
            } else Note = "F";

            System.out.println("Note = " + Note);

        }



        System.out.println("//////////////////////////////// \n");


        System.out.println("Before  IF");

        if (0>1) System.out.println("number 0 is a big brother!!");
        System.out.println("After IF");

        System.out.println("//////////////////////////////// \n");


        System.out.println("Before  IF");

        if (0>1); System.out.println("number 0 is a big brother!!");
        System.out.println("After IF");


        System.out.println("//////////////////////////////// \n");


        System.out.println("Before  IF");

        if (0>1);
        {
            System.out.println("number 0 is a big brother!!");
        }
        System.out.println("After IF");









    }
}
