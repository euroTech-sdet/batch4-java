package com.days.day62;

public class Bus implements Drivable {

    @Override
    public String drive(String city, int speed) {
        System.out.println("You are driving a bus.");
        return city;
    }


}
