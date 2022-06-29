package com.days.day35;

public class LastLetter {

    public static void main(String[] args) {

        LastLetter last=new LastLetter();
        last.lastLetter("Bulls");
        //                  01234   length is 5 last index is 4 so it is length()-1
        last.lastLetter("Miami Heat");
        last.lastLetter("Toronto Raptor");

    }

    public void lastLetter(String str) {
        System.out.println("str.length() = " + str.length());
        System.out.println("str.charAt(str.length()-1) = " + str.charAt(str.length()-1 ));
    }


}
