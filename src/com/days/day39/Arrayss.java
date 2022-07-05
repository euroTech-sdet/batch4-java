package com.days.day39;

import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        int[] numbers = {150, 20, 130, 40, 55, 10, 30, 60};
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        String[] countries = {"Spain", "Germany", "Holland", "Polland", "Greece"};
        Arrays.sort(countries);
        System.out.println("Arrays.toString(countries) = " + Arrays.toString(countries));
        System.out.println("Arrays.binarySearch(numbers,40) = " + Arrays.binarySearch(numbers, 40));
        System.out.println("Spain = " + Arrays.binarySearch(countries, 1, 3, "Spain"));
        System.out.println("Arrays = " + Arrays.binarySearch(countries, "Spain"));
        Arrays.stream(numbers).forEach(System.out::println);// will print elemets
        Arrays.stream(countries).forEach(x-> System.out.println(x));// will print each elemet
        Arrays.stream(numbers).forEach(a-> System.out.println(a>30));// will check each element return boolean value
        Arrays.stream(numbers).filter(x->x>30).forEach(x-> System.out.println(x));
        System.out.println("Arrays.stream(numbers).count() = " + Arrays.stream(numbers).count());
        System.out.println("Arrays.stream(numbers).sum() = " + Arrays.stream(numbers).sum());
        Arrays.stream(numbers).distinct().forEach(System.out::print);


    }
}
