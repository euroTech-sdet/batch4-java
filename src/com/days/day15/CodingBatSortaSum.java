package com.days.day15;

public class CodingBatSortaSum {
    public static void main(String[] args) {
//
//        Given 2 ints, a and b, return their sum. However, sums in the range 10..19
//    inclusive, are forbidden, so in that case just return 20.
//
//
//        sortaSum(3, 4) → 7
//        sortaSum(9, 4) → 20
//        sortaSum(10, 11) → 21
        int a = 10;
        int b = 11;
        int sum = a + b;
        if (sum >9 && sum <= 19) {
            sum = 20;
            System.out.println("sum = " + sum);
        }else{
            System.out.println(sum);
        }

    }
}
