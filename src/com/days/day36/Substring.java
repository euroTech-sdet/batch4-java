package com.days.day36;

public class Substring {
    public static void main(String[] args) {
        String player = "Ronaldo";
        //               0123456
        String city = new String("Oslo");
        int no = player.length();
        char ch = player.charAt(0);// R

        System.out.println("no = " + no);
        System.out.println("ch = " + ch);
        System.out.println("city.length() = " + city.length());
        String sub = player.substring(0, 5);//al
        System.out.println("sub = " + sub);
        System.out.println("city.substring(2) = " + city.substring(2));
        System.out.println("player.charAt(player.length()-1) = " + player.charAt(player.length() - 1));


    }
}
