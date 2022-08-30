package com.days.day64;

public abstract class AnimalInfo implements Animal {

    AnimalInfo(String name) {
        this.name = name;
    }

    String name;
    String age;

}
