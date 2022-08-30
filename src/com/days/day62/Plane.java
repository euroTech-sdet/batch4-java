package com.days.day62;

public class Plane extends Vehicle {
    Plane(String name) {
        super(name);
    }

    @Override
    public void moving() {
        System.out.println(name + " flying ");
    }
}
