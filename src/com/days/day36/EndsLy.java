package com.days.day36;

public class EndsLy {
//    Given a string, return true if it ends in "ly".

    //    endsLy("oddly") → true
//    endsLy("y") → false
//    endsLy("oddy") → false
    public static void main(String[] args) {
        String str = "oddly";
        String subs = str.substring(str.length() - 2);
        boolean result = false;
        if (subs.equals("ly")) {
            result = true;
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("result = " + result);

    }
}
