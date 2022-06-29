package com.days.day35;

public class Text2 {

    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        System.out.println(str == str2);
        String text = new String("Hello");
        System.out.println(text == str);
        String text1 = new String("Hello");
        System.out.println(text == text1);
        text = text1;
        System.out.println(text == text1);

        Operators obj=new Operators();
        obj.multiply(2);



    }
}
