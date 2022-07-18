package com.days.day45;

import java.util.ArrayList;
import java.util.Collections;

public class Review2 {
    public static void main(String[] args) {
        ArrayList<Integer> cities = new ArrayList<>();
        cities.size();// length of the arraylist
        cities.add(5);// to add an element to arraylist
        cities.add(15);// to add an element to arraylist
        cities.add(10);
        cities.add(0, 20);// no removing any value from list
        cities.set(0, 10);//we replace the value of an element
        cities.indexOf(10);// gives first index of a value
        cities.lastIndexOf(10);// last index of value
        System.out.println("cities = " + cities);
        cities.remove(2);// removes an element that you give index
        System.out.println("cities = " + cities);
        cities.get(0);// brings the element given index
        cities.forEach(System.out::println);// will print all elements
        Collections.sort(cities);
        System.out.println("cities = " + cities);
        Collections.reverse(cities);
        System.out.println(cities);
        cities.contains(10);// returns boolean value
        System.out.println("cities.contains(50) = " + cities.contains(50));
        cities.clear();// removes all the elements
        System.out.println("cities = " + cities);



    }
}
