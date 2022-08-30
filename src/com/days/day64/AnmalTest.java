package com.days.day64;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnmalTest {
    public static void main(String[] args) {
        AnimalInfo animal = new Horse("White");
        AnimalInfo animal2 = new Lion("King");
        AnimalInfo animal3 = new Cows("Yellow");
        Horse horse = new Horse("BlackWind");


        moving(horse);
        moving(animal3);
        moving(animal);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animalList.add(horse);
        animalList.add(animal2);

        List<String> listOfStr = new ArrayList<>();
        List<Integer> listOfNumbers = new LinkedList<>();

        printNumbers(listOfNumbers);

    }

    public static void moving(AnimalInfo animalInfo) {
        System.out.println("animalInfo.name = " + animalInfo.name);
    }

    public static void printNumbers(List<Integer> numbers) {
        System.out.println("numbers = " + numbers);
    }
    public static void printNumbers(ArrayList<Integer> numbers) {
        System.out.println("numbers = " + numbers);
    }
}
