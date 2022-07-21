package com.days.day48;

public class Player {
    String name;
    int age;
    String club;


    Player(String nm) {
        name = nm;
        System.out.println("obj created");
        club = "Chelsea";
    }

    public void running() {
        int a = 10;
        System.out.println(name + " is running.");

    }

    public void playing() {
        System.out.println(name + " is playing ");
    }

    public void info() {
        System.out.println(name);
        System.out.println("age = " + age);
        System.out.println("club = " + club);
    }

}
