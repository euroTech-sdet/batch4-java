package com.days.day38;

public class PrintArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        printArray(numbers);
        String[] fruits = {"orange", "melon", "cherry"};
        printArray(fruits);
        PrintArray print = new PrintArray();
        print.printString(fruits);
        print.printIntegers(numbers);

    }
    public void printIntegers(int[] numbers) {

    }
    public void printString(String[] fruits) {


    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.println("num = " + num);
        }
    }

    public static void printArray(String[] arr) {
        for (String ar : arr) {
            System.out.println("ar = " + ar);
        }
    }


}
