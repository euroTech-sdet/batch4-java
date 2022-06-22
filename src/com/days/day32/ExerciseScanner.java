package com.days.day32;

import java.util.Scanner;

public class ExerciseScanner {

    public static void main(String[] args) {

      //  System.out.println(calc());

        System.out.println(sumOfTheDigit());
    }


    public static int calc(){
        Scanner value=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=value.nextInt();
        return (num%1000)/100 + (num%100)/10 + num%10;
    }


    public static int sumOfTheDigit(){

        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();

        //981

        int digit1=number%10; // 1

        number=number/10;  // 98
        int digit2=number%10; // 8

        int digit3= number/10; //9
        return digit1+digit2+digit3;




    }
}
