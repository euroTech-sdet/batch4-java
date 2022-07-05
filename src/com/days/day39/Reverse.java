package com.days.day39;

import java.util.Arrays;

public class Reverse {
    //    Given an array of ints ,
//    return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//
//
//    reverse3([1, 2, 3]) → [3, 2, 1]
//    reverse3([5, 11, 9]) → [9, 11, 5]
//    reverse3([7, 0, 0]) → [0, 0, 7]
    public static void main(String[] args) {
        int[] nums = {5, 12, 30, 14, 50, 23, 45, 56, 78, 550, 780, 90};
        //           5   4  3  2  1   new array
        int[] newArray = new int[nums.length];
        int index = nums.length - 1;//
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[index];
            index--;
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("Arrays.toString(newArray) = " + Arrays.toString(newArray));
        int[] digits = {98, 87, 76, 76, 65, 65, 54, 54, 43, 43, 32};
        reversed(digits);
        // String reverse = reversed(digits);
//        System.out.println("reverse = " + reverse);
//        String[] split = reverse.split(",");
//        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));
    }

    public static int[] reversed(int[] nums) {
        int[] newArray = new int[nums.length];
        int index = nums.length - 1;//
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[index];
            index--;
        }
        System.out.println("Array old one = " + Arrays.toString(nums));
        System.out.println("Array after reverse= " + Arrays.toString(newArray));
        // return Arrays.toString(newArray);
        return newArray;
    }

}
