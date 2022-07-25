package com.days.day50;

public class Toyota {

    public static void main(String[] args) {

        Car toyota = new Car(2, 10000);
        toyota.color = "Black";
        toyota.model = "Corolla";
        //toyota.door = 4;
        Car car2 = new Car(5, 5000);
        car2.color = "Blue";
        car2.model = "Yaris";
        //  car2.door = 2;
        toyota.printInfo();
        car2.printInfo();
        System.out.println("toyota.speed = " + toyota.speed);
        System.out.println("toyota.gear = " + toyota.gear);
        toyota.accelarete();
        toyota.accelarete();
        toyota.accelarete();
        toyota.accelarete();
        System.out.println("toyota.speed = " + toyota.speed);
        System.out.println("toyota.gear = " + toyota.gear);
        System.out.println("car2.speed = " + car2.speed);
        System.out.println("car2.gear = " + car2.gear);
        car2.accelarete();
        System.out.println("car2.speed = " + car2.speed);
        System.out.println("car2.gear = " + car2.gear);
        System.out.println("car2.value = " + car2.value);
        System.out.println("toyota.gear = " + toyota.gear);
        toyota.hasAccident();
        System.out.println("toyota.speed = " + toyota.speed);
        System.out.println("toyota.gear = " + toyota.gear);
        System.out.println("toyota.getYear() = " + toyota.getYear());
        System.out.println("car2.getYear() = " + car2.getYear());
        toyota.setDoor(4);
        System.out.println("car2.getDoor() = " + car2.getDoor());
        System.out.println("toyota.getDoor() = " + toyota.getDoor());
        car2.setDoor(2);
        System.out.println("car2.getDoor() = " + car2.getDoor());
        toyota.setDoor(20);
        System.out.println("toyota.getDoor() = " + toyota.getDoor());
        car2.setYear(3000);
        System.out.println("car2.getYear() = " + car2.getYear());


    }


}
