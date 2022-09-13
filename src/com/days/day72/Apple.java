package com.days.day72;

public class Apple extends Fruit {

    Apple() {
        this.name = "Apple";
    }

    @Override
    public void spoiling() {
        System.out.println("in a warm room " + name + "  will be spoiled.");
    }

}

class FruitTest {

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        apple1.name = "Golden apple";
        apple1.spoiling();
        apple1.growing();
        Apple apple2 = new Apple();
        apple2.spoiling();

    }
}

