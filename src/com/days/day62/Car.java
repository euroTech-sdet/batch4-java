package com.days.day62;

public class Car implements Drivable{
    @Override
    public String drive(String city, int speed) {
        System.out.println("you are driving a car.");
        return city;
    }
}
