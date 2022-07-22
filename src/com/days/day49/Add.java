package com.days.day49;


import java.time.LocalDateTime;


public class Add {

    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        Add ad = new Add();
        ad.getSum(num, num2);
        Add operation = new Add();
        operation.getSum(40, 50);
        operation.getSum(20, 30, 40);
        int[] nums = {1, 2, 3, 4, 5};
        operation.getSum(nums);
        operation.getSum1(1, 2, 3, 4, 5, 6, 7, 8, 9);
        ad.getSum1(10, 20);
        ad.getSum1(20, 10, 30, 40);
        ad.getSum1(nums);

        printStrings("Hello ", " java");


    }

    public static void printStrings(String... str) {
        for (String s : str) {
            System.out.println("s = " + s);
        }
    }


    public void getSum1(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        System.out.println("sum = " + sum);
    }

    public String getSum(int b) {
        return "" + b;
    }

    public void getSum(int a, int b) {
        System.out.println(a + b);
    }

    public int getSum(int a, int b, int c) {
        System.out.println(a + b + c);
        return a + b + c;
    }

    public void getSum(int[] nums) {


    }

    public int calculateAge(int birthYear) {
        int age = 0;
        LocalDateTime time = LocalDateTime.now();
        int year = time.getYear();
        System.out.println("year = " + year);
        age = year - birthYear;// 2022-1990
        System.out.println("age = " + age);
        return age;//32
    }


}
