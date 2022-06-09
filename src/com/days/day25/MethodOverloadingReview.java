package com.days.day25;

public class MethodOverloadingReview {

    public static void main(String[] args) {
//dsadasd
        //sada

        sum(1, 2);

        short a = 1;
        long b = 2;
        double c = 3;
        float d = 4f;

        switch (a) {  // cant use b,c,d
            case 1:
                System.out.println("case1 true");
                break;
            case 2:
                System.out.println("case 2 true");
                break;
        }
    }


    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }


    public static void main(int[] args) {


    }

}
