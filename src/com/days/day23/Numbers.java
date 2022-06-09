package com.days.day23;

public class Numbers {
    public static void main(String[] args) {
        // fibonacci
        // 0 1 1
        // a b c
        //   a b c
        //     a b c
        // 2 3 5 8  13 21  34  55


        // prime numbers   only divided by 1 and itself without remaining
        //  2 3  5  7  11 13 17 19 23 29 31 37
        // 1 -100   find the prime numbers between 1 - 100

        // will give a number and find whether this number is prime or not

        //   40    40/2
        //   47%2  47%3  47%4  47%5  47/6  47/7  8  9 ........47/45  47/46
        //  63%2 63 % 3 2 3 4 5 6 7 8 9
        //
        int count = 0;
        //     6%2 6%3== 0
        //   7%2 7%3 7%4 7%5 7%6
        for (int i = 2; i < 7; i++) {

            if (7 % i != 0) {//   7%2 7%3 7%4 7%5 7%6
                count++;// 1 2 3 4 5
            }
        }
        System.out.println("count = " + count);
        if (count == 5) {
            System.out.println("prime number ");
        } else {
            System.out.println(" not prime number ");
        }

        for (int k = 2; k < 100; k++) {   // outer loop

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


        primeNumberOrNot(120);
        primeNumberOrNot(19);
        primeNumberOrNot(30);
        primeNumberOrNot(7);


    }


    public static void primeNumberOrNot(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {

            if (num % i != 0) {
                count++;
            }
        }
        if (count == num - 2) {
            System.out.println(num + "prime number ");
        } else {
            System.out.println(num + " not prime number ");
        }

    }
}
