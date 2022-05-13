package com.days.day9;

public class UnaryOperators {
    public static void main(String[] args) {
        int sum = 5 + 20;       //  5 ,20 operands      +=  operators

        System.out.println(sum);
        sum++;
        System.out.println("sum = " + sum);//26
        ++sum;//27
        System.out.println("sum = " + sum);
        int num = sum;// 27
        int num2 = ++sum;// 28
        System.out.println("num2 = " + num2);
        System.out.println("sum = " + sum);
        int num3 = sum++;// 28
        System.out.println("num3 = " + num3);
        System.out.println("sum = " + sum);// 29
        System.out.println("sum = " + sum++);//
        System.out.println("sum = " + sum);// 30

        int a = 30;
        int b = a--;// a will be 29
        System.out.println("b = " + b);//30
        System.out.println("a = " + a);//29
        System.out.println("a = " + --a);//28
        System.out.println("a = " + a--);
        System.out.println("a = " + a);// 27
        System.out.println("b = " + b);// 30


        int c = +50;
        int d = -50;
        System.out.println(c + d);

        int e = 50;
        e++;// 50 + 1
        e--;// 50 - 1

        boolean real = true;
        System.out.println("real = " + real);
        boolean real2 = !real;
        System.out.println("real2 = " + real2);
        boolean real3 = !true;
        System.out.println("real3 = " + real3);
        real3 = real;
        System.out.println("real3 = " + real3);
        boolean real4 = !false;
        System.out.println("real4 = " + real4);


        int r = 6;    // declaration and assignment
        System.out.println("r=: " + r++);//  will print 6  then will increase so after
        // that line value of r will be 7
        System.out.println("r=: " + r);// 7
        int x = 6;
        System.out.println("x=: " + x-- + " x = " + x);//  stores 6 and decreases the value
        System.out.println("x=: " + x);// 5
        int y = 6;
        System.out.println("y=: " + ++y);// increments the value then stores the value 7
        int p = 6;
        System.out.println("p=: " + --p);// decreases the value and then stores it 6-1=5
        System.out.println("p " + p++);//  p=5   prints 5  after that increases the value +1 p=6
        System.out.println("p " + p);// p = 6


    }
}
