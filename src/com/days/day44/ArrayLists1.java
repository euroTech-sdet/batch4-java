package com.days.day44;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
       // numbers.add(5, 20);
        System.out.println("numbers = " + numbers);
        String[] words = {"hello", "world"};
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> fromArray = new ArrayList<>(Arrays.asList(words));
        char[] characters = {'h', 'e', 'l', 'l', 'o'};
        String fromArrayString = new String(characters);// sequence of the characters
        System.out.println("fromArrayString = " + fromArrayString);



    }
}
