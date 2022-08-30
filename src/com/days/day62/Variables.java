package com.days.day62;

public class Variables {
    String city;

    public static void main(String[] args) {
        int number = 50;
        System.out.println("number = " + number);
        number = 30;
        System.out.println(number * 10);
        System.out.println("number in the main method " + number);

        Variables variables = new Variables();
//        variables.print();
        variables.training();
    }

    public void training() {
        int number = 20;
        System.out.println("number in the training method " + number);
        System.out.println("in the training method  city is == " + city);
        String newCity = print();
        System.out.println("newCity = " + newCity);
    }

    public String print() {
        city = "Roma";
        System.out.println("city in the print method " + city);
        return city;
    }


}
