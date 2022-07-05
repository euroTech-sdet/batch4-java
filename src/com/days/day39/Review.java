package com.days.day39;

public class Review {
    public static void main(String[] args) {
        double[] numbers = new double[5];// length is 5
        numbers[0] = 2.2;// first index of array is 0
        numbers[4] = 2.2;// last index is 4
        System.out.println( numbers[0] == 4.0);
        System.out.println("numbers.length = " + numbers.length);
        numbers[numbers.length - 1] = 5.5;
        numbers[1] = 3.3;
        System.out.println("numbers[2] = " + numbers[2]);
        String[] cities = {"London", "Roma", "Oslo", "Istanbul", "Berlin"};
        //                    0         1       2        3          4
        System.out.println("cities[1] = " + cities[1]);
        System.out.println("cities[cities.length-1] = " + cities[cities.length - 1]);
        System.out.println("cities.length = " + cities.length);
        //    System.out.println("cities[5] = " + cities[5]);will get out of bound exception

        for (String city : cities) {

            System.out.print(" city = " + city);
        }
        System.out.println();

        for (int i = 2; i < cities.length; i++) {

            System.out.print(" city = " + cities[i]);


        }

        System.out.println();
        String text = "Hello Java";
        System.out.println("text.substring(0,5) = " + text.substring(0, 5));
        System.out.println("cities[0].substring  = " + cities[0].substring(0, 3));


    }
}
