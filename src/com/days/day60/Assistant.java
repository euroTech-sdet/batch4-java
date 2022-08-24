package com.days.day60;

public class Assistant extends Staff {

    StaffTitle title = StaffTitle.ASSISTANT_DOCTOR;

    Assistant(String name, int year) {
        super(name, year);
        salary = salary + 3000;
    }

    @Override
    public void teaching(int lessonCount) {
        salary = salary + (lessonCount * 100);
    }

    public void working() {
        System.out.println(name + " making research about.....");
    }


    public void paymentCalculation() {
        System.out.println(name + " gets " + salary + " this month.");
    }

}
