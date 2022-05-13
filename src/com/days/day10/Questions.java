package com.days.day10;

public class Questions {
    public static void main(String[] args) {
        // unary operators
        // ++ increases value of the variable 1 , -- decreases the value of vaiable 1
        // create 2 int variable create third one after adding 2 variable assign it to 3. one

        int a = 10;
        int b = 20;

        int sum = ++a + ++b;//32   a is 11 b  is 21
        System.out.println("a = " + a);// 11
        System.out.println("b = " + b);// 21
        System.out.println("sum = " + sum);// sum is 32
        sum = a-- + b--;//   11 + 21 =  32     after that line a is 10 b is 20
        System.out.println("a = " + a);// 10
        System.out.println("b = " + b);
        System.out.println("sum = " + sum);//  32

        sum = a + b;//  30    a is 10 b is 20
        sum = --a + --b;  // a is 9  b is 19
        System.out.println("sum = " + sum);//  sum is 28

        double d = 2.9;
        System.out.println("d = " + d);
        d++;// increase value of the variable just 1 so will be 3.9
        System.out.println("d = " + d);


        // create 2 integer variable and swap the value of them
        // you can use 3. variable

        int k = 10;
        int l = 20;
        int sum2 = k + l;// sum2 is 30
        k = sum2 - k;// k is now 20
        l = sum2 - l;// l will be 10
        //  after your operation
        System.out.println("k = " + k);// 20
        System.out.println("l = " + l);//

        // 2. solution to swap the value of the 2 variables
        // without using 3. variable

        int n = 20;
        int m = 30;
        // wrong way
        //  n is 20  m is 30
//        n = m;// n is 30
////        m = n;// m is 30
//        System.out.println("n = " + n);
//        System.out.println("m = " + m);
        // n is 20  m is 30
        n = n + m;// n is 50   m is 30
        m = n - m;// 50-30   m is 20   n still 50
        n = n - m;// 50-20    n is 30
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int first = 10;
        int second = 5;
        int third = first;// third is 10
        first = second;//  first is 5
        second = third;// second is 10 now
        System.out.println("first = " + first);
        System.out.println("second = " + second);


    }

}
