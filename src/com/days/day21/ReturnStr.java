package com.days.day21;

public class ReturnStr {
    public static void main(String[] args) {
        System.out.println(helloName("Ahmet"));// this method callling carries now Hello Ahmet
        String hello = helloName("Ali");// Hello Ali
        System.out.println("hello = " + hello);// Hello Ali
    }


    public static String helloName(String name) {// name="Ahmet
        String returningValue = "Hello " + name;// returningValue=Hello + Ahmet

        return returningValue;// Hello Ahmet
    }
}
