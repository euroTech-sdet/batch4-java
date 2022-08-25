package com.days.day61;

public class Media {
    public static String television = "BBC";
    public static String newspaper = "Daily News";
    String magazine = "Time";


    public void training() {
//        System.out.println("television = " + television);
//        System.out.println("newspaper = " + newspaper);
        Data.newspaper = "Guardian";
    }

    public void writing() {

        System.out.println("magazine = " + magazine);
        Data.newspaper = "Washington Post";

    }

}
