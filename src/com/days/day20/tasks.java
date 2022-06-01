package com.days.day20;

public class tasks {

    public static void main(String[] args) {

        int givenNumber = 5;
        int j = 1;

        while (j <=10){
            System.out.println(givenNumber+ " * " + j + " = " + (j*givenNumber));
            j++;
        }


       /// Task 2


        int m = 6;

        m *= 2;
        System.out.println(m);

        for ( int l =0 ; l <= 4; l ++ ){
            m *= 2;
            System.out.println(m);
        }


    }
}
