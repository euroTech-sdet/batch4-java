package com.days.day64;

public class Countxx {
    public static void main(String[] args) {

        // Count the number of "xx" in the given string.
        // We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

        String str = "hxxello jaxxvaxx";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
