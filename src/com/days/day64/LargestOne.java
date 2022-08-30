package com.days.day64;

public class LargestOne {
    public static void main(String[] args) {
        int[] numbers = new int[]{10000, 2000, 10, 40, 500000, 600000, 0, 120, 300, 100000, 1};
        int largest = largestArray(numbers);
        System.out.println("largest = " + largest);
        smallestArray(numbers);

        String str = "Hello";
        if (str.charAt(0) == 'e' || str.charAt(1) == 'e' || str.charAt(2) == 'e') {
            System.out.println(true);
        }
        ;
        if (str.substring(0, 3).contains("e")) {
            System.out.println(true);
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        if(count>0&&count<4){
            System.out.println(true);
        }

    }

    public static int largestArray(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("largest = " + largest);
        return largest;
    }

    public static int smallestArray(int[] numbers) {
        int small = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < small) {
                small = numbers[i];
            }
        }
        System.out.println("smallest elemnt of the array =" + small);
        return small;
    }
}
