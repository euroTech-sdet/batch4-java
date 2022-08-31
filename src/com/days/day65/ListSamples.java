package com.days.day65;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListSamples {

    public static void main(String[] args) {



        System.out.println("\n////////////////////////ARRAYLIST/////////////////////\n");

        ArrayList<Object> mixList= new ArrayList<>();

        mixList.add(33);
        mixList.add(22);
        mixList.add(11);
        mixList.add("1");
        mixList.add("x");
        mixList.add(true);

        System.out.println("mixList = " + mixList);

//        mixList.getFirst(); not exist in List interface!!

        System.out.println("\n//////////////////////LINKEDLIST//////////////////\n");

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(33);
        linkedList.add(22);
        linkedList.add(11);

        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());


        System.out.println("\n//////////////////////StackLIST//////////////////\n");

        Stack<Integer> stackList = new Stack<>();

        stackList.push(11);
        stackList.push(22);
        stackList.push(33);


        System.out.println("stackList = " + stackList);

        System.out.println("stackList.pop() = " + stackList.pop());

        System.out.println("stackList.get(1) = " + stackList.get(1));



    }
}
