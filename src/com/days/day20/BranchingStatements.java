package com.days.day20;

public class BranchingStatements {

    public static void main(String[] args) {

        // BREAK!!!

        int givenNumber = 3;
        int j = 1;

        while (j <= 10) {
            if (j == 6) {
                j = 10;
            }
            System.out.println("Current number" + j);
            System.out.println(givenNumber + " * " + j + " = " + (j * givenNumber));
            j++;
        }

        // it will run line 14-16 last time!!
        System.out.println("//////////////////////// \n");
        j = 1;

        // lets use break
        while (j <= 10) {
            System.out.println("Current number" + j);
            if (j * givenNumber == 18) {
                break;
            }

            System.out.println(givenNumber + " * " + j + " = " + (j * givenNumber));
            j++;
        }

        System.out.println("//////////////////////// \n");
        // CONTINUE !!!!

        int numbers = 0;

        while (numbers < 9) {

            numbers++;
            if (numbers == 7) {
                continue;

            }
            System.out.println(numbers * numbers);

        }


        // ex

        int i = -1, sum = 0;

        while (i < 3) {
            i++;
            if (i % 3 == 0) continue;
            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println("sum = " + sum);

    }
}
