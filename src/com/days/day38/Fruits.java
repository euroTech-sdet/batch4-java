package com.days.day38;

public class Fruits {
    public static void main(String[] args) {
        // create an  String array  fruits 5
        String[] fruits = {"grapes", "apple", "strawberry", "cherry", "watermelon"};
        //                    0         1          2            3         4
        int[] years = new int[4];
        years[3] = 2000;
        years[0] = 1000;
        years[1] = 3000;
        System.out.println("years[2] = " + years[2]);
        // fruits[0]="orange";
        System.out.println("fruits[0] = " + fruits[0]);
        System.out.println("fruits.length = " + fruits.length);
        for (int i = 0; i < fruits.length - 2; i++) {
            System.out.println("fruits[i] = " + fruits[i]);
        }
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        for (int year : years) {
            System.out.println(year);
        }


    }
}
