package com.days.day22;

public class Return4 {
    public static void main(String[] args) {

        sumCheck(30, 80);

    }
    // i will create a method and i will get two numbers will check sum of these numbers
    // if sum is bigger than 100 will return true else return false


    public static boolean sumCheck(int a, int b) {
        if ((a + b) > 100) {
            return true;
            //   int num = 20;  after return i cant write any code this line will be unreacheable
        } else if ((a + b) == 100) {
            return false;
        } else {
            return false;
        }
    }

    public static boolean resultCheck(int a, int b) {
        boolean result;
        if ((a + b) > 100) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean sumOver100(int a, int b) {
        boolean result = ((a + b) > 100) ? true : false;
//        if ((a + b) > 100) {
//            result = true;
//        } else {
//
//        }
//        return false;
        return result;
    }


}
