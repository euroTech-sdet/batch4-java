package com.days.day33;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        guessGame();
    }



    public static void guessGame(){
        Scanner scanner = new Scanner(System.in);

        int secretNumber= 13;
        int count=1;

        System.out.println("Please enter number: "); // first question!
        int number = scanner.nextInt();

        while (number<1 || number>30){
            System.out.println("Out of boundary, pls type a number again!!: ");
            number = scanner.nextInt();
            count++;
        }

        //boolean checkPoint = true;

        while (true) {

            if (number < secretNumber) { // loop should continue!!
                System.out.println("So Low! pls type a number again!!: ");
            } else if (number > secretNumber) {  // loop should continue!!
                System.out.println("So High! pls type a number again!!: ");
            } else {  // loop should STOP!!
                System.out.println("Bravo!!! You found the number in "+ count + " tries!!");
               // checkPoint=false;
                break;
            }

            number = scanner.nextInt();
            count++;
        }

        scanner.close();

    }

}
