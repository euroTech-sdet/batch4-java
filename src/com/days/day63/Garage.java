package com.days.day63;

import java.util.ArrayList;

class Citroen {

}

public class Garage {

    public static void main(String[] args) {

        Honda honda = new Honda("Jazz", 2020, "Black", 10000, 50000);
        honda.carInfo();
        honda.moving(500);
        System.out.println("honda.km = " + honda.km);
        honda.madeAnAccident("small");
        System.out.println("honda.carValue = " + honda.carValue);
        honda.carCare();
        System.out.println("honda.serviceCount = " + honda.serviceCount);
        System.out.println("honda.carValue = " + honda.carValue);
        System.out.println("honda.color = " + honda.color);
        honda.paintTheCar("blue");
        honda.carInfo();

        BMW bmw = new BMW("m3", 2015, "green", 15000, 100000);
        bmw.moving(10000);
        System.out.println("bmw.km = " + bmw.km);
        System.out.println("bmw.color = " + bmw.color);
        System.out.println("honda.color = " + honda.color);
        bmw.paintTheCar("black");
        honda.paintTheCar("white");
        System.out.println("bmw.color = " + bmw.color);
        System.out.println("honda.color = " + honda.color);
        bmw.madeAnAccident("big");
        System.out.println("bmw.carValue = " + bmw.carValue);
        bmw.carCare();

        System.out.println("Car.carCount = " + Car.carCount);

        Citroen citroen = new Citroen();
        ArrayList<Citroen> citroenList = new ArrayList<>();
        citroenList.add(citroen);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(honda);
        carList.add(bmw);
        System.out.println("carList.get(0).model = " + carList.get(0).model);

        System.out.println("Car.carModels = " + Car.carModels);
        System.out.println("honda.carData = " + honda.carData);
        System.out.println("bmw.carData = " + bmw.carData);
        Car bmm2=new BMW("x5",2022,"white",30000,500);
        Car hon2=new Honda("accord",2022,"white",30000,500);
        System.out.println("Car.carModels = " + Car.carModels);
        System.out.println("hon2.carData = " + hon2.carData);
        
        


    }


}
