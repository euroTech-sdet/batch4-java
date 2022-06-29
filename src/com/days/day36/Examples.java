package com.days.day36;

public class Examples {
    public static void main(String[] args) {
        //  length, charat, substring, indexof,lastindexof, contains, concat, lowercase,uppercase
        String news = "Manchester City is the champion of the premier league";
        //             01234567890                                       39             52
        String champion = "Manchester City";
        // com=news.concat()
        System.out.println("news.length() = " + news.length());
        System.out.println("news.charAt(news.length()-1) = " + news.charAt(news.length() - 1));
        boolean premier = news.contains("premier");
        int index = 0;
        if (premier) {
            System.out.println("news.indexOf(\"premier\") = " + news.indexOf("premier"));
            index = news.indexOf("premier");
        }
        System.out.println("index = " + index);
        System.out.println("news.substring(index) = " + news.substring(index));
        System.out.println("news.substring(0,10) = " + news.substring(0, 10));
        String concat = news.concat(champion);
        System.out.println("concat = " + concat);
        System.out.println("concat.indexOf(\"City\") = " + concat.indexOf("City"));
        System.out.println("concat.lastIndexOf(\"City\") = " + concat.lastIndexOf("City"));
        System.out.println("concat.toLowerCase() = " + concat.toLowerCase());
        System.out.println("concat.toUpperCase() = " + concat.toUpperCase());
        System.out.println("concat = " + concat);



    }
}
