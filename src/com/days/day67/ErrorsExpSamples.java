package com.days.day67;

public class ErrorsExpSamples {


    public static void main(String[] args)  {



        System.out.println("First Line ");
        System.out.println(1 / 0);

        System.out.println("Last Line");
//        Throwable
//        Error
//        Exception


        ///////////////// NumberFormatException ////////////////

//        System.out.println(Integer.valueOf("ABC"));


        //////////  StringIndexOutOfBoundsException  //////

        String str= "";

  //      System.out.println(str.substring(0,2));


        /////////   ArrayIndexOutOfBoundsException   /////

        String[] strArray= {"test"};

       // System.out.println("strArray[0] = " + strArray[0]);
       // System.out.println("strArray[1] = " + strArray[1]);




        ////////////   NullPointerException   ////////////

        String[] strArray2= null;


    //    System.out.println("strArray2[0] = " + strArray2[0]);

      //  throw new LinkageError(); created manualy error!!

      //  System.out.println(" END OF THE MAIN METHOD");

    }
}
