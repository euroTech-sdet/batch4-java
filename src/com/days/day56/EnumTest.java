package com.days.day56;

public class EnumTest {

    public static void main(String[] args) {
        Days day = Days.SATURDAY;

        switch (day) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("Days.SUNDAY.dayNumber = " + Days.SUNDAY.dayNumber);
                System.out.println("Happy Weekend");
                break;
            case THURSDAY:
            case TUESDAY:
            case WEDNESDAY:
            case MONDAY:
                System.out.println("happy!!! weekdays");
                break;
            case FRIDAY:
                System.out.println("weekend is coming");
        }

        for (Days d : Days.values()) {
            System.out.println("d = " + d);
        }


    }
}
