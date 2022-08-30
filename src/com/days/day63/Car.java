package com.days.day63;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Car {
    // parent
    // all the car has model, productionYear,
    //
    //
    // make an accident   accident we can decrease the value of the car
    //

    String model;
    int productionYer;
    String color;
    double carValue;
    int km;
    int serviceCount;
    int currentYear;
    static int carCount;
    private int age;
    LocalDateTime time = LocalDateTime.now();
    static ArrayList<String> carModels = new ArrayList<>();
    ArrayList<String> carData = new ArrayList<>();

    {

        currentYear = time.getYear();

    }

    Car(String model, int productionYear, String color, double carValue, int km) {
        carCount++;
        this.model = model;
        this.productionYer = productionYear;
        this.color = color;
        this.carValue = carValue;
        this.km = km;
        age = time.getYear() - productionYear;
        carModels.add(model);
        carData.add(model);
    }


    public void moving(int num) {

        km = km + num;
    }

    public abstract void paintTheCar(String color);


    public double madeAnAccident(String level) {
        if (level.equals("small")) {
            carValue = carValue - ((carValue / 100) * 10);
        } else if (level.equals("medium")) {
            carValue = carValue - ((carValue / 100) * 30);
        } else if (level.equals("big")) {
            carValue = carValue - ((carValue / 100) * 70);
        } else {
            carValue = carValue - ((carValue / 100) * 5);
        }
        return carValue;
    }

    public void carCare() {
        serviceCount++;
        carValue = carValue + ((carValue / 100) * 2);
        System.out.println(" you will come servide in " + (currentYear + 2));
    }

    public void carInfo() {
        System.out.println("----------------------------------------------------");
        System.out.println("model and year of the car  model= " + model + " year =" + productionYer);
        System.out.println(" color of the car= " + color);

        System.out.println("current value of the car= " + carValue);
        System.out.println(" current km of the car =" + km);
        System.out.println(" how many time had service =" + serviceCount);
        System.out.println(" the car is " + age + " years old.");
        System.out.println("----------------------------------------------------------");
    }

}
