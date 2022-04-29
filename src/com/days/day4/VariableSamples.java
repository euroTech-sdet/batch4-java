package com.days.day4;

public class VariableSamples {


    public static void main(String[] args) {

        // DECLARATION!!!
        byte hour;

        short schoolNumber;

        int phoneNumber;

        long cardNumber;

        char dot;

        boolean isItTrue;




        // ASSIGN A VALUE!!!
//ctrl + ALT + L --> Reformat code

        int numberOfStudent = 10;
        // we declared a VARIABLE (data type= int,name= numberOfStudent )
        // then we assign 10 to this variable!!

        System.out.println(numberOfStudent);

        numberOfStudent = 20;
        // reassign a value to existing int type our variable!!!
        System.out.println(numberOfStudent);

        ///////////////////////////////////////////////////////////

        // STATIC WAY -->  System.out.println("Number od student is 10 " );

        // DYNAMIC WAY -->
        System.out.println("Number of student is " + numberOfStudent);


////////////////////////////////////////////////////

        int number = 1;

       // int number = 100; //  MISTAKE!!! DO NOT declaration again with same var NAME!!

////////////////////////////////////////////////////


        double pi=2.3 , convRate, temp= 222.2;
        int numberOfTeacher;


////////////////////////////////////////////////////


        int test = -2147483647;

        short test2= -32767;

        System.out.println(test);


///////////////////////////////////////////////////

        // Default Values

        System.out.println(10.0);

        long longValue = 1234_5678_9010_8999L;

        float floatValue= 10.0f;

        System.out.println(floatValue);

///////////////////////////////////////////////////


        float num1 = 1.0f;

        //int aaaa = 1.0; NOOOOOO!!

        byte aa =1;

        double num2 = 12.4;

        num1 = -100 ;

        System.out.println(num1);


        //////////////////////////


        int number1= 10;

        int number2 = number1;

        number1 = 15;

        System.out.println(number2);  // 10!!!!


        ////////////////////////////////////

        double speed = 200;
        double time = 5;

        double distance = speed * time;

        System.out.println("Distance is " + distance);



    }

}
