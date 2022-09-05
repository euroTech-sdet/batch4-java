package com.days.day68;

import java.sql.SQLData;

public class Samples3 {


    public static void main(String[] args) throws InterruptedException {


        System.out.println("Before wait");
        pauseApplication(3);
        System.out.println("After wait");

        test();

    }


    public static void pauseApplication(int seconds)  { // throws InterruptedException  2. way

        // 1 . way ( Good practice!!)
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //2. way

//        Thread.sleep(seconds * 1000L);


    }



    public static void test() throws InterruptedException {


        System.out.println("Login");

        Thread.sleep(1000);

        System.out.println(" Do some test..");

        Thread.sleep(1000);

        System.out.println("Next page go on test");

        Thread.sleep(1000);

        System.out.println("Do verification!");


    }





}
