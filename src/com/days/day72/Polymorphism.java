package com.days.day72;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Polymorphism {

    public static void main(String[] args) {
        Fruit fruit = new Apple();
        Fruit fruit1 = new Orange();

        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Apple());
        fruitList.add(new Orange());
        fruitList.add(fruit);

        Person person1 = new Employee();
        Person person2 = new Student();
        person1.sleeping();
        person2.sleeping();
        printName(new Orange());
        printName(new Apple());

        List<String> list = new ArrayList<>();
        LinkedList<String> linked = new LinkedList<>();
        printList(linked);
        printList(list);

    }

    public static void printName(Fruit fruit) {
        System.out.println("fruit.name = " + fruit.name);
    }

    public static void printList(List<String> list) {

    }


}
