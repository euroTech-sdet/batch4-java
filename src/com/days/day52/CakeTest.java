package com.days.day52;

public class CakeTest {
    public static void main(String[] args) {
        String cake1=CakeShop.buyCake("Pineapple");
        System.out.println("cake1 = " + cake1);
        System.out.println("CakeShop = " + CakeShop.buyCake("cherry"));
        System.out.println("CakeShop.cakes = " + CakeShop.cakes);
        System.out.println("CakeShop.soldCakeNumber = " + CakeShop.soldCakeNumber);

    }
}
