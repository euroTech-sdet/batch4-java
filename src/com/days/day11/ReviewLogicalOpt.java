package com.days.day11;

public class ReviewLogicalOpt {

    public static void main(String[] args) {

                       // 1. Door   2. Door
        System.out.println( true && true );

        System.out.println( true && false );  // false

        System.out.println( false && true );  // false it will stop after see the logical and opt, will not check 2. expression!!!


        int a = 10;
        int b = 8;
        int c = 10;
        int d = 1;
        int e = 33;
        int f = 8;


        boolean check = (a>=b) || !(c==d) && (e!=f) ;

        System.out.println("check = " + check); // TRUE



        ////////////

        
        boolean isThereValidDate= false;

        System.out.println(!isThereValidDate);


    }
}
