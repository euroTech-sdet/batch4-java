package com.days.day17;

public class Loop3 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.print("  i = " + i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }

        //  print numbers between 10 and 50
        for (int i = 10; i <= 50; i++) {
            System.out.println("i = " + i);
        }

        // sum of the numbers between 0 - 50   addition
        //    0   1   2   3   4   5  6   7
        //         1+2= 3
        //          3 + 3  =6
        //           6+ 4 = 10
        //          10   + 5
        int sum = 0;
        for (int i = 1; i <= 50; i++) {

            // sum = sum + i  ==   sum += i same statements
            sum = sum + i;


        }
        System.out.println("sum = " + sum);

        int result = 0;
        int lastPoint = 100;
        for (int i = 1; i < lastPoint; i++) {

            result = result + i;

        }
        System.out.println("result = " + result);


    }
}
