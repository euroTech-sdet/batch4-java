package com.days.day69;

import java.util.ArrayList;

public class GenericMethods {
    public static void main(String[] args) {

        GenericMethods.print(55);
        GenericMethods.print("Hello Java");
        GenericMethods.print(88.88);
        GenericMethods.print('c');

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Oslo");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        printList(numbers);
        printList(cities);
    }


    public static <anyType> void print(anyType a) {
        System.out.println(a);
    }

    public static void printList(ArrayList<?> list) {
        System.out.println("list = " + list);
    }

}
