package com.days.day44;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists3 {
    public static void main(String[] args) {
        ArrayList<String> clubs = new ArrayList<>();
        clubs.add("Manchester City");
        clubs.add("Bayern Munich");
        clubs.add("Barcelona");
        clubs.add("Sporting Lisbon");
        clubs.add("Sporting Lisbon");
        clubs.add("Sporting Lisbon");
        clubs.add("Lyon");
        clubs.add("Barcelona");
        System.out.println("clubs.get(0).toUpperCase() = " + clubs.get(0).toUpperCase());
        System.out.println("clubs = " + clubs);
        System.out.println("clubs.get(clubs.size()) = " + clubs.get(clubs.size() - 1));
        // object is a member of the class
        // each element of this arraylist is an object
        // in this arraylist each element is member of String class
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<ArrayLists2> listFromOurClass = new ArrayList<>();
        ArrayLists2 anyname = new ArrayLists2();// we are creating an object from ArrayList2 class
        listFromOurClass.add(anyname);
        listFromOurClass.get(0).training();

    }
}
