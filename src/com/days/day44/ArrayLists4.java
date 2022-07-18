package com.days.day44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayLists4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 101; i += 2) {
            numbers.add(i);
        }
        numbers.add(0, 500);
        numbers.add(0, 400);
        numbers.add(0, 1400);
        numbers.add(0, 2400);
        numbers.add(0, 12400);
        numbers.add(300);

        // print the numbers bigger than 40
        // create another arraylist and put these numbers in that arraylist
        // i will check the elements of numbers arraylist

        ArrayList<Integer> newOne = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 40) {
                int num = numbers.get(i);
                newOne.add(num);
            }
        }
        System.out.println("newOne = " + newOne);

//        System.out.println("newOne = " + newOne);
//        Collections.sort(newOne);
//        System.out.println("newOne = " + newOne);
//        Collections.reverse(newOne);
//       // System.out.println("newOne = " + newOne);
//
//        for (Integer num : newOne) {
//            System.out.println("num = " + num);
//        }
//
//       // newOne.forEach(System.out::print);


    }
}
