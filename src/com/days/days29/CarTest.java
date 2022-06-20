package com.days.days29;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Corolla";
        myCar.year = 2010;
        myCar.color = "White";
        myCar.plateNumber = 123456;
        Car yourCar = new Car();
        yourCar.model = "Rav4";
        yourCar.plateNumber = 654332;
        yourCar.year = 2020;
        yourCar.color = "Black";
        myCar.carInfo();
        yourCar.carInfo();




    }
}
