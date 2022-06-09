package com.days.day23;

public class Ascii {
    public static void main(String[] args) {
        //127   32 are not used 95 extend table 256
        for (char chr = 'A'; chr <= 'z'; chr++) {
            System.out.print(chr + "  ");
            int a = chr;
            System.out.println(a);
        }

        for (char c = 32; c <= 256; c++) {
            System.out.println("c = " + c);
        }
        int num = 'A';// 65
        System.out.println("num = " + num);
        int number = 'a';// A+32
        System.out.println("number = " + number);


    }
}
