package com.days.day45;

import java.util.ArrayList;

public class NBA {

    public static void main(String[] args) {
        ArrayList<String> scores = new ArrayList<>();
        scores.add("Chicago-Orlando : 110-70");
        scores.add("Miami-toronto : 120-105");
        scores.add("LA Lakers - LA Clippers : 107-85");
        scores.add("Houston Rockets - Washington Wizards : 130-135");

        // get the numbers from the elements and put them in an Integer ArrayList
        //String  a=1  String b=1  String c=0
        // split(":")
//        String[] split = scores.get(0).split("-");
//        System.out.println("sc" + scores.get(0).lastIndexOf(" "));
        ArrayList<Integer> resultsNumbers = new ArrayList<>();
        String[] split = scores.get(0).split("-");
        int secondNumber = Integer.valueOf(split[split.length - 1]);
        resultsNumbers.add(secondNumber);
        System.out.println("split[split.length-1] = " + split[split.length - 1]);
        System.out.println("split[split.length-2] = " + split[split.length - 2]);
        System.out.println(split[split.length - 2].split(": ")[1]);
        String s = split[split.length - 2].split(": ")[1];
        int i = Integer.parseInt(s);
        int b = Integer.valueOf(s);
        System.out.println("i = " + i);
        System.out.println("b = " + b);
        resultsNumbers.add(i);
        System.out.println("resultsNumbers = " + resultsNumbers);

        for (int n = 0; n < scores.size(); n++) {
            String[] split1 = scores.get(n).split("-");
            int secondNumber1 = Integer.valueOf(split1[split.length - 1]);
            resultsNumbers.add(secondNumber1);
            String s2 = split1[split1.length - 2].split(": ")[1];
            int i1 = Integer.parseInt(s2);
            resultsNumbers.add(i1);
        }
        System.out.println("resultsNumbers = " + resultsNumbers);

    }
}
