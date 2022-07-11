package com.days.day42;

public class WrapperClasses {

    public static void main(String[] args) {


        Integer intObj = new Integer(1);
        Integer intObj2 = new Integer("1");

        Integer intObj3 = Integer.valueOf(intObj2);

        System.out.println(intObj);

        String value = "1";
        Integer strInt = Integer.valueOf(value);

        System.out.println("strInt = " + strInt);

        System.out.println("(value+value) = " + (value + value));

        System.out.println("strInt+strInt = " + (strInt + strInt));


        System.out.println("/////////////////////////////////////////");
        int intPrmtv = 1;
//        intPrmtv= value; NO Error
        intPrmtv = Integer.valueOf(value);  // Primitive !!!

        System.out.println("intPrmtv = " + intPrmtv);
        System.out.println("(intPrmtv+intPrmtv) = " + (intPrmtv + intPrmtv));


        Integer obj = 1;


        //


//        Character charObj = new Character("a"); ERROR!!!
//        Character charObj = Character.valueOf("a"); ERROR!! USE onl char as parameter.


        Byte byteObj = new Byte((byte) 126); // have to cast !!!
        byte bytePrmtv = 126;
        Byte byteObj2 = 126;


        Long longObj = new Long(126);


        Double dblObj = new Double(11.1);
        Double dblObj2 = Double.valueOf(11.1);

        System.out.println("\n/////////////////////////////////////////\n");

        char charPrmtv = 'a';
        char charPrmtv2 = 97;

        System.out.println("charPrmtv = " + charPrmtv);
        System.out.println("charPrmtv2 = " + charPrmtv2);

        Character charObj2 = Character.valueOf((char) 97);

        System.out.println("charObj2 = " + charObj2);


        Float fltObj = 11.1f;
        Float fltObj2 = new Float(11.1);
        Float fltObj3 = Float.valueOf((float) 11.1);  // or 11.1f
        Float fltObj4 = Float.valueOf("11.1");

        System.out.println("fltObj4 = " + fltObj4);

        System.out.println("\n/////////////////////////////////////////\n");

//        Integer i1= Integer.valueOf("1a");  // throws exception: NumberFormatException

        System.out.println("\n/////////////////////////////////////////\n");

        char c1 = 'A';
        System.out.println("(int)c1 = " + (int) c1);

        int i1= 'A';
        System.out.println("i1 = " + i1);

        Character C1 = 'A';
        System.out.println("C1 = " + (int)C1);

        Integer I1= (int)'A';

        System.out.println("I1 = " + I1);


        System.out.println(I1+i1);
        System.out.println(I1+I1); // Wrapper + Wrapper --> arithmetic opr.

        System.out.println("\n/////////////////////////////////////////\n");

        Character C3='A'; //65
        System.out.println("C3 = " + C3); // return the char

        System.out.println( C3 + C3 + C3 + "C3 + C3 = " ); //"195c3 + c3 = "
        System.out.println(C3+C3);

    }
}
