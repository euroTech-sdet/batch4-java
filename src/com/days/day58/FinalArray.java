package com.days.day58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalArray {


    public static void main(String[] args) {

       final int[] numbers= {10,20,30,40,50};

        numbers[0]=100;

        System.out.println("numbers.toString() = " + Arrays.toString(numbers));

        int [] numbers2 = numbers ;

        numbers2[0]=200;

     //  numbers =numbers2; ERROR !!!  FINAL ARRAY!!

        System.out.println("Arrays.toString(numbers2) = " + Arrays.toString(numbers2));


        System.out.println("\n//////////////////////\n");

        final ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("list = " + list);

        list.remove(0);
        list.add(0,100);

        System.out.println("list = " + list);




    }
}
