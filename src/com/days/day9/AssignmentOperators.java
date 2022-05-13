package com.days.day9;

public class AssignmentOperators {
    public static void main(String[] args) {
        int num = 20;// =  is different thn ==
        //   =  is assignment operator   == is used for equals meaning
        int value = num;
        System.out.println("num = " + num);
        //   +=
        int num2 = num + 50;//  20 + 50   num2 is 70
        num2 = num2 + 100;//    num2 = 70 + 100
        System.out.println("num2 = " + num2);
        num = num + 500;//   num =  20 +  500
        System.out.println("num = " + num);  // 520
        num += 1000;//  num =  num + 1000        num = 520 + 1000   num = 1520
        System.out.println("num = " + num);
        num -= 520;//  num = num - 520     num = 1520 - 520  =  1000
        System.out.println("num = " + num);
        num /= 10;//    num = num  / 10      num  =  1000 / 10 = 100
        System.out.println("num = " + num);
        num %= 3;//  num =  num % 3    num = 100 % 3  =  1
        System.out.println("num = " + num);

        int valu7 = 200;
        valu7 = valu7 - 50;// 150
        valu7 -= 50;  //  150 - 50
        System.out.println("valu7 = " + valu7);// 100


        int num11 = 200;
        num11 += valu7;// num11 = num11 + valu7

    }
}
