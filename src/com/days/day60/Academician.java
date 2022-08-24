package com.days.day60;

public class Academician extends Staff {

    StaffTitle title = StaffTitle.PROFESSOR;

    Academician(String name, int year) {
        super(name, year);
        salary = salary + 7000;
    }

    @Override
    public void teaching(int lessonCount) {
        if (lessonCount > 15) {
            lessonCount = lessonCount - 15;
            salary = salary + (lessonCount * 200);
        }
    }

    @Override
    public void working() {
        System.out.println(name + " is teaching students ");

    }

    @Override
    public void paymentCalculation() {
        System.out.println(name + " get " + salary + " for teaching.");
    }
}
