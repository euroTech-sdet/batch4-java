package com.days.day56;


import com.days.day57.Bicycle;

public class FlyingBike extends Bicycle {

    FlyingBike(int startingSpeed, int startingGear, String color) {
        super(startingSpeed, startingGear, color);
        System.out.println("sub class constructor executed.");
    }

    public static void main(String[] args) {
        FlyingBike flyingBike = new FlyingBike(20, 5, "Blue");
        flyingBike.hello();
        System.out.println("flyingBike.color = " + flyingBike.color);
        System.out.println("flyingBike.speed = " + flyingBike.speed);
        flyingBike.getValue();
    }
}
