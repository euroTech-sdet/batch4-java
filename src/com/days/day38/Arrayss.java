package com.days.day38;

public class Arrayss {
    public static void main(String[] args) {
        String player = "Ronaldo";
        String player1 = "Benzema";
        String player2 = "Pele";
        int number = 10;
        int number2 = 20;
        int number3 = 30;
        String[] players = new String[5];//  index starts from 0 first element index number is 0 1 2 3 4
        players[0] = "Levandovski";
        players[1] = "Ronaldo";
        players[2] = "Hazard";
        players[3] = "Lukaku";
        players[4] = "Moller";

        System.out.println("players[0] = " + players[0]);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("numbers[1] = " + numbers[1]);
        numbers[1] = 10;
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers.length = " + numbers.length);
        System.out.println("players.length = " + players.length);



    }
}
