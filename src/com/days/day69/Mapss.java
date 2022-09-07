package com.days.day69;

import java.util.*;

public class Mapss {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Ronaldo");
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(7);
        //  Key     Value
        // Ronaldo  7
        //Benzema   9
        Map<String, Integer> footbalPlayers = new HashMap<>();
        HashMap<String, Integer> players2 = new HashMap<>();
        LinkedHashMap<String, Integer> numbers11 = new LinkedHashMap<>();
        printMap(numbers11);//footballPlayers
        footbalPlayers.put("Ronaldo", 7);
        footbalPlayers.put("Benzema", 9);
        footbalPlayers.put("Benzema", 19);
        footbalPlayers.put("Hazard", 10);
        footbalPlayers.put("Hazard", 12);

        System.out.println("Benzema = " + footbalPlayers.get("Benzema"));
        System.out.println("Hazard = " + footbalPlayers.get("Hazard"));

        Set<String> keysOfTheFootball = footbalPlayers.keySet();
        System.out.println("keysOfTheFootball = " + keysOfTheFootball);
        for (String str : keysOfTheFootball) {
            System.out.print ("str = " + str);
            System.out.println("  = " + footbalPlayers.get(str));
        }




    }

    public static void printMap(Map<String, Integer> numbers) {


    }
}
