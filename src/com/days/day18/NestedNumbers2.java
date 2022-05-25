package com.days.day18;

public class NestedNumbers2 {
    public static void main(String[] args) {

        for (int k = 1; k <= 4; k++) {// outer loop will run 4 times  rows are 4 so it is ok

            for (int i = 1; i <= k; i++) {//  how many times will inner loop run , 3 times will run
                System.out.print(i);    //   1            123123123123
                //   1 2
                //   1 2 3
                //   1 2 3 4
            }
            System.out.println();

        }


        for (int k = 1; k <= 4; k++) {// outer loop will run 4 times  rows are 4 so it is ok

            for (int i = 1; i <= k; i++) {//  how many times will inner loop run , 3 times will run
                System.out.print(k);    //   1            123123123123
                //   2 2
                //   3 3 3
                //   4 4 4 4
            }
            System.out.println();

        }
        // multiplication table
        //     1
        //    12
        //   123
        //  1234
        //  12345
        //  diamond    patterns

        //  print numbers from 100 to 1

        int i;
        for ( i = 100; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("i = " + i);

    }
}
