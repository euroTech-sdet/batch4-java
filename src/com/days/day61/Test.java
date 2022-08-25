package com.days.day61;

public class Test {
    public static void main(String[] args) {
        System.out.println("Data.warYear = " + Data.warYear);
        System.out.println("DataForProject.year = " + DataForProject.year);
        System.out.println("country = " + DataForProject.country);
        Media media=new Media();
        System.out.println("Data.newspaper = " + Data.newspaper);
        media.training();
        System.out.println("Data.newspaper = " + Data.newspaper);
        media.writing();
        System.out.println("Data.newspaper = " + Data.newspaper);
    }
}
