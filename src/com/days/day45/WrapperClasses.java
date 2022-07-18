package com.days.day45;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer number = new Integer(3);
        Integer number2 = new Integer('A');

        for (char ch = 'A'; ch < 'z'; ch++) {

            System.out.printf(ch+"  " );

        }
        System.out.println();

        for (int ch = 'A'; ch < 'z'; ch++) {

            System.out.printf("%d ", ch);
        }
    }
}
