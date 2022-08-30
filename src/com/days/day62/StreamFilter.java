package com.days.day62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(5, 10, 25, 20, 35, 50, 100));
        numberList.add(70);
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) > 30) {
                //  System.out.println(numberList.get(i));
            }
        }
        numberList.stream().filter(x -> x > 30).forEach(System.out::println);
        numberList.stream().forEach(System.out::println);// will print each element of the list
        List<Integer> collect = numberList.stream().filter(x -> x < 30).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        List<Integer> multiply2 = numberList.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println("numberList = " + numberList);
        System.out.println("multiply2 = " + multiply2);
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("lokomotif", "Oslo", "Munich", "London","Madrid"));
        cities.stream().filter(c->c.toLowerCase().contains("lo")).forEach(System.out::println);
        cities.stream().map(c-> "Hello "+c).forEach(System.out::println);


    }


}
