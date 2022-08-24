package com.days.day60;

public class Dog extends Animal{


    Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        System.out.println(name+ " is barking.");
    }

    @Override
    public void moving() {
        System.out.println(name +" is running.");
    }


}
