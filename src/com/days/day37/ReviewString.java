package com.days.day37;

public class ReviewString {
    public static void main(String[] args) {


        String name = new String("Hello");
        String num = "Hello";
        name = "Hello";


        System.out.println("name == num = " + (name == num));

//        A

        char a = 'A';
        int numa = a;
        System.out.println((int) a);
        System.out.println("numa = " + numa);


        String str1 = "bla";
        String str2 = "lala";
        String str3 = str1 + (str2);


        String str4 = "  Test  bla  bla  Cool  ";

        str4 = str4.replace("bla", "really");

        System.out.println("str4 = " + str4);


        //str4.substring()

        System.out.println(str4.toUpperCase());
        str4 = str4.toUpperCase();
        System.out.println("str4 = " + str4);

        System.out.println(str4.trim());
        System.out.println("str4 = " + str4);

        str3 = " Hello ";
        str4 = "Hello";

        System.out.println(str3.trim().equals(str4)); // True
        System.out.println(str3.equals(str4)); // False


        // 1-48 of 264 results for

        // RETURN ME RESULT COUNT!!

        String str = "1-4 of 26 results for";
        int startCount = str.indexOf("f") + 2;
        int endCount = str.indexOf("r") - 1;
        String counter = str.substring(startCount, endCount);
        System.out.println("Counter = " + counter);


        // " I told BAD words"   //BAD

        str = " I told BAD words lots of BAD words";

        str = str.replace(" BAD", "");
        //  str = str.replace(".BAD", "");

        System.out.println("str = " + str);

        //TASK
        // "30620222053t_Teeestt.invoce"   , "test_30620222054.csv" , "T3062022_test2052.txt"
        // according to this 3 type of data return me TIMESTAMP numbers as a String
        // in inputs, alph chars can change, numbers lenght can change!!
        // ie: "306020222053t_Teeestt.invoce" -> "306020222054t_Testt.invoce"
        //        return "306020222053"                   return: "306020222053"

        // There is no any number in file name beside data/time stamp!!
        //        input: "test_306020222054.csv"
        //        output: "306020222054"


    }
}
