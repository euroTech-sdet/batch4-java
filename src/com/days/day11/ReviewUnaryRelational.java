package com.days.day11;

public class ReviewUnaryRelational {

    public static void main(String[] args) {
        String s1= "1"; //hardcode!!

      //  System.out.println(s1++); ERROR use with numeric datatypes!!


        int actualData = 10;

        double expectedData= 10.0;

   //     System.out.println(actualData == expectedData);

        int actualData2= 9;
        System.out.println(actualData == actualData2); // TRUE !!  10.0 == 10.0
        //If either operand is of type double, the other is converted to double, before Widening primitive conversion

        System.out.println(10 != 9);

        System.out.println(10 > 9);
        System.out.println(10 >= 9);


        System.out.println(  4>2==2>=4 ); // FALSE

        int testSampleData = 100;

        testSampleData = testSampleData -50;

        testSampleData -= 50;

        testSampleData += 100;


    }
}
