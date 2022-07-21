package com.days.day49;

public class ABC {

    int a;
    private int b;
    String c;

    ABC() {

    }

    ABC(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void callAMethodFromOtherClass(int num, int num1) {
        Add ad = new Add();
        ad.getSum(num, num1);
    }

    public void toString1() {
        System.out.println("a=" + a + ", b=" + b + ", c='" + c + '\'' + '}');
    }
}
