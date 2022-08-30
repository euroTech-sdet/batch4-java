package com.days.day63;

public class BMW extends Car {


    BMW(String model, int productionYer, String color, double carValue, int km) {
        super(model, productionYer, color, carValue, km);

    }

    @Override
    public void paintTheCar(String color) {
        System.out.println("BMW can not be painted after production so the color still same");
    }
}
