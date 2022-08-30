package com.days.day62;

public class Lorry extends Vehicle{


    Lorry(String name) {
        super(name);
    }

    @Override
    public void moving() {

        System.out.println("Lorry moving.");

    }
}
