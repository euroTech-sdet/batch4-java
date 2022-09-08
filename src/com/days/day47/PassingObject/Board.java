package com.days.day47.PassingObject;

public class Board {


    int serialNumber;

    String label;

    public Board(){

    }

    public Board(int serialNumber, String label) {
        this.serialNumber = serialNumber;
        this.label = label;
    }

    public void fixBoard(){
        System.out.println("Board FIXed ");
    }

    public void paintBoard(){
        System.out.println("Board PAINTED!!");
    }




}
