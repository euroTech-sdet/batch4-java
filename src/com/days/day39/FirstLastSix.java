package com.days.day39;

public class FirstLastSix {
    public static void main(String[] args) {

//        Given an array of ints, return true if 6 appears as either
//        the first or last element in the array. The array will be length 1 or more.

//        firstLast6([1, 2, 6]) → true
//        firstLast6([6, 1, 2, 3]) → true
//        firstLast6([13, 6, 1, 2, 3]) → false
        int[] firstLast = {1, 2, 6};
        if (firstLast[0] == 6 || firstLast[firstLast.length - 1] == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        boolean result = (firstLast[0] == 6 || firstLast[firstLast.length - 1] == 6) ? true : false;
        System.out.println("result = " + result);

    }





}
