package com.days.day45;

import java.util.ArrayList;

public class NBAtest {
    public static void main(String[] args) {
        ArrayList<String> scores2 = new ArrayList<>();
        scores2.add("Chicago-Orlando : 105-70");// common part of each element
        scores2.add("Miami-toronto : 120-150");
        scores2.add("LA Lakers - LA Clippers : 107-88");
        scores2.add("Houston Rockets - Washington Wizards : 130-123");
        NBA1.getScores(scores2);
        ArrayList<String> sco3 = new ArrayList<>();
        sco3.add("Chicago-Orlando : 15-7");// common part of each element
        sco3.add("Miami-toronto : 12-1");
        sco3.add("LA Lakers - LA Clippers : 7-8");
        sco3.add("Houston Rockets - Washington Wizards : 13-12");
        NBA1 test = new NBA1();
        test.getScores(scores2, 2);
        test.getScores(sco3, 1);
        NBA1 test2 = new NBA1();




    }
}
