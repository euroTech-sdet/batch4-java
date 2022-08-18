package com.days.day57;

public class CityBike extends Bicycle  {
    boolean light;

    CityBike(int startingSpeed, int startingGear, String color) {
        super(startingSpeed, startingGear, color);
        this.light = false;
    }

    public void turnOnTheLight() {
        light = true;
        super.hello();
        System.out.println("light is on. ");
    }


    public void moving() {
        System.out.println("bicycle is going through the buildings in the city centre.");
    }


}
