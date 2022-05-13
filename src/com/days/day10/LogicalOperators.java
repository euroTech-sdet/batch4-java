package com.days.day10;

public class LogicalOperators {
    public static void main(String[] args) {
        //    &&   and operator

        int a = 10;
        int b = 20;
        int sum = 30;
        System.out.println(a > b);// return boolean  so will be false
        System.out.println(sum > b);//  return boolean 30 > 20  => true
        System.out.println(a < sum);// 10 < 30 => true
        System.out.println(a < sum && sum > b);
        //             expression1 &&  expression2
        //                10<30   &&     30>20
        //                true           true
        //                     true
        System.out.println(a > b && b < sum);
        // 10 > 20 &&  20 < 30
        //   false &&   true
        //            false

        //       ||  or
        System.out.println(a < sum || sum > b);
        //                  expression1|| expression2
        //                    true      ||  true
        //                              true
        System.out.println(a > b || b < sum);
        //                  10>20 || 20<30
        //                    false|| true
        //                    true
        //    a=10   b=20    sum =30
        System.out.println(sum > a && a > b);
        //                  30 > 10 && 10>20
        //                   true        false
        System.out.println(sum > a || a > b);
        //                  30 > 10 || 10>20

        System.out.println(sum < a & ++a < b);
        //                  30 < 10 & 10  < 20
        //                    false      true
        //                      false
        //   a is now 11
        System.out.println("a = " + a);
        System.out.println(sum < a && ++a < b);
        System.out.println("a = " + a);//  a will be ?
        // a is 11
        System.out.println(sum > a | ++a < b);
        // we use single | operator so a will be 12
        System.out.println("a = " + a);

        System.out.println(sum < a || ++a < b);
        //                 30  < 12||  ++a<20
        //                     false ||  true
        //                      true   a is 13
        System.out.println("a" + a);
        System.out.println(sum < a && ++a < b);
        // a is ?            false &&
        //                      false  a is still same 13
        System.out.println("a = " + a);

        boolean expression1 = sum < a;
        boolean expresion2 = ++a < b;
        boolean result = sum < a && a < b;
        System.out.println("a = " + a);// a will be 14
        System.out.println("result = " + result);
// a b sum
        //   !  not operator

        boolean success = true;
        System.out.println(!success);// will change  true  to false or   false to  true
        System.out.println("a != b "+(a != b));// a ! = b     meaning is a is not equal  b  returns boolean value
        //                                a is 14  b is 20  so it is true



    }
}
