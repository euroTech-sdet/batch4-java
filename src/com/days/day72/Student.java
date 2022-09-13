package com.days.day72;

public class Student implements Person {

    @Override
    public void eating(Fruit fruit) {
        System.out.println("student is eating " + fruit.name);
    }

    @Override
    public void sleeping() {
        System.out.println("student are sleeping more than 7 hours");
    }
}
