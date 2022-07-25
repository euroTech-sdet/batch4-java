package com.days.day50;

import java.util.Scanner;

public class Car {


    String model;
    private int door;
    String color;
    private int year;
    int speed;
    int gear;
    int value;
    static int count;


    Car(int year, int value) {
        this.year = year;
        this.value = value;
    }

    public void setDoor(int d) {
        if (d > 4 || d < 2) {
            System.out.println("there is no car with the " + d + " doors.Assign the door value again pls.");
            System.out.println(" the value has not been assigned.");
        } else {
            this.door = d;
        }

    }

    public void setYear(int year) {
        if (year > 2022 || year < 2000) {
            Scanner scan = new Scanner(System.in);
            System.out.println(" unvalid value try again pls");
            System.out.println("send a new year and pls try to be logical");
            setYear(scan.nextInt());
        } else {
            this.year = year;
        }
    }

    public int getDoor() {
        return this.door;
    }


    public int getYear() {

        return year;
    }

    public void hasAccident() {
        System.out.println("att the time of accident the speed  otf the  " + model + " is = " + speed);
        value = value - 1000;
        speed = 0;
        gear = 0;
    }


    public void accelarete() {
        speed = speed + 20;
        System.out.println("speed = " + speed);
        if (speed < 20 && speed > 10) {
            gear = 2;
        } else if (speed >= 20 && speed < 50) {
            gear = 3;
        } else if (speed > 50) {
            gear = 4;
        }
    }

    public void printInfo() {
        System.out.println("model = " + model);
        System.out.println("door = " + door);
        System.out.println(color);
        System.out.println("year = " + year);
    }


}
