package com.days.day27;

public class GeneralReview_2 {

    public static void main(String[] args) {

        int num = 15;
        checkNumberDivision(num);
        if (2 < 1) ;  //!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("blabla");


        boolean flag = true;

        if (flag) {  // if(flag==true){
            //statement1
            //statement2
        }


        boolean isNumberEven = num % 2 == 0;


    }

    public static void checkNumberDivision(int number) {
        // num % 2 == 0  --> times to 2
        // num % 3 == 0  --> times to 3
        // num % 6 == 0  --> times to 6

//        if(number % 2 == 0){
//            System.out.println(number + " is times to 2" );
//        }
//        if(number % 3 == 0){
//            System.out.println(number + " is times to 3" );
//        }
//        if(number % 6 == 0){
//            System.out.println(number + " is times to 6" );
//        }

        if (number % 2 == 0) {
            System.out.println(number + " is times to 2");
            if (number % 3 == 0) {
                System.out.println(number + " is times to 3");
                System.out.println(number + " is times to 6");
            }
        } else if (number % 3 == 0) {
            System.out.println(number + " is times to 3");
        }


    }
}
