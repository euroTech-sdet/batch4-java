package com.days.day51;

import java.util.Arrays;

public class PizzaTest {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.pizzaSlices = 5;
        Pizza pizza2 = new Pizza();
        pizza2.pizzaSlices = 7;
        Pizza pizza3 = new Pizza();
        pizza3.pizzaSlices = 10;
        System.out.println("pizza1.pizzaSlices = " + pizza1.pizzaSlices);
        pizza1.eating();// 4
        pizza1.eating();// 3
        System.out.println("pizza1.pizzaSlices = " + pizza1.pizzaSlices);// 3
        System.out.println("pizza2.pizzaSlices = " + pizza2.pizzaSlices);// 7
        System.out.println("pizza3.pizzaSlices = " + pizza3.pizzaSlices);//10
        pizza2.eating();// 6
        pizza3.eating();//9
        // how many slices are there for each pizza
        // family pizza is 16
        pizza3.eating();// 8
        pizza3.eating();// 7
        // family pizza is 14
        System.out.println("pizza1.pizzaSlices = " + pizza1.pizzaSlices);
        System.out.println("pizza2.pizzaSlices = " + pizza2.pizzaSlices);
        System.out.println("pizza3.pizzaSlices = " + pizza3.pizzaSlices);
        System.out.println("Pizza.familyPizzaSlices = " + Pizza.familyPizzaSlices);

        System.out.println("PizzaShop.buyPizza(0) = " + PizzaShop.buyPizza(0));
        System.out.println("PizzaShop.totalSoldPizza = " + PizzaShop.totalSoldPizza);
        System.out.println("PizzaShop.buyPizza(2) = " + PizzaShop.buyPizza(2));
        System.out.println("PizzaShop.totalSoldPizza = " + PizzaShop.totalSoldPizza);


    }


}
