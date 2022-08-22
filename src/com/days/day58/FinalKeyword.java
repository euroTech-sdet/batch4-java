package com.days.day58;

public class FinalKeyword {


    final double PI = 3.14;

    final String whoIsRight ;

    final double dbl = 2.32324232;

    {
        whoIsRight= "My Wife";
    }

    public FinalKeyword() {
      //  whoIsRight= "My Wife";
    }

    public void test() {
    //    dbl = 2.0;

        //  PI= 2.0; ERROR!
//        whoIsRight  = "My wife"; ERROR!
    }

    public static void main(String[] args) {

        final int ID_NUMBER;
        ID_NUMBER = 1001;

        System.out.println("ID_NUMBER = " + ID_NUMBER);
    }


}
