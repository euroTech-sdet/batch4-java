package com.days.day36;

public class Trim {
    public static void main(String[] args) {
        String text = "   Hello     Java  Hello   ";
        String text2="   HELLO     Java  Hello   ";
        String trim = text.trim();
        System.out.println("text.trim() = " + text.trim());
        System.out.println("text = " + text);
        System.out.println("trim = " + trim);
        System.out.println("text.replace(\"Hello\",\"Hi\") = " + text.replace("Hello", "Hi"));
        System.out.println("text = " + text);
        System.out.println("text.replaceFirst(\"Hello\",\"Hi\") = " + text.replaceFirst("Hello", "Hi"));
        System.out.println("text.equals(text2) =   " + text.equals(text2));
        System.out.println("toLowerCase     " + text.equals(text2.toLowerCase()));
        // System.out.println("text.equalsIgnoreCase(text2) = " + text.equalsIgnoreCase(text2));

    }
}
