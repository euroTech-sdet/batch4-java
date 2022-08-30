package com.days.day63;

public class HasBad {

    //    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
//    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
//    Note: use .equals() to compare 2 strings.
//
//    hasBad("badxx") → true
//    hasBad("xbadxx") → true
//    hasBad("xxbadxx") → false
    public static void main(String[] args) {
        hasBad("badxx");
        hasBad("xbadxx");
        hasBad("xxbadxx");
        hasBad("aba");// str.substring(1, 4)  a=0  b=1  a=2   ?=3
    }


    public static boolean hasBad(String str) {
        boolean bad = false;
        if (str.length() == 3) {
            if (str.equals("bad")) {
                bad = true;
            }
        } else if (str.length() > 3) {
            if (str.substring(0, 3).equals("bad")) {
                bad = true;
            } else if (str.substring(1, 4).equals("bad")) {
                bad = true;
            }
        } else if (str.length() < 3) {

        }
        System.out.println("bad = " + bad);
        return bad;
    }
}
