package com.days.day43;

import java.util.Arrays;

public class WrapperParsing {


    public static void main(String[] args) {

        Integer i2 = Integer.valueOf(11);// unnecessary boxing !! assign 11 directly to object --> Auto-boxing

        String str= "1001";

        Integer i1 = Integer.valueOf(str);

        //i1= Integer.parseInt(str); // same with valueOf

        int i3= Integer.valueOf(str);  // unboxing


        System.out.println("i3 = " + i3);
        System.out.println("i1 = " + i1);

        System.out.println("\n/////////////////////////////\n");

        str= "1001.9";


        Double d1= Double.valueOf(str);
        System.out.println("d1 = " + d1);

//        i1 = Integer.valueOf(str); // throws Exception NumberFormatException
//        i3= Integer.valueOf(str); // throws Exception NumberFormatException
//
//        System.out.println("i3 = " + i3);
//        System.out.println("i1 = " + i1);


        str= "111a";

//        i1 = Integer.valueOf(str);  throws Exception NumberFormatException
//        System.out.println("i1 = " + i1);

        str= "1-16111 of over 19,123,111 results for";
        System.out.println("getResult(str) = " + getResult(str));


        System.out.println("\n/////////////////////////////\n");


        // NUMBER TO STRING PARSING :

        Integer intObj= Integer.valueOf(11);

        Double dblObj= Double.valueOf(11.1);

        String strObj = String.valueOf(intObj);
        String strObj2 = intObj.toString();
        String strObj3 = intObj + "";

        String strObj4 = String.valueOf(dblObj);
        String strObj5 = dblObj.toString();
        String strObj6 = dblObj + "";


        System.out.println("strObj = " + strObj);
        System.out.println("strObj2 = " + strObj2);
        System.out.println("strObj3 = " + strObj3);

        System.out.println("strObj4 = " + strObj4);
        System.out.println("strObj5 = " + strObj5);
        System.out.println("strObj6 = " + strObj6);

        System.out.println("\n/////////////////////////////\n");

        // EX
        Boolean flag= Boolean.valueOf("true");

        // boolean to String Parsing
        String ss = flag.toString();
        System.out.println("ss = " + ss);

        ss = String.valueOf(flag);
        System.out.println("ss = " + ss);

        ss = flag + "";
        System.out.println("ss = " + ss);


    }






    // String str= "1-16111 of over 19,123,111 results for"  return result value as Integer 9123!!
    public static Integer getResult(String input) {

        int start = input.indexOf("r") + 2;
        int end = input.indexOf("results") - 1;

        String rowResult = input.substring(start, end);

        String result = rowResult.replace(",", "");

        // str = "Total invoice-1: £19,123,111.88"
        // str = "Total invoice-2: £1,123,111.28"
//         result = rowResult.replace(".", ""); dont use it for money!! use double to get it!!
//         result = rowResult.replace("£", "");
//        for (String s : rowResult.split("")) {
//            if(Character.isDigit()){
//        save them in result one by
//    }
//        }

        return Integer.valueOf(result);
    }
}
