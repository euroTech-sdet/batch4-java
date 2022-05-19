package com.days.day15;

public class ReviewIf_Switch {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        int sum = a + b;
        boolean result = a < b && ++b <= 21;
//                      10<20  &&  20+1 <= 21
        //               true          true
        System.out.println(result);
        System.out.println("b = " + b);// 21

        boolean result2 = a > b && ++b <= 22;
        System.out.println("result2 = " + result2);
        System.out.println("b = " + b);//21

        boolean result3 = a > b & ++b <= 22;
        System.out.println("result3 = " + result3);
        System.out.println("b = " + b);
        int num, num1, num2;// declaration

       //  num>num1   // not assigned a value

    }

}
