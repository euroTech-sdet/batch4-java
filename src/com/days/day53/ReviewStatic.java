package com.days.day53;

    public class ReviewStatic {


    int num1; // instance variable

    static int count; // static variable - class var.

    static AccessTest test;


    public ReviewStatic(){
        System.out.println("count = " + count);
        count=2;
        test = new AccessTest();
    }

    public static void main(String[] args) {
        count=1;
//        System.out.println("num1 = " + num1);  ERROR!!! do not call non-static field in static context
    }

    public void test(int num1){
        this.num1=num1;
        this.count=2;

    }
}
