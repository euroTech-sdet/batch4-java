package com.days.day31;

public class Cartest {

    public static void main(String[] args) {

        Garage myCar = new Garage();
        myCar.color = "Black";
        myCar.door = 2;
        myCar.speed = 100;
        myCar.year = 2000;
        myCar.brand = "Toyota";
        myCar.moving();
        Garage yourCar = new Garage();
        yourCar.brand = "Honda";
        yourCar.color = "Blue";
        yourCar.door = 4;
        yourCar.speed = 200;
        yourCar.year = 2020;
        yourCar.moving();


    }
}
