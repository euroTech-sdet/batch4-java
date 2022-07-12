package com.days.day43;

public class Wrapper2 {

    public static void main(String[] args) {



        Integer i1= Integer.valueOf(11);

        int i2= i1.intValue();

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        Double d1= Double.valueOf(5.99);

        int i3= d1.intValue();

        double d2= d1.intValue();

        int i4= (int)d2;

        int i5= (int)(i1.doubleValue());

        System.out.println("i3 = " + i3);
        System.out.println("d2 = " + d2);


        System.out.println("\n/////////////////////////////\n");
        int i6 = 11;
//        Integer i7 = 11;
        Integer i7 = i6;   // Auto boxing!!!

        int i8= i7;   // Unboxing!!!   Wrapper inst to primitive!!


    }
}
