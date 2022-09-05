package com.days.day68;

import java.io.EOFException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class ExceptionHandlingSamples {


    public static void main(String[] args) {

        int actualData= 10;
        int expectedData= 0;
        String expectedMessage = null;
        int[]dbValues = {11,22,33};

        System.out.println("Before TRY block");

        try {

            System.out.println("Inside TRY block");
           // System.exit(11); or Errors -> in that case finally block will NOT run!!
            System.out.println(actualData/expectedData);  // Verification -1


        } catch (NoSuchElementException e){ // if catch didn't catch any exp, then catch block will be skipped

            e.printStackTrace(); // will be print end of RUN!!
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("Inside CATCH block");

        } finally {
            System.out.println("FINALLY Block");
            System.out.println("ROLL BACK Steps!! ");
        }
        System.out.println("After TRY block");



    }
}
