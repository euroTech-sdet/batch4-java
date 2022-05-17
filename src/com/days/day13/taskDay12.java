package com.days.day13;

public class taskDay12 {


    public static void main(String[] args) {


        // 1-

        double score = 91, pay = 3000;

        if (score > 90) {
            pay *= 1.03;  // pay = pay * 1.03;
        }

        System.out.println("Final pay = " + pay);


        // 2-

        int number1 = 11;

        if (number1 % 5 == 0) {
            System.out.println("Hi Five!");
        }

        if (number1 % 2 == 0){
            System.out.println("Hi Even!");
        }


        //3-

        int age= 19;

        if (age >= 18){
            System.out.println("LET'S VOTE!!");
        } else{
            System.out.println("Not eligible!!");
        }



        //4-
        int a = 32, b = 60, c = 40;
        if (a > b && a > c) {
            System.out.println("En buyuk sayi =" + a);
        }
        if (b > a && b > c) {
            System.out.println("En buyuk sayi =" + b);
        }
        if (c > b && c > a) {
            System.out.println("En buyuk sayi =" + c);
        }


    }
}
