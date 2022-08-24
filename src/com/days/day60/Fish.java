package com.days.day60;

public class Fish extends Animal {


    Fish(String name, String color) {
        super(name, color);
    }

    public void moving() {
        System.out.println(name + " diving to the deep ocean.");
    }

    public void makeSound() {
        System.out.println(name+" signing.");
    }
}
