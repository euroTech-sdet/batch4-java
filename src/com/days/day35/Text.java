package com.days.day35;

public class Text {
    public static void main(String[] args) {
        String text = "Hello Java";
        String str = new String("Hello");
        String city = new String("London");
        String text2 = new String("Hello Java");
        String text3 = "Hello Java";
        System.out.println(text == text2);
        System.out.println(text == text3);
        String text4 = new String("Hello Java");
        System.out.println(text2 == text4);
        String city2 = "London";
        String city3 = "London";
        System.out.println(city2 == city3);
        System.out.println(city == city2);
        String str2 = new String("Hello Again");
        String str3 = new String();
        String str4 = new String("Hello");


    }
}
