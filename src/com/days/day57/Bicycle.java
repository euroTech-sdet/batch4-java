package com.days.day57;

public class Bicycle {

    protected String color;
    public int speed;
    int gear;
    private int value;

    public Bicycle(int firstSpeed, int firstGear, String color) {
        System.out.println("super class constructor executed");
        this.color = color;
        this.speed = firstSpeed;
        gear = firstGear;
        value = 1000;
    }

    //  public protected default private
    protected void moving() {
        System.out.println("bicycle is going");
    }

    public void brakes() {
        System.out.println("bicycle is slowing.");
    }

    public void increaseTheSpeed() {
        speed = speed + 10;
        gear = gear + 2;
        currentSpeed();
    }

    public void currentSpeed() {
        System.out.println("speed = " + speed);
        System.out.println("gear = " + gear);
    }

    public void hello() {
        System.out.println("helloooo!!!");
    }

    public int getValue() {
        System.out.println("value = " + value);
        return value;
    }
}
