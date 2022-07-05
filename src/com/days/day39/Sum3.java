package com.days.day39;

public class Sum3 {
//    Given an array of ints , return the sum of all the elements.

    //    sum3([1, 2, 3]) → 6
//    sum3([5, 11, 2]) → 18
//    sum3([7, 0, 0]) → 7
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("sum = " + sum);
        int result = sum(nums);
        System.out.println(result == sum);
    }

    public static int sum(int[] numbers) {
        int sumOfTheArray = 0;
        for (int a : numbers) {
            sumOfTheArray += a;
        }
        System.out.println("sumOfTheArray = " + sumOfTheArray);
        return sumOfTheArray;
    }


}
