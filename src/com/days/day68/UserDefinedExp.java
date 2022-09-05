package com.days.day68;

import java.sql.SQLException;

public class UserDefinedExp {


    public static void main(String[] args) {

        System.out.println("All good!!");
       // System.out.println(10/0);
//       throw new ArithmeticException();  // we are creating an exp obj and throw it !!

      //System.out.println("End of the Code"); //UNREACHABLE STATEMENT!!

//        ArithmeticException e = new ArithmeticException();
//
//        throw  e;

        ///////////////////////////////////////////////

        boolean appCondition= true;
        if (appCondition){

            try {
                throw new Batch4Exception(404); // User def exceptions are CHECKED TYPE exceptions!!! so we have to handle them !!!
            } catch (Batch4Exception e) {
                // type some statement according to your purpose !!!
                System.out.println(e);
            }


        }




    }


}

class Batch4Exception extends Exception {

    int number;

    public Batch4Exception(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Exception number is " +number;
    }
}