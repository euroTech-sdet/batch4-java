package com.days.day52;

import java.util.ArrayList;
import java.util.Arrays;

public class CakeShop {

    static ArrayList<String> cakes;
    static int soldCakeNumber;

    static {
        cakes = new ArrayList<>(Arrays.asList("Pound Cake", "Pineapple Cake", "Sponge Cake", "Biscuit Cake", "Apple Cake"));
        cakes.add("Chocolate cake");
    }

    // buyCake

    public static String buyCake(String str) {
        soldCakeNumber++;
        switch (str) {
            case "Pound":
                return cakes.get(0);
            case "Pineapple":
                return cakes.get(1);
            case "Sponge":
                return cakes.get(2);
            case "Biscuit":
                return cakes.get(3);
            case "Apple":
                return cakes.get(4);
            default:
                return cakes.get(5);
        }
    }

}
