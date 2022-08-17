package com.days.day56;

public class Player {
    // with the default access modifier
    String team;
    String name;
    static String clubName = NBACLUBS.TORONTO.toString();

    Player(String name, String team) {
        this.team = team;
        this.name = name;
    }

    void printTeam() {
        System.out.println("team of the player = " + team);
    }


}
