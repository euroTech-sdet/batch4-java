package com.days.day47.PassingObject;


public class TestBoard {


    public static void main(String[] args) {



        Board board5;
       // System.out.println("board5.label = " + board3.label);
      //  printBoardLabel(board5); // ERROR!!!


        Board board1 = new Board(10001, "mobileBoard1");
        board1.fixBoard();

        System.out.println("board1.label = " + board1.label);

        printBoardLabel(board1);

        Board board2= null;
       // printBoardLabel(board2); // ERROR!!!

        Board board3 = new Board(10003, "mobileBoard3");
        printBoardLabel(board3);

        Board board4 = new Board(10004, "mobileBoard4");
        printBoardLabel(board4);
    }

    public static void printBoardLabel(Board aaa){
        System.out.println("Label of board = " + aaa.label);
    }



}
