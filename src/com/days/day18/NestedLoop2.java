package com.days.day18;

public class NestedLoop2 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {// 0 1 // outer loop

            System.out.println("outer loop ");

            for (int k = 0; k <= i; k++) {//3 times  inner loop   k 0   i  0

                System.out.println("inner loop");

            }
        }
        System.out.println("out of  all loops");
        // outer loop
        // inner loop
        // outer loop
        // inner loop
        // innner loop
        // out of all loops

    }



}
