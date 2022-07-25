package com.days.day50;

public class Recursion {
    public static void main(String[] args) {

// 5 4 3 2 1
        //  System.out.println(recursion(5));

        System.out.println(fibo(5));
    }





    public static int fibo(int num) {


        int end = 0;
        if (end == 1) {
            return 1;
        } else if (end < num) {

            return fibo(end) + fibo(end + 1);
        } else {
            return 0;
        }
    }


    public static int recursion(int end) {
        System.out.println("recursion");
        int a = 0;
        if (end > 0) {
            // 5 +  recursion(4)
            //   4 +  recursion(3)
            //     3 +  recursion(2)
            //      2+   recursion(1)
            //       1 +  recursion(0)
            return end + recursion(a + 1);
        } else {
            return 0;
        }
    }
}
