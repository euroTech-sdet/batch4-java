package com.days.day45;

import java.util.ArrayList;

public class Review {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
//        int num = 2147483648;
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        Integer number = new Integer("50");
        Integer number2 = new Integer(50);
        int num = number;
        System.out.println("num = " + num);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(num);
        String text = new String("12345");
        int textNumber = Integer.valueOf(text);
        System.out.println("textNumber = " + textNumber);
        int number3=Integer.parseInt(text);
        System.out.println("number3 = " + number3);

    }
}
