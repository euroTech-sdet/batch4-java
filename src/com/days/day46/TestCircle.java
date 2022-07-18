package com.days.day46;


public class TestCircle {


    public static void main(String[] args) {

        Circle obj1 = new Circle();  // Circle() constructor method !!!

        System.out.println("obj1.radius = " + obj1.radius);
        obj1.radius = 2;
        System.out.println("obj1.radius = " + obj1.radius);

        Circle obj2 = new Circle();
        // obj2.radius = 25;

        Circle obj3 = new Circle();
        // obj3.radius = 125;

    }
}
