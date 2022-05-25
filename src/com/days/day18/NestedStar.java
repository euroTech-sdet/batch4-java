package com.days.day18;

public class NestedStar {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {// outer loop

            System.out.println();
            for (int k = 0; k < 4; k++) {// inner loop

                System.out.print(" * ");  // * * * *
                                         //  * * * *
                                         //  * * * *
                                         //  * * * *
            }



        }

        for (int i = 0; i < 4; i++) {// outer loop

            System.out.println();
            for (int k = 0; k <= i; k++) {// inner loop

                System.out.print(" * ");
                                          // *            each line is row
                                         //  * *
                                         //  * * *
                                        //   * * * *

            }
        }




    }
}
