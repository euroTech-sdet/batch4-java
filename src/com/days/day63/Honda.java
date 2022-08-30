package com.days.day63;

public class Honda extends Car {


    Honda(String model, int productionYer, String color, double carValue, int km) {
        super(model, productionYer, color, carValue, km);
    }

    @Override
    public void paintTheCar(String color) {
        System.out.println("Honda " + model + " is being painted to " + color);
        this.color = color;
    }



}
