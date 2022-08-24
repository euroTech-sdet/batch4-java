package com.days.day60;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
        Bird bird = new Bird("eagle", "black");
        Bird bird2 = new Bird("hawk", "white");
        Fish fish = new Fish("jawa", "white");
        Dog dog = new Dog("golden", "yellow");
        bird.moving();
        fish.moving();
        dog.moving();

        ArrayList<String> names = new ArrayList<>(Arrays.asList("David", "Ronaldo", "Michael", "Kobe"));
        System.out.println("names.get(0) = " + names.get(0));


        ArrayList<Bird> birdList = new ArrayList<>();
        ArrayList<Fish> fishList = new ArrayList<>();
        fishList.add(fish);

        ArrayList<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(bird);
        listOfAnimal.add(dog);
        listOfAnimal.add(fish);
        System.out.println("listOfAnimal.get(0).name = " + listOfAnimal.get(0).name);

        birdList.add(bird);//0
        birdList.add(bird2);//1

        birdList.get(0).eating();


    }
}
