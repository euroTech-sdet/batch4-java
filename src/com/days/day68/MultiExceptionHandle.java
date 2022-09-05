package com.days.day68;

public class MultiExceptionHandle {


    public static void main(String[] args) {

        int actualData = 10;
        int expectedData = 1;
        String expectedMessage = null;
        int[] dbValues = {11, 22, 33};

        System.out.println("Before TRY block");

        try {

            System.out.println("Inside TRY block");

            System.out.println(actualData / expectedData);        // Verification -1  -- Arithmetic

            System.out.println(expectedMessage.substring(1));  // Verification -2   -- NullPointerEx

            if (dbValues[3] == actualData) {                   // Verification -3    --ArrayOutB
                System.out.println(" Test Passed!!!");
            } else {
                System.out.println("Test FAIL!! Db values does not same with actual!!");
            }


        } catch (ArrayIndexOutOfBoundsException e) { // if catch didn't catch any exp, then catch block will be skipped

            e.printStackTrace(); // will be print end of RUN!!
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("Inside ArrayIndexOutOfBoundsException CATCH block");
            System.out.println("DB RESET and connect!!");
            System.out.println("RUN test again!!");

        } catch (NullPointerException e2) {
            e2.printStackTrace(); // will be print end of RUN!!
            System.out.println("e.getMessage() = " + e2.getMessage());
            System.out.println("Inside NullPointerException CATCH block");

        } catch (ArithmeticException e3) {
            e3.printStackTrace(); // will be print end of RUN!!
            System.out.println("e.getMessage() = " + e3.getMessage());
            System.out.println("Inside ArithmeticException CATCH block");


        }


        try {
            System.out.println(" Inside 2. try");
            System.out.println(actualData / expectedData);        // Verification -1  -- Arithmetic

            System.out.println(expectedMessage.substring(1));
        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
        }


        System.out.println("After TRY block");
    }
}
