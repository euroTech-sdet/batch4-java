package com.days.day51;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaShop {

    static ArrayList<String> pizzaKinds = new ArrayList<>(Arrays.asList("Cheese Pizza", "Veggie Pizza", "Pepperoni Pizza",
            "Margherita Pizza"));
    static int totalSoldPizza;// how many pizza sold in this shop


       public static String buyPizza(int index) {
        totalSoldPizza++;
        if (index < pizzaKinds.size() && index >= 0) {
            return pizzaKinds.get(index);
        } else {
            return pizzaKinds.get(0);
        }
    }



}
