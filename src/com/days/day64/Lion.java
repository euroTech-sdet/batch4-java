package com.days.day64;

public class Lion extends  AnimalInfo{

    Lion(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println("Lions run slow.");
    }

    @Override
    public void eat() {
        System.out.println("Lions eat meat.");
    }
}
