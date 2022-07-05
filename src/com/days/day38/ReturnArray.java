package com.days.day38;

public class ReturnArray {
    public static void main(String[] args) {
        String[] nbaClubs = {"Chicago Bulls", "Miami heat", "Golden State Warriors", "Orlando Magic"};
        for (String club : nbaClubs) {
//            System.out.println("club = " + club);
        }
//        System.out.println("nbaClubs[0].substring(0,9) = " + nbaClubs[0].substring(0, 7));
//        System.out.println("nbaClubs[1].toUpperCase() = " + nbaClubs[1].toUpperCase());

        String[] someThing = theFirst3Letter(nbaClubs);
        System.out.println("someThing[0] = " + someThing[0]);//Chi
        System.out.println("someThing[1] = " + someThing[1]);//Mia

        String[] fruits = {"orange", "melon", "cherry", "apple", "strawberry", "lemon"};
        String[] returnFruits = theFirst3Letter(fruits);
        System.out.println("returnFruits[0] = " + returnFruits[0]);
        System.out.println("returnFruits[1] = " + returnFruits[1]);


    }
    // i will get a string array and will return a new  string array with each of 3 letter

    public static String[] theFirst3Letter(String[] arr) {
        String[] first3 = new String[arr.length];// creating new array
        for (int i = 0; i < arr.length; i++) {
            first3[i] = arr[i].substring(0, 3);// the first 3 letter of each element
        }
        return first3;
    }
}
