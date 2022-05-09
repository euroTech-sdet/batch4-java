package com.days.day8;

import java.util.Objects;

public class ExpressionCasting {

    public static void main(String[] args) {

        // LONG FLOATING EXPRESSION

        byte b= 2;
        char c = '('; // 40
        short s = 3;
        int i = 80;
        float f = 1.5f;
        double d = 1.1;
        long l = 100L;

        // Expression:
        double result = (f * b) + (i / c) - (d * s);

        double result2 = (f * b);

        long l1 = l + i;

        long l2 = l + b;

        double d2 = d + b;

        float f2 = l + f;

        /////////////////////////////////

        byte bb= 120;
        int i2= 2_000_000_000;

        bb= (byte)(bb*2); // !! problem is fixed but solution is not 240!!
        System.out.println("bb = " + bb);

        ///////////////////////////




    }
}
