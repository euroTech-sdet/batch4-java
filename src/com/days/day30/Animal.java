package com.days.day30;

public class Animal {
    int age;
    String color;
    boolean isFlying;
    boolean isRunning;
    static int number;
    boolean hasWing;
    String name;
    static int animalNumber;

    Animal() {

        animalNumber++;
        System.out.println("animal number is "+ animalNumber);

    }


    public void moving() {
        if (hasWing) {
            System.out.println(name + " is flying");
        } else if (isRunning) {
            System.out.println(name + " is running ");
        } else {
            System.out.println(name + " walking");
        }

    }

    public void eating() {

    }


}
