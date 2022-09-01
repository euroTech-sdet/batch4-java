package com.days.day66;

import java.util.*;

public class QueueSetSamples {


    public static void main(String[] args) {


        System.out.println("\n////////////// Queue //////////////////////\n");

        PriorityQueue<String> objQ = new PriorityQueue<>();

        objQ.add("BB");
        objQ.add("CC");
        objQ.add("AA");
        objQ.add("DD");

        System.out.println("objQ = " + objQ);

        System.out.println(objQ.peek());

        System.out.println("objQ.poll() = " + objQ.poll());

        System.out.println("objQ = " + objQ);


        System.out.println("\n////////////// SET //////////////////////\n");

        Set<String> objHastSet = new HashSet<>();

        objHastSet.add("CC");
        objHastSet.add("!!");
        objHastSet.add(";2");
        objHastSet.add("1");
        objHastSet.add("DD");
        objHastSet.add("CC");
        objHastSet.add("DD");
        objHastSet.add("cc");


        System.out.println("objHastSet = " + objHastSet);

        Set<String> objTreeSet = new TreeSet<>();

        objTreeSet.addAll(objHastSet);

        System.out.println("objTreeSet = " + objTreeSet);






    }
}
