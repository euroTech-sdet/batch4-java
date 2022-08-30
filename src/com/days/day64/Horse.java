package com.days.day64;

public class Horse extends AnimalInfo {


    Horse(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Horses may run very fast");
    }

    @Override
    public void eat() {
        System.out.println("horses may eat grass.");
    }
}
