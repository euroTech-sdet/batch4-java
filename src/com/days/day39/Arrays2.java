package com.days.day39;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 50, 30, 70, 80, 90};
        System.out.println("nums[0] = " + nums[0]);
        String[] countries = {"Spain", "Germany", "Holland", "Polland", "Greece"};
        int numberOne = nums[0];
        String countryOne = countries[0];
        System.out.println("numberOne = " + numberOne);
        System.out.println("countryOne = " + countryOne);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("Arrays.toString(countries) = " + Arrays.toString(countries));
        System.out.println("binarySearch(nums,80) = " + Arrays.binarySearch(nums, 80));//gives index number
        System.out.println("Arrays.b\"Germany\") = " + Arrays.binarySearch(countries, "Germany"));
        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        Arrays.stream(countries).forEach(System.out::println);
        System.out.println("Arrays.stream(nums).sum() = " + Arrays.stream(nums).sum());


    }
}
