package com.days.day70;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MultiDimensional {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] days = new String[]{"sunday", "monday", "tuesday", "wednesday"};
        String[][] clubs = new String[][]{
                {"Marco", "Halland", "Emre Can"},
                {"sadio", "firmino", "carvalho", "salah"},
                {"degea", "henry", "ronaldo", "antonio", "Sancho"}
        };
        for (int i = 0; i < clubs.length; i++) {// defines the rows
            for (int l = 0; l < clubs[i].length; l++) {// defines the columns
                System.out.print(" " + clubs[i][l].toUpperCase());
            }
            System.out.println();
        }

        System.out.println("clubs[2][1] = " + clubs[2][1]);
        System.out.println("clubs[0][2] = " + clubs[0][2]);

        List<List<String>> clubsList = new ArrayList<>();
        ArrayList<String> manchester = new ArrayList<>(Arrays.asList("degea", "henry", "ronaldo", "antonio"));
        ArrayList<String> dortmund = new ArrayList<>(Arrays.asList("Marco", "Halland", "Emre Can"));
        LinkedList<String> liverpool = new LinkedList<>(Arrays.asList("sadio", "firmino", "carvalho", "salah"));

        clubsList.add(manchester);
        clubsList.add(dortmund);
        clubsList.add(liverpool);

        System.out.println("clubsList.get(2).get(3) = " + clubsList.get(2).get(3));
        String ronaldo = clubsList.get(0).get(2);
        System.out.println("ronaldo.substring(ronaldo.length()-2) = " + ronaldo.substring(ronaldo.length() - 2));

        for (int i = 0; i < clubsList.size(); i++) {
            for (int l = 0; l < clubsList.get(i).size(); l++) {
                System.out.print(clubsList.get(i).get(l) + "  ");
            }
            System.out.println();
        }
        ArrayList<Integer> numbers1 = new ArrayList<>();
        int no = 10;//  Integer
        char letter = 'l';// Character
        double d = 10.10;
        Character c = 'c';
        Integer no1 = new Integer(12);
        String s1 = no1.toString();
        numbers1.add(no);
        Double d1 = 10.10;
        String str = "12344";
        // whether it equals to 12345
        int i = Integer.parseInt(str);
        if (i == 12345) {
            System.out.println("success");
        } else {
            System.out.println("error");
        }
    }
}
