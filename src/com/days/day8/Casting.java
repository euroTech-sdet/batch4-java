package com.days.day8;

public class Casting {

    public static void main(String[] args) {


        double rateA= 1;   // double <- int

        System.out.println("rateA = " + rateA);

//        int number = 1.0; // int <- double


        short numShort =  100;

     //   float numFloat = 13.5; // it can not implicitly casting!!!
        float numFloat = numShort; // it can implicitly casting!!!
        numFloat= 100;// it can implicitly casting!!!

        System.out.println("numShort = " + numShort);  //100

        System.out.println("numFloat = " + numFloat); //100.0


        byte testByte = 12;

        long num = 1;


        //////////////////////////////////////////////////////

        // Exp Casting

        double numD = 10;
        int numInt;

        numInt = (int) (numD + 10.0); // be careful while using () !!! double+ double will return double!!!
        numInt = (int) numD + (int)10.0;

        int num2= (int)10.9999999;

        System.out.println("num2 = " + num2); //10!!!!

        double num3 = (int)10.3;  //10.0

        char plusOperator = '+';

        System.out.println("plusOperator = " + (int)plusOperator);

        char plus = 43; //sample of imp casting!!


       // int testValue = (double)1; // 1 --> 1.0  ERROR!!!!
        // casting type should be same or less !!!

        byte num4 = (byte) 128; // -128 -- 127  !!!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.println("num4 = " + num4);



        // Casting on expressions

        short a= 1;
        short b= 2;
//        short c = a+b;  IT GIVES ERROR !!!!
        short c2 = (short) (a+b);
        // short c3 = (short) a + (short)b; FAIL!!







    }
}
