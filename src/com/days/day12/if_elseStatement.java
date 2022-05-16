package com.days.day12;

public class if_elseStatement {


    public static void main(String[] args) {


        // QA - Write a Java program, this will be check the users age.
        // if it is 16 or more , print you are eligible to apply driving license


        int age= 15;

        if (age >= 16){
            // TRUE !!!
            System.out.println("BRAVOOO... You're eligible to apply driving license!! ");
        } else {
            // FALSE
            System.out.println("Sorry :( You're NOT eligible to apply driving license!!");
        }



        System.out.println("////////////////////////  \n");


        //If radius >= 0 is true, area is computed and displayed; if it is false, the message "Negative input" is displayed.
        int radius=10;
        double area=0;
        final double PI = 3.14;
        if(radius>= 0){
            System.out.println("area is blabla");
        }

        if(radius<0){
            System.out.println("Negative value!!!");
        }

        /////////////////////

        if (radius >= 0) {
            area = radius * radius * PI;
            System.out.println("The area for the circle of radius " +
                    radius + " is " + area);
        }
        else {
            System.out.println("Negative input");
        }


        System.out.println("////////////////////////  \n");


        int num =-10;
        if (num<0){
            System.out.println("Negative");
        }else {
            System.out.println("Positive");
        }


        int number = 1;

        if (number>0){
            System.out.println("This number is Positive");
        }
        if (number==0){
            System.out.println("number is zero");
        }
        if(number<0) {
            System.out.println("this number is negative");
        }

        // IT IS NOT A GOOD , but for now it is ok !!
          //////////////////////////


        double pay=100;
        double score=90;
        if (score>90){
            pay*=1.03;
        }else {
            pay*=1.01;
        }

        System.out.println("score = " + pay);


// Be carefull about { } !!!
        if (1<0)
            System.out.println("Come on!!");
          else
            System.out.println("Cool!");
            System.out.println("That's it!!");

    }
}
