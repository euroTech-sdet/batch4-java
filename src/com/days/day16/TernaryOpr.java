package com.days.day16;

public class TernaryOpr {


    public static void main(String[] args) {


        // assume that they are NOT a EQUAL!!
        int num1 = 2;

        int num2 = 1;

        String result = "";


        //1.Way : u can assign operator directly to a object
        result = num2 < num1 ? "num1 is bigger" : "num2 is bigger";

        //2.Way u can use them directly in println method , if u want to print
        //System.out.println((num2 < num1) ? "num1 is bigger" : "num2 is bigger");

        System.out.println("Result = " + result);

        System.out.println("/////////////////////////////////////////////////////////////////");
        // Same cond with if-else:
        if (num2 < num1) {
            result = "num1 is bigger";
        } else {
            result = "num2 is bigger";
        }

        System.out.println("Result = " + result);

        String result2 = (num1 >= 0) ? "Num1 is positive" : "Num1 is negative";

        System.out.println(1 < 0 ? 1 : false);

        System.out.println(num1 > num2 ? num1 : num2);


        double num3 = num1 > num2 ? 1 : 1.0;  // thanks to Implictly casting !!


        // BLOCK

        {
        }


        // TASK-1

        int number = 331341;

        String result3 = (number % 2 == 0) ? "even" : "odd";

        System.out.println(number + " is " + result3 + " number");


        // TASK-2

        //1. way
        int score = -5000;
        String resultScore = "";
        String failOption = "failed. You needed " + (50 - score) + " more points to pass the exam";

        if (score < 0) {
            System.out.println("Wrong score!!");
        } else {
            resultScore = score < 50 ? failOption : "passed";
        }

        System.out.println("Your mark is " + score + " and you " + resultScore);

        //2.way:

        resultScore = score < 50 ? (score < 0 ? "Wrong score!!" : failOption) : "passed";



        // TASK -3
        String name="Alejandro";
        int age=18;
        String result4;
        result4 = (18<=age || age<=65) ? "Hi " +name+ " you are qualified " :(age>0 ? "Hi "+name +"You are not qualified ": "You typed wrong age!!");


        // TASK -4

        double a = 3;
        double b = 4;
        double c = 5;

        String result5;

        result5 = ((a + b) > c && ((a+c)>b) && ((b+c)>a)) ? "This is a triangle" : "This is not a triangle";
        System.out.println(result5);


    }
}
