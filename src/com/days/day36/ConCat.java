package com.days.day36;

public class ConCat {
    public static void main(String[] args) {
        String player = "Michael jordan";
        String player2 = "michael Jordan";
        String club = new String("Chicago Bulls Bulls Bulls");
        //                               012345678901234567890
        //  club = new String("New Orleans");
        //  club = " Miami Heat";
        //      01234567
        System.out.println("player+club = " + player + club);
        String concat = player.concat(club).concat(" played");
        System.out.println("concat = " + concat);
//        System.out.println("club.indexOf(\"Heat\") = " + club.indexOf("Heat"));
//        System.out.println("player.indexOf(\"M\") = " + player.indexOf("M"));
        System.out.println(club.indexOf("Bulls"));
        System.out.println(club.lastIndexOf("Bulls"));
        System.out.println("player.equals(club) = " + player.equals(club));
        System.out.println("player.equals(player2) = " + player.equals(player2));
        System.out.println("player.equalsIgnoreCase(player2) = " + player.equalsIgnoreCase(player2));
        System.out.println(player.toLowerCase());
        System.out.println("player.toUpperCase() = " + player.toUpperCase());
        System.out.println("player = " + player);

        String club2 = "Newyork Knicks";
        System.out.println("club2.indexOf(\"New\") = " + club2.indexOf("New"));
        System.out.println("club2.contains(\"New\") = " + club2.contains("No"));



    }
}
