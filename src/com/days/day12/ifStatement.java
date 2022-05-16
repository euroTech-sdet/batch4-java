package com.days.day12;

public class ifStatement {

    public static void main(String[] args) {

        int number = -1;
        System.out.println("Before IF");

        if (number > 0) { // IF exp is TRUE, then java can run inside curly b. !!

            System.out.println("INSIDE IF");
            System.out.println("Number '" + number + "' is a positive number!");
            //statements
        }
        System.out.println("After IF");


        System.out.println("////////////////////////  \n");


        int numberInt = 100;

        double numberDob = numberInt;

        System.out.println("Before IF");
        if (numberInt == numberDob) { // 100 == 100.0  ==> TRUE!!

            System.out.println("Numbers are equal!!");

        }
        System.out.println("After IF");



        System.out.println("////////////////////////  \n");


        System.out.println("Before IF");

        if(1==0)
        System.out.println("Inside IF");
        System.out.println("?????");

        System.out.println("After IF");




        System.out.println("////////////////////////  \n");

        //Ex-1 SALARY CALCULATION!!

        double hours=50, salary= 3500;

        if (hours > 38){
            salary *= 1.5;  // salary = salary * 1.5;
        }

        System.out.println("salary = " + salary);


        // Ex-2

        int x=0, y = 7;

        if (y > 0) {
            x = 1;
           // System.out.println(x);
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);








    }
}
