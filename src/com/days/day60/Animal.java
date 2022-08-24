package com.days.day60;

public abstract class Animal {


    String color;
    int age;
    String name;

    Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void eating() {
        System.out.println(name + " eating.");
    }

    public abstract void makeSound();

    public abstract void moving();


}
