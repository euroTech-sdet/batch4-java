package com.days.day57;

public class BikeTest {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(5, 3, "Black");
        mountainBike.moving();
        System.out.println("mountainBike.color = " + mountainBike.color);
        System.out.println("mountainBike.speed = " + mountainBike.speed);
        mountainBike.increaseTheSpeed();


        CityBike cityBike = new CityBike(10, 5, "Blue");
        cityBike.currentSpeed();
        cityBike.turnOnTheLight();
        cityBike.moving();
        ChildBike childBike = new ChildBike(3, 1, "Blue");
        childBike.hello();


    }
}
