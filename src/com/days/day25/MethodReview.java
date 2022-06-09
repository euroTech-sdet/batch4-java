package com.days.day25;

public class MethodReview {


    public static void main(String[] args) {

        int number=5;
        double number2= 5.0;
        System.out.println("Before method");
        printHello();
        doublePrintHello();
        System.out.println("After method");

      printXtimeHello((int)number2);
      printXtimeRequestedValue((int)3.5, "Power of Dynamic Method!!!");
    }

    public static void doublePrintHello(){
        System.out.println("Beginning of double print method");
        printHello();
        System.out.println("Middle of double print method");
        printHello();
        System.out.println("End of double print method");
    }

    public static void printHello () {
        int localVar;
        System.out.println("Hello hello hello");
    }

    public static void printXtimeHello(int number ){
        int localVar;
        for (int i=0; i<number ; i++){
            System.out.println("Helloooo");
        }
    }

    public static void printXtimeRequestedValue(int x, String value){
        for (int i=0; i<x ; i++){
            System.out.println(value);
        }
    }


}
