package com.days.day38;

import java.util.Locale;

public class Stringss {
    public static void main(String[] args) {
        String str = " Hello Java Hello   ";
        //            0123456789   length of str is 10 but last index is 9
        String str1 = new String("Hello again");
        String str2 = "hello java";
        //length()
        System.out.println(str.length());
        str.substring(3);
        System.out.println("str.charAt(10) = " + str.charAt(0));
        System.out.println("str.substring(3,7) = " + str.substring(3, 7));
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
        System.out.println("str.concat(str1) = " + str.concat(str1));
        System.out.println("str.equals(str1) = " + str.equals(str1));
        System.out.println("str.equals(str2) = " + str.equals(str2));
        System.out.println("str.equalsIgnoreCase(str2) = " + str.equalsIgnoreCase(str2));
        System.out.println("str.contains(\"Hello\") = " + str.contains("lo"));
        System.out.println("str.startsWith(\"He\") = " + str.startsWith("he"));
        System.out.println("str.endsWith(\"He\") = " + str.endsWith("va"));
        System.out.println("str.replace= " + str.replace("Java", "Selenium"));
        System.out.println("str = " + str);
        System.out.println("str.indexOf(\"Java\") = " + str.indexOf("Java"));
        System.out.println("str.lastIndex= " + str.lastIndexOf("Hello"));
        System.out.println("str.indexOf = " + str.indexOf("Hello"));
        System.out.println("str =" + str.trim());
        System.out.println("str.replace(\"Hell" + str.replace("Hello", "Hi"));
        System.out.println("str2.lastIndexOf(\"hello\") = " + str2.lastIndexOf("hello"));


    }
}
