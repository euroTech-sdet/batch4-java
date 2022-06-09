package com.days.day23;

public class Methods {
    public static void main(String[] args) {
        // print the even numbers between 0-100
        // even numbers number%2==0  the number is even   2 4 6 8 10

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            }
        }
        // create a method with 1 parameter(int ) print whether this number is even or not

        evenOrNot(21);
        evenOrNot(30);
        boolean result = evenTrue(40);
        System.out.println("result = " + result);

    }

    public static void evenOrNot(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is an even number ");
        } else {
            System.out.println(a + " is not even number");
        }
    }

    // if number is even number will return a boolean value-true else false
    public static boolean evenTrue(int a) {
        boolean evenTrue = false;
        if (a % 2 == 0) {
            System.out.println(a + " is an even number ");
            evenTrue = true;
        } else {
            System.out.println(a + " is not even number");
        }

        return evenTrue;// value is true or false
//        return a % 2 == 0;
    }


}
