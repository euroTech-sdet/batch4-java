package com.days.day23;

public class Breakss {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("hello break");
            if (i == 5) {// i==0 1 2 3 4
                break;
            }
            System.out.println("hello");
        }
        System.out.println("after loop");

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
           if(i>=3){
               continue;
           }
            System.out.println("after continue");
           // i = 0
            // after continue
            // i = 1
            // after continue
            // i = 2
            // after continue
            // i = 3
            // i = 4

        }
    }
}
