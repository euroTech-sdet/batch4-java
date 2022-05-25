package com.days.day18;

public class Loop {
    public static void main(String[] args) {

        int i = 0;
        for (; i <= 5; i++) {

            System.out.println("Hello Again");

        }// closing curly braces, end of body
        System.out.println(" i  " + i);// i is 5

        //    int i = 0; will give error because i have already declared it
        i = 0;
        //for(int i=0;i<5;i++){
        for (; i < 2; i++) {
            System.out.println("hello eurotech");
        }
        int num;
        for (num = 0; num < 3; num++) {

            System.out.println("num = " + num);

        }
        System.out.println("num = " + num);

        if (num > 0) {
            int number = 30;
        }
       //  number cant reach out of if statements


    }
}
