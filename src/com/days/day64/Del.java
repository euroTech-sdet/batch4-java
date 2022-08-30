package com.days.day64;

public class Del {

    //    Given a string, if the string "del" appears starting at index 1,
//        return a string where that "del" has been deleted. Otherwise, return the string unchanged.
//
//    delDel("adelbc") → "abc"
//    delDel("adelHello") → "aHello"
//    delDel("adedbc") → "adedbc"
    public static void main(String[] args) {
        delDel("add");
    }

    public static String delDel(String str) {
        String del = str;
        if (str.length() > 3 && str.substring(1, 4).equals("del")) {
            del = str.charAt(0) + str.substring(4);
        }
        System.out.println("del = " + del);
        return del;
    }
}
