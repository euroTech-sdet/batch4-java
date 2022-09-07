package com.days.day69;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TelephoneNotebook {
    //  ronaldo     123456789
    // benzema      234567890
    // michael      012345678

    static Map<String, Integer> phoneNumbers = new LinkedHashMap<>();

    public static void addNumber(String name, int number) {
        phoneNumbers.put(name, number);
    }

    public static int giveMeNumberOfThe(String name) {
        return phoneNumbers.get(name);
    }

    public static int howManyPersonInTheNotebook() {
        return phoneNumbers.size();
    }

    public static String giveMeNaeOftheNumber(int number) {
        // how can i find the name who has this number?
        int count = 0;
        for (int i : phoneNumbers.values()) {
            count++;
            if (i == number) {
                break;
            }
        }
        int n = 0;
        String name = "";
        for (String nm : phoneNumbers.keySet()) {
            n++;
            if (n == count) {
                name = nm;
            }

        }
        System.out.println(count);
        System.out.println(name);
        return name;
    }


}
