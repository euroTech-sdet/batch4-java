package com.days.day26;

public class GeneralReview_1 {


    public static void main(String[] args) {


        int number = 3;

        String str = number + "" + true;

        System.out.println(str);  // "3"


        String input = "1A23$%^cdA";


        char keyword = 'A';

        System.out.println(keyword + 1); // 66  Data Type conv for expressions!!
        System.out.println(keyword); // A


//        -------

        double dbl = 3.99;

        System.out.println((int) dbl); // 3


        int number1 = 1;

        double number1dbl = 1;

        System.out.println("number1==number1dbl : " + (number1 == number1dbl));


        byte b1= 2;
        byte b2= 3;

        byte b3= 126 + 1;

       // byte b4= 128; //128 is out of byte range!!

      //  byte b5 = b1 + b2; //int -> type promotion in expression!!!
    }


}
