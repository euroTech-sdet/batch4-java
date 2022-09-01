package com.days.day66;

import java.util.*;

public class Questions2 {

    public static void main(String[] args) {


        System.out.println("\n//////////////////////Question-6 - Day 65//////////////////\n");


        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first array: " + c1);

        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Amber");
        c2.add("Green");
        c2.add("White");
        c2.add("Blue");
        System.out.println("List of second array: " + c2);


        ArrayList<String> a = new ArrayList<>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New array: " + a);


        Set<String> combineSet = new TreeSet<>(c1);

        //combineSet.addAll(c1);
        combineSet.addAll(c2);

        System.out.println("combineSet = " + combineSet);



        System.out.println("\n//////////////////////Question-1 Day 66//////////////////\n");

        ArrayList<String> list1= new ArrayList<String>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");
        System.out.println("List1: " + list1);

        Collections.shuffle(list1);

        System.out.println("After shuffle List1: " + list1);


        System.out.println("\n//////////////////////Question-2 Day 66//////////////////\n");

        List<Float> weight = new ArrayList<>();
        weight.add(1.01f);
        weight.add(1.01f);
        weight.add(1.01f);
        weight.add(1.4f);
        weight.add(2.4f);
        weight.add(2.4f);

        System.out.println("efficientJanitor(weight) = " + efficientJanitor(weight));

    }


     //("\n//////////////////////Question-2 Day 66//////////////////\n");

//ALG:
//    min 1.01
//    max 3 - 1.01
//
//    a + b <= 3.0
//
//    1.01 <= x  3.0<=
//
//     1.01  1.01 1.5 1.99   1.99  2.1   2.5   2.9  3
//
//    SORT!!!
//    trip counts!!

    public static int efficientJanitor(List<Float> weight){

        Collections.sort(weight); // min --> max !!

        int trips = 0;

        int left = 0; // min value's index !!!
        int right = weight.size()-1;   // max value's index!!

        while (left<= right){

            if((weight.get(left) + weight.get(right)) <= 3.0f ){
                left++;
            }
            right--;
            trips++;
        }

        return trips;
    }





    public static int tripNum(double[] a) {
        double[] arr = new double[a.length];
        int leftNum = 0;
        int rightNum = arr.length - 1;
        int trip = 0;

        while (leftNum <= rightNum) {
//            if (leftNum == rightNum) {
//                trip++;
//                break;
//            }
            if (arr[leftNum] + arr[rightNum] <= 3.0) {
                leftNum++;
            }

                rightNum--;
                trip++;
            }

        System.out.println(trip);

        return trip;
        }










}
