package com.days.day44;


import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        //               0    1   2   3   index numbers
        int a = numbers[0];
        numbers[3] = 100;
        System.out.println("numbers[3] = " + numbers[3]);
        System.out.println("numbers.length = " + numbers.length);
      //  numbers[4] = 200;

        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<String> cities = new ArrayList<>();
        digits.add(100);
        digits.add(200);
        for (int i = 0; i <= 100; i++) {
            digits.add(i);
        }
        System.out.println("digits = " + digits);
        System.out.println("digits.get(4) = " + digits.get(4));
        System.out.println("digits.get(0) = " + digits.get(0));
        System.out.println("digits.size() = " + digits.size());
        digits.add(0,500);
        System.out.println("digits.get(0) = " + digits.get(0));
        System.out.println("digits = " + digits);
        digits.set(0,30);
        System.out.println("digits.get(0) = " + digits.get(0));
        System.out.println("digits = " + digits);
        digits.set(1,90);
        System.out.println("digits = " + digits);
        digits.add(10);
        System.out.println("digits = " + digits);
        digits.add(2,2000);
        System.out.println("digits = " + digits);
        digits.set(3,10);
        System.out.println("digits = " + digits);







    }
}
