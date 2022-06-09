package com.days.day24;

public class PrimeNumbersBetween {
    public static void main(String[] args) {
//        int count = 0;
//        for (int k = 2; k < 100; k++) {   // outer loop
//
//            for (int i = 2; i < k; i++) {// inner loop
//
//                if (k % i != 0) {//   7%2 7%3 7%4 7%5 7%6
//                    count++;// 1 2 3 4 5
//                }
//            }
//
//            if (count == k - 2) {
//                System.out.println(k + "  prime number ");
//            } else {
//                //   System.out.println(" not prime number ");
//            }
//            count = 0;
//        }

        primeNumbers(50,100);
        primeNumbers(200,250);
    }

    static void primeNumbers(int firstNumber, int lastPoint) {// 50 - 100
        int count = 0;
        for (int k = firstNumber; k < lastPoint; k++) {   // outer loop

            for (int i = 2; i < k; i++) {// inner loop

                if (k % i != 0) {//   7%2 7%3 7%4 7%5 7%6
                    count++;// 1 2 3 4 5
                }
            }

            if (count == k - 2) {
                System.out.println(k + "  prime number ");
            } else {
                //   System.out.println(" not prime number ");
            }

            count = 0;


        }


    }


}
