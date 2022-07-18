package com.days.day45;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Arrays;

public class NBA1 {

    public static void main(String[] args) {
        ArrayList<String> scores = new ArrayList<>();
        scores.add("Chicago-Orlando : 105-70");// common part of each element
        scores.add("Miami-toronto : 120-150");
        scores.add("LA Lakers - LA Clippers : 107-88");
        scores.add("Houston Rockets - Washington Wizards : 130-123");
//        String  firstElement= scores.get(0);
//        String[] split = firstElement.split("-");
//        System.out.println("Arrays " + Arrays.toString(split));
        getScores(scores);


    }


    public static ArrayList<Integer> getScores(ArrayList<String> scores) {
        ArrayList<Integer> resultsNumbers = new ArrayList<>();
        for (int n = 0; n < scores.size(); n++) {
            String[] sp = scores.get(n).split("-");
            int secondNumber1 = Integer.valueOf(sp[sp.length - 1]);
            resultsNumbers.add(secondNumber1);
            String s2 = sp[sp.length - 2].split(": ")[1];
            int i1 = Integer.parseInt(s2);
            resultsNumbers.add(i1);
        }
        System.out.println("resultsNumbers = " + resultsNumbers);

        return resultsNumbers;
    }

    public ArrayList<Integer> getScores(ArrayList<String> scores, int a) {
        ArrayList<Integer> resultsNumbers = new ArrayList<>();
        for (int n = 0; n < scores.size(); n++) {
            String[] sp = scores.get(n).split("-");
            int secondNumber1 = Integer.valueOf(sp[sp.length - 1]);
            resultsNumbers.add(secondNumber1);
            String s2 = sp[sp.length - 2].split(": ")[1];
            int i1 = Integer.parseInt(s2);
            resultsNumbers.add(i1);
        }
        System.out.println("resultsNumbers = " + resultsNumbers);

        return resultsNumbers;
    }
}
