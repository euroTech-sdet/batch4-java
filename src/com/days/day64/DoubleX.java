package com.days.day64;

public class DoubleX {
    public static void main(String[] args) {

//        Given a string, return true if the first instance of "x"
//        in the string is immediately followed by another "x".
//
//                doubleX("axxbb") → true
//        doubleX("axaxax") → false
//        doubleX("xxxxx") → true
        String str = "axxbb";
        int count = 0;
        boolean b = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    b = true;
                }
                break;
            }
        }
        System.out.println("b = " + b);
        System.out.println(str.indexOf("x"));
        int index = str.indexOf("x");
        if (str.charAt(index + 1) == 'x') {
            System.out.println(true);
        }


        if (str.contains("x") && str.indexOf("x") < str.length() - 1) {


            if (str.charAt(str.indexOf("x") + 1) == 'x') {
                b = true;

            } else {


            }
        } else {

        }

    }
}
