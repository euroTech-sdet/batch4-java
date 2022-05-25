package com.days.day18;

public class NestedNumbers {
    public static void main(String[] args) {
            int rows=5;
        for (int i = 0; i <= rows ; i++) {// 0  1  2   outer loop will run 3 times

            for (int k = 0; k <= 3; k++) {// 0 1 2 3  will run 4 times

                System.out.print(i);// 0000
                                    // 1111
                                    // 2222
                                    // 3333
                                    // 4444
                                    // 5555
            }
            System.out.println();

        }



        int row=5;
        for (int i = 1; i <= row ; i++) {

            for (int k = 0; k < i; k++) {// inner loop

                System.out.print(i);
                                    // 1
                                    // 22
                                    // 333
                                    // 4444
                                    // 55555
            }
            System.out.println();

        }
    }
}
