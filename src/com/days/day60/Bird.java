package com.days.day60;

public class Bird extends Animal {


    Bird(String name, String color) {
        super(name, color);
    }



    public void eating() {
        System.out.println(name + " drinking");
    }
    @Override
    public void moving() {
        System.out.println(name + " is flying in the sky.");
    }

    public void makeSound() {

        System.out.println(name+" is twittering.");

    }
}
