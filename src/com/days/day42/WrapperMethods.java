package com.days.day42;

public class WrapperMethods {


    public static void main(String[] args) {
        
        Byte b1 = Byte.MIN_VALUE;

        System.out.println("b1 = " + b1);

        System.out.println("BYTE.MAX_VALUE +1 = " + (Byte.MAX_VALUE+1));

        b1=(byte)(Byte.MAX_VALUE+1);
        System.out.println("b1 = " + b1);


        System.out.println("\n/////////////////////////////////////////\n");

        System.out.println("Character.isAlphabetic('A') = " + Character.isAlphabetic('A'));
        System.out.println("Character.isAlphabetic(65) = " + Character.isAlphabetic(65));


        System.out.println("Character.isAlphabetic(43) = " + Character.isAlphabetic(43));

        System.out.println("Character.isDigit(48) = " + Character.isDigit(48));
        System.out.println("Character.isDigit('0') = " + Character.isDigit('0'));
        System.out.println("Character.isDigit('65') = " + Character.isDigit(65));


        System.out.println("Character.isLetter(65) = " + Character.isLetter(65));


        System.out.println("\n/////////////////////////////////////////\n");


        Integer i1 = Integer.valueOf("1");

        System.out.println("(i1 instanceof Integer) = " + (i1 instanceof Integer));
        System.out.println("(i1 instanceof Double) = " + (i1  instanceof Integer));


        WrapperMethods obj = null; //new WrapperMethods();

        System.out.println("(obj instanceof  WrapperMethods) = " + (obj instanceof WrapperMethods)); // FALSE!!!
    }

}
