package com.days.day48;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("Michael");
        System.out.println("player1.name = " + player1.name);
        System.out.println("player1.age = " + player1.age);
        Player player2 = new Player("Malone");
        System.out.println("player2.name = " + player2.name);
        player1.name = "Ronaldo";
        player1.running();
        player2.running();
        player1.age = 30;
        player2.age = 15;
        System.out.println("player1.age = " + player1.age);
        System.out.println("player2.age = " + player2.age);
        System.out.println("player1.club = " + player1.club);
        System.out.println("player2.club = " + player2.club);


    }
}
