package com.days.day40;

import java.util.Scanner;

public class Ex1 {


    public static void main(String[] args) {
        String[] key = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
         String [][] answers = {
                {"A", "B", "A", "C", "C", "D", "E","","",""},
                {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
                {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
                {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
                {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}
         };

         findExamResults(answers,key);

    }

    public static void findExamResults(String[][] studentAnswers, String[] key) {

        for (int r = 0; r < studentAnswers.length; r++) {   // OUTER loop-  check each student Array one by one
            int count = 0;

            for (int c = 0; c <key.length; c++) {  // INNER loop- check each question one by one
                if (studentAnswers[r][c].equalsIgnoreCase(key[c])) {   // studentAnswers[0][7]
                    count++;
                }
            }
            System.out.println("Student " + r + " correct count is " + count);
        }

    }
}



