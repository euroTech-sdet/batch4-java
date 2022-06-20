package com.days.days29;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.age=3;
        animal1.color="black";
        animal1.hasWing=true;
        System.out.println("animal1.isRunning = " + animal1.isRunning);
        Animal animal2 = new Animal();
        System.out.println("animal2.age = " + animal2.age);
        animal2.color="white";
        animal2.hasWing=false;
        System.out.println("animal2.isRunning = " + animal2.isRunning);
        animal1.moving();

    }
}
