package com.days.day60;

public abstract class Staff extends Person {
    int salary;

    Staff(String name, int year) {
        super(name, year);
        salary = 10000;
    }

    public  abstract void teaching(int lessonCount);

    public abstract void working();

    public abstract void paymentCalculation();

    public void reading() {

        System.out.println("reading sthng.");
    }
}
