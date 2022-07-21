package com.days.day48;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>(Arrays.asList("Benzema", "Beckham", "Ronaldinho", "Juninho", "Number1"));
        players.add("Ronaldo");
        players.add("Hasan");
        ArrayList<String> selectedPlayers = new ArrayList<>();
        for (String player : players) {
            if (player.contains("Be")) {
                selectedPlayers.add(player);
            }
        }
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).contains("Ro")) {
                System.out.println("players.get(i) = " + players.get(i));
            }
        }
        System.out.println("selectedPlayers = " + selectedPlayers);
        ArrayList<String> returnedPlayer = selectPlayer(players, "ho");// holds an arraylist i can assign this line to an arraylist
        System.out.println("returnedPlayer = " + returnedPlayer);
        selectPlayer("ho", players);

    }

    public static ArrayList<String> selectPlayer(ArrayList<String> gamer, String str) {
        ArrayList<String> selectedPlayers = new ArrayList<>();
        for (int i = 0; i < gamer.size(); i++) {
            if (gamer.get(i).contains(str)) {
                selectedPlayers.add(gamer.get(i));
//                System.out.println("index number = " + i);
//                System.out.println("gamer.get(i) = " + gamer.get(i));
            }
        }
        return selectedPlayers;
    }

    public static void selectPlayer(String str, ArrayList<String> gamer) {
        gamer.stream().filter(x -> x.contains(str)).forEach(System.out::println);
    }


}


