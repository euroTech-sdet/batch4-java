package com.days.day62;

public class Final {
    final static String schoolName = "London Central School";
    int number;

    public static void main(String[] args) {
        final int number = 10;
        System.out.println("number = " + number);
        Final fun = new Final();
        fun.number = 50;
        Final final2 = new Final();
        final2.number = 100;

    }

    public final void training() {
        System.out.println("schoolName = " + schoolName);
    }

    public static void callNumber() {
        System.out.println("schoolName = " + schoolName);
    }
}
