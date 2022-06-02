package com.days.day19;

import com.days.day21.Methods;

public class WhileLoops {

    public static void main(String[] args) {

//        int number1 = 1;
//
//        // Goal: I need to print numbers between 1 to 10
//        while (number1< 10){
//            System.out.println("Inside loop first lane " + (number1<10));
//            System.out.println("Number1 = " + number1);
//            number1 ++; // number1= number1 + 1;
//            System.out.println("Inside loop LAST lane " + (number1<10));
//        }
//
//        System.out.println("Outside of loop " + (number1<10));
//
//        for (int i=1 ; i<10; i++){
//            System.out.println("i = " + i);
//        }
//
//
//        byte num2 = 125;
//
//        while (num2>0){
//            System.out.println("num2 = " + num2);
//            num2 ++; //prefix !!
//            // num2 = num2 + 1 ; //this calc return error because of type casting !!!! (see day 8!!)
//            // we have to handle explicitly if u want to use this statement  num2 = (byte)(num2 + 1)
//        }
//        System.out.println("OUT OF byte LOOP, num2: "+ num2);
//
//
//
//        // sum even numbers 0 to 100 (Exc)
//
//        int num = 0, sum = 0;
//        while (num < 100) {
//            sum += num;
//            num += 2;
//        }
//        System.out.println("sum = " + sum);
//
//
//        // Initialize a integer variable “number” to  30.
//        // Write a loop that will print “in the loop” while variable is more than 20,
//        // after each print reduce value to “1” (number -1)
//        int number = 30;
//
//        while ( number > 20){
//            System.out.println("In the LOOP");
//            number --;
//        }
//
//        boolean isItNotAppear = true;
//
//        while (isItNotAppear){
//            // click(refreshButton);
//            isItNotAppear = false;
//        }
//

        int num1 = 0;
        int num2=0;

        while (num1 < 10) {

            if (num2<30) {
                num1++;
                num2++;
                System.out.print(num1);
            }
        }

    }



}
