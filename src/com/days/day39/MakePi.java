package com.days.day39;

public class MakePi {

//    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

    //    makePi() → [3, 1, 4]
    public static void main(String[] args) {

        int[] piValue = makePi();
        System.out.println("piValue[0] = " + piValue[0]);


    }


    public static int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }
}
