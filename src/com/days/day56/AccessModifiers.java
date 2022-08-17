package com.days.day56;


import com.days.day52.Child;

import static com.days.day52.Child.*;

import java.util.*;


public class AccessModifiers {
    String name;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        Child child = new Child();
        child.print();
        writeSomething();
        readSomething();


    }
}
