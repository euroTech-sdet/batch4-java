package com.days.day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Leagues {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> premierClubs = new LinkedHashMap<>();
        // key                                value
        // manchesterunited                  degea, herry , ronaldo
        ArrayList<String> manchesrSquat = new ArrayList<>(Arrays.asList("degea", "henry", "ronaldo", "antonio"));
        ArrayList<String> liverpoolSquat = new ArrayList<>(Arrays.asList("sadio", "firmino", "carvalho", "salah"));
        premierClubs.put("Manchester", manchesrSquat);
        premierClubs.put("Liverpool", liverpoolSquat);

        Map<String, ArrayList<String>> bundesligaClubs = new LinkedHashMap<>();
        ArrayList<String> bayern = new ArrayList<>();
        bayern.add("Sane");
        bayern.add("Lewo");
        bayern.add("kimmich");
        // bayernmunchen    players of this team
        ArrayList<String> dortmund = new ArrayList<>(Arrays.asList("Marco", "Halland", "Emre Can"));
        bundesligaClubs.put("borrussiaDortmund", dortmund);
        bundesligaClubs.put("Munchen", bayern);

        ArrayList<Map<String, ArrayList<String>>> europanFootbalLeagues = new ArrayList<>();
        europanFootbalLeagues.add(premierClubs);
        europanFootbalLeagues.add(bundesligaClubs);

        System.out.println("Leagues.get(0).get(\"Liverpool\") = " + europanFootbalLeagues.get(0).get("Liverpool"));
        System.out.println("(\"Liverpool\").get(1) = " + europanFootbalLeagues.get(0).get("Liverpool").get(1));
        System.out.println("string class methods " + europanFootbalLeagues.get(0).get("Liverpool").get(1).substring(0, 3));
        System.out.println("europanFootbalLeagues = " + europanFootbalLeagues);
        ArrayList<Days> dayList = new ArrayList<>();
        dayList.add(new Days());

        // europanFootbalLeagues    --> arraylist
        // Map -->bundesligaclubs   premierclubs
        // Arraylist manchestersquat   liverpool squat
        // string







    }
}
