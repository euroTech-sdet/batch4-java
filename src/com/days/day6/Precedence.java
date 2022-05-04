package com.days.day6;

public class Precedence {
    public static void main(String[] args) {
        System.out.println(100 + 20 / 4);//  120 / 5 24    100+5=105
        System.out.println(500 - 100 * 2);
        System.out.println(100 * 20 + 40 / 4 - 2);

        int result = 100 * 20 + 40 / 4 - 2;
        System.out.println("result = " + result);


        // if the result is 1 the number is odd if  the result is 0 the number is even number
        System.out.println(99 % 2);// result will be 1 so 99 is not even
        System.out.println(100 % 2);// 100 is even
        int result2 = 100 * (20 + 40) / 4 - 2;
        System.out.println("result2 = " + result2);

        String name = "Benzema";
        String action = " is playing";
        String match = name + action;
        System.out.println(name + action);
        System.out.println(name + 3 + 6);// Benzema 36
        System.out.println(name + 7 + 3 * 9);// Benzema727
        String real = name + false;
        System.out.println(name + false);
        System.out.println("real = " + real);
     //    System.out.println(false+20); will  give error


    }
}
