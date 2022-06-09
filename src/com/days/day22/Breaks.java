package com.days.day22;

public class Breaks {
    public static void main(String[] args) {


//        *****
//         ****
//          ***
//           **
//            *
//

//         *
//         **
//         ***
//         ****
//         *****


//             *
//            **
//           ***
//          ****
//         *****
//        *
//        **
//        ***
//        ****
//        *****

//        for (int i = 0; i < 5; i++) {// outer loop
//            for (int n = 4; n > i; n--) {// inner loop 1
//                System.out.print(" ");
//            }
//            for (int k = 0; k <= i; k++) {// inner loop 2
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
        trianglee(8);
        trianglee(15);
    }

    public static void trianglee(int row) {
        for (int i = 0; i < row; i++) {// outer loop
            for (int n = row-1; n > i; n--) {// inner loop 1
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {// inner loop 2
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
