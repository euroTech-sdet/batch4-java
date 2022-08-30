package com.days.day62;

@FunctionalInterface
public interface Drivable {

    String drive(String city,int speed);


    default void increaseSpeed() {
        System.out.println("you are going fast");
    }

}
