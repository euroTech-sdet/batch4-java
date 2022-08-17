package com.days.day54;

import com.days.day54.Task1.Car;
import com.days.day54.Task1.Plane;

public class VehicleTest {


    public static void main(String[] args) {

        Car car1 = new Car();

        car1.name= "Niro";
        car1.doorNumber = 5;
        car1.seats = 5;
        car1.brand= "Kia";
        car1.tireSize= 16;

        car1.bigBossName = "bla";

        System.out.println("car1 name = " + car1.name);

        System.out.println("\n//////////////////////////////////\n");

        Car car2 = new Car();

        car2.name = "CX30";
        car2.doorNumber = 3;
        car2.seats = 4;
        car2.brand= "Mazda";
        car2.tireSize= 17;

        Plane plane1 = new Plane();

        plane1.name = "C132";




    }
}
