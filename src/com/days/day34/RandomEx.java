package com.days.day34;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {


    public static void main(String[] args) {

        pcGuessGame();
    }


    //Write code that generates a random odd integer (not divisible by 2)
    //      between 50 and 99 inclusive.
    public static int oddRandomGenerator() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter min (inc) value: ");
        int low = scanner.nextInt();

        System.out.println("Please enter max (inc) value: ");
        int high = scanner.nextInt() + 1;
        int value;
        // 1. opt
        do {
            value = random.nextInt(high - low) + low;
        } while (value % 2 == 0);

        // 2. opt:
//        while (true) {
//            value = (random.nextInt(high - low) + low);
//            if(value%2!=0){
//                break;
//            }
//        }

        //3. opt:
//         value= (random.nextInt(high - low) + low);;
//        while (value%2==0) {
//            value = (random.nextInt(high - low) + low);
//        }

        scanner.close();
        return value;
    }


    public static void pcGuessGame() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter min (inc) value: ");
        int low = scanner.nextInt(); //10
        int high;
        do {
            System.out.println("Please enter max (inc) value: ");
            high = scanner.nextInt() + 1; //1
            if(high<low){
                System.out.println("Wrong Value!! Please type a max value bigger then low value!!");
            }
        }while(high<low);

//        do {
//            System.out.println("Please enter max (inc) value: ");
//            high = scanner.nextInt() + 1; //1
//            if(high<low){
//                System.out.println("Wrong Value!! Please type a max value bigger then low value!!");
//            } else{
//                break;
//            }
//        }while (true);

        int lucklyNumber= random.nextInt(high-low) + low;

        int counter=0;
        int randomValue;

        scanner.close();
        do{
            counter++;

            if(counter==6){
                System.out.println("You FAIL PC boy!! You didn't guess the number in 5 times");
                System.out.println("Luckly number was " + lucklyNumber);
                System.exit(0);
            }
            randomValue = random.nextInt(high-low) + low;

            System.out.println("Next number: "+ randomValue);

        } while (randomValue != lucklyNumber);

        System.out.println("Bravo!! PC caught the number in " + counter + " times!!");
    }



}
