package com.days.day62;

public abstract class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
        System.out.println("vehicle created");
    }


    public abstract void moving();


    public void increaseSpeed() {
        System.out.println("you are going fast");
    }


}
