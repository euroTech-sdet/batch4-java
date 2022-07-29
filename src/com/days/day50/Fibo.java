package com.days.day50;



import java.util.ArrayList;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        //     1  1  2   3   5  8  13  21  34  55  89
//             1+ 1  2
//                1  2  =3
//                   2 + 3   =  5
//
//
//
//          a  b  c
//             a  b  c
//                  a  b  c
// 1 is the first fibonacci number

//          10th fibo number
//            5 th  fibo number
        int a = 1;
        int b = 1;
        int c = 0;
        int fibNo = 23;
        for (int i = 0; i < fibNo - 2; i++) {
            c = a + b;// 1+1 = 2
            a = b;
            b = c;
        }

        System.out.println("c = " + c);

        fiboNumber(5);
        fiboNumber(10);
        fiboNumber(15);
        fiboNumber(25);
        ArrayList<Integer> fiboFirstTen = fiboTen(10);
        System.out.println(fiboTen(10).get(4));// holds Arraylist

        Scanner scan = new Scanner(System.in);
        System.out.println("how many fibo numbers do you want");
        int numbers = scan.nextInt();
        fiboTen(numbers);
    }

    public static long fiboNumber(int num) {
        int a = 1;
        int b = 1;
        long c = 0;

        for (int i = 0; i < num - 2; i++) {
            c = a + b;// 1+1 = 2
            a = b;
            b = (int) c;
        }
        System.out.println("c = " + c);
        return c;
    }


    public static ArrayList<Integer> fiboTen(int num) {
        int a = 1;
        int b = 1;
        int c = 0;
        ArrayList<Integer> fiboNumbers = new ArrayList<>();
        fiboNumbers.add(1);
        fiboNumbers.add(1);
        for (int i = 0; i < num - 2; i++) {
            c = a + b;// 1+1 = 2
            a = b;
            b = (int) c;
            fiboNumbers.add(c);
        }
        System.out.println("fiboNumbers.get(4) = " + fiboNumbers.get(4));
        return fiboNumbers;
    }
}
