package com.days.day39;

import java.util.Arrays;

public class Clubs {
    public static void main(String[] args) {
        String[] actualClubs = {"Real Madrid", "HerthaBerlin", "Sporting Lisbon", "Sparta Praque", "Spartak Moscova"};
        // how to get cities from clubs array
        // compare the values with cities array
        String[] expectedCities = {"Madrid", "Berlin", "Lisbon", "Praque", "Moscova"};
//        String club = "Werder,Bredmen,Werder,Bremen";
////                     W rd r,Br dm n,W rd r,Br m n
//        //            'Wer' 'er Bre' 'men'
//        String[] ds = club.split("e");
//            System.out.println("Arrays.toString(ds) = " + Arrays.toString(ds));

        String[] cities = new String[actualClubs.length];

        for (int i = 0; i < actualClubs.length; i++) {
            String[] s = actualClubs[i].split(" ");
            cities[i] = s[1];
            //    System.out.println(actualClubs[i].split(" ")[1].equals(expectedCities[i]));  first solution
        }
        System.out.println("Arrays.toString(cities) = " + Arrays.toString(cities));
        System.out.println("Arrays.equals(cities,expectedCities) = " + Arrays.equals(cities, expectedCities));


    }
}
