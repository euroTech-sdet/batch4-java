package com.days.day44;

import java.util.ArrayList;

public class ArrayLists2 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Oslo");
        cities.add("London");
        cities.add("Roma");
        System.out.println("cities = " + cities);
        System.out.println("cities.size() = " + cities.size());
        cities.add(0, "Madrid");
        System.out.println("cities = " + cities);
        System.out.println("cities.get(0) = " + cities.get(0));
        System.out.println("cities.indexOf(\"Oslo\") = " + cities.indexOf("Oslo"));
        cities.add(0, "Hamburg");
        System.out.println("cities.indexOf(\"Oslo\") = " + cities.indexOf("Oslo"));
        cities.add("Madrid");
        System.out.println("cities = " + cities);
        System.out.println("cities.indexOf(\"Madrid\") = " + cities.indexOf("Madrid"));
        System.out.println("cities.lastIndexOf(\"Madrid\") = " + cities.lastIndexOf("Madrid"));
        firstIndexOfElement(cities, "Madrid");
        lastIndexOfElement(cities, "Madrid");
        cities.add(0, "Roma");
        firstIndexOfElement(cities, "Roma");
        lastIndexOfElement(cities, "Roma");
        System.out.println("cities.indexOf(\"Roma\") = " + cities.indexOf("Roma"));
        System.out.println("cities.lastIndexOf(\"Roma\") = " + cities.lastIndexOf("Roma"));
    }

    public static int firstIndexOfElement(ArrayList<String> list, String value) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
        return index;
    }

    public static int lastIndexOfElement(ArrayList<String> list, String value) {
        int index = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(value)) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
        return index;
    }

    public void training() {

        System.out.println("hello from arraylist 2 class");
    }
}
