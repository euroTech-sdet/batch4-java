package com.days.day62;

import java.util.ArrayList;

public class Lambdas {
    public static void main(String[] args) {
        Drivable bus = ((s, f) -> {
            System.out.println("You are driving a bus in the " + s + "with " + f + " speed.");
            return "Hello" + s;
        });
        String str = bus.drive("Oslo", 50);
        System.out.println(str);
        Drivable car = ((c, f) -> {
            System.out.println("you are driving a ferrari in the  " + c + " with " + f + " speed.");
            return "Hello car";
        });
        String str2 = car.drive("Bremen", 150);
        System.out.println(str2);
    }

//    public static void driveSthing(Drivable drivable) {
//        drivable.drive();
//    }

}
