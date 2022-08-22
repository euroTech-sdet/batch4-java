package com.days.day58;

import com.days.day4.VariableSamples;

public final class VariableTypes extends abc {

    // Under class:
//    - Variable , Objects -> data fields
//    - Method and code blocks (instance and static) -> functions - behaviour

    int instanceSample; // Instance VARIABLE

   public static int count; // Static - global variable

    public static void  test(){

        int num1 = 0; // LOCAL VARIABLE
    }


    public static void main(String[] args) {
//        int num3= Integer.MAX_VALUE;// local variable
//        System.out.println(num3);
//
//        num3= 4;

//        test();

        VariableTypes obj = new VariableTypes();

        System.out.println("obj.count = " + obj.count);


//        System.out.println(num3);

        VariableTypes obj2 = new VariableTypes();
    }


    {  // instance block

        int intInstanceBlock= 2;
        System.out.println("Instance Block!!");
    }


    public void test2(){
        intInstance=3;

        System.out.println("instanceSample = " + instanceSample);
    }


    int intInstance;
}








class abc {

}

