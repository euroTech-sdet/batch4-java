package com.days.day41;

import java.util.Arrays;

public class ReviewWeek11 {


    public static void main(String[] args) {

//        String [] test= {"1,2,3",4};  Use same data type!!

        String [] cars = {"Volvo", "Opel", "Mazda"};

        String [] oldCars = {"ABC", "Ford"};

        cars = oldCars ;

        System.out.println("Arrays.toString(cars) = " + Arrays.toString(cars));


        System.out.println("/////////////////");


        // itar -- it will create auto for loop with index !!

        for (int i = 0; i < oldCars.length; i++) {
            String oldCar = oldCars[i];

        }

        // iter -- will create auto for-each loop for given data container!!

        for (String car : cars) {

        }

        System.out.println("returnArray(cars) = " + Arrays.toString(returnArray(cars)));


    }



    // return Arrays in methods

    public static int[] returnArray(int[] numbers){
        int[] test= {1,2,3};
        return test;
//        return {1,2,3};  DO NOT return value statement without complete dec and inti!!

    }


    public static String[] returnArray(String[]numbers) {

        return new String[]{numbers[1]};

    }




}
