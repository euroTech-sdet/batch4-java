package com.days.day49;

public class Test {
    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.a = 5;
        abc.c = "anyString";
        System.out.println("abc.a = " + abc.a);
        ABC ab = new ABC(9);
        ab.toString1();
        abc.toString1();
        ab.callAMethodFromOtherClass(10,20);
    }
}
