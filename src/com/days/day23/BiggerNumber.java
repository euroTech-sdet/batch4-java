package com.days.day23;

public class BiggerNumber {
    public static void main(String[] args) {
        // create a method get 3 double numbers find the biggest number print and return it
        //  a b c
        double a = 50.0;
        double b = 30.0;
        double c = 20.0;
        if (a > b && a > c) {
            System.out.println(a + "  is the biggest number.");
        } else if (b > c) {
            System.out.println(b + " is the biggest number ");
        } else {
            System.out.println(c + " is the biggest number ");
        }
//        if(b>c){
//            System.out.println(b+" is the biggest number. ");
//        }
        findBiggestNumber(a, b, c);
        findBiggestNumber(100.0, 200.0, 300.0);

    }

    public static double findBiggestNumber(double a, double b, double c) {
        double biggest;
        if (a > b && a > c) {
            System.out.println(a + "  is the biggest number.");
            biggest = a;
//            return a;
        } else if (b > c) {
            System.out.println(b + " is the biggest number ");
            biggest = b;
//            return b;
        } else {
            System.out.println(c + " is the biggest number ");
            biggest = c;
//            return c;
        }
        return biggest;
    }

}
