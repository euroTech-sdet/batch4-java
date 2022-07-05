package com.days.day39;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String text = "Hel lo ja va again";
        //              0   1  2  3  4
        String[] s = text.split(" ");
        System.out.println("s.length = " + s.length);// 4
        System.out.println("Arrays.toString(s) = " + Arrays.toString(s));

        String nbaClub = "Toronto Raptors";
        String[] os = nbaClub.split("o");
        System.out.println("Arrays.toString(os) = " + Arrays.toString(os));
        System.out.println("nbaClub.split(\" \")[1] = " + nbaClub.split(" ")[1]);// Raptors

    }
}
