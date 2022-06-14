package com.days.day27;

public class GeneralReview_2_SwitchCase {


    public static void main(String[] args){

        int numTest= 11;

        short num1 = 5;
        int num2 = 11;
      final  int NUM3 = 10;


        switch (numTest){
            case 11:
                System.out.println("value is 11");
               break;
//            case 11.0:
//                System.out.println("value is 11.0");
//                break;
//            case num2:
            case NUM3:
                System.out.println("value is num3's value!");
//                break;
            case 100:
                System.out.println("value is 100");
                break;
            default:
                System.out.println("DEFAULT!!!");

        }



      // Group Study PROJECT Task

        /*
        Create a method! This method will show up break time counter...
        let's give a 15 min break --> 15 will be your parameter

        15:00
        14:59
        ..
        ..
        14:00
        13:59
        13:58
        ..
        ..
        ..
        00:01
        00:00
        "BREAK TIME IS OVER!!!!!"

        to wait 1 second use these statements!!

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */

    }
}
