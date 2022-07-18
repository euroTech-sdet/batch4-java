package com.days.day44;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayLists5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(5);
        numbers.add(15);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 30) {
                System.out.println(numbers.get(i));
            }
        }
        List<Integer> collect = numbers.stream().filter(num -> num > 30).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        numbers.stream().filter(x->x<20).forEach(System.out::println);



    }
}
