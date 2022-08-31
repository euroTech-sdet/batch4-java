package com.days.day65;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionSamples {


    public static void main(String[] args) {

        int[] intArray= new int[3];
        intArray[0] = 1;
        intArray[1] = 1;
        intArray[2] = 1;

///////////////////////

        ArrayList<Integer> testList = new ArrayList<>();

        System.out.println(testList.isEmpty());

        testList.add(1);
        testList.add(2);
        testList.add(3);

        System.out.println("testList = " + testList);


        ArrayList<Integer> comboList = new ArrayList<>();

        comboList.addAll(testList);
        comboList.addAll(testList);

        System.out.println("comboList = " + comboList);

        comboList.clear();

        System.out.println("comboList = " + comboList);

        System.out.println("\n//////////////////////////////////////////////////\n");

        System.out.println("testList.contains(4) = " + testList.contains(4));
        System.out.println("testList.contains(4) = " + testList.contains(1));
        System.out.println("testList.contains(1) = " + testList.contains("1"));

        System.out.println("\n//////////////////////////////////////////////////\n");

        ArrayList<Object> mixList= new ArrayList<>();

        mixList.add(1);
        mixList.add(2);
        mixList.add(3);
        mixList.add("1");
        mixList.add(true);

        System.out.println("mixList = " + mixList);


        System.out.println("mixList.contains(1) = " + mixList.contains(1));
        System.out.println("mixList.contains(\"1\") = " + mixList.contains("1"));
        System.out.println("mixList.contains(\"2\") = " + mixList.contains("2"));

        System.out.println("\n//////////////////////////////////////////////////\n");

        System.out.println("testList = " + testList);

        System.out.println("mixList.containsAll(testList) = " + mixList.containsAll(testList)); // Mixlist is in our hand , and looking params testlist's elements .. is exist or not!!

        System.out.println("testList.containsAll(mixList) = " + testList.containsAll(mixList)); // FALSE!!


        System.out.println("\n//////////////////////////////////////////////////\n");

        ArrayList<Integer> checkList = new ArrayList<>();

        checkList.add(3);
        checkList.add(2);
        checkList.add(1);

        System.out.println("checkList.equals(testList) = " + checkList.equals(testList)); // if order is not same, will return FalsE!!!

        System.out.println("\n//////////////////////////////////////////////////\n");

        ArrayList<Object> checkList2 = new ArrayList<>();

        checkList2.add("1");
        checkList2.add(2);
        checkList2.add(3);

        System.out.println("checkList2.equals(testList) = " + checkList2.equals(testList));

        System.out.println("\n//////////////////////////////////////////////////\n");

        System.out.println("testList.hashCode() = " + testList.hashCode());
        System.out.println("checkList.hashCode() = " + checkList.hashCode());
        System.out.println("checkList2.hashCode() = " + checkList2.hashCode());


        //checkList2.remove(2); // it will delete index 2 , obj 3

        System.out.println("checkList2.remove((Integer)2) = " + checkList2.remove((Integer) 2));

        System.out.println("checkList2.remove(\"2\") = " + checkList2.remove("2"));
        System.out.println("checkList2 = " + checkList2);

        System.out.println("mixList = " + mixList);

        mixList.removeAll(testList);

        System.out.println("mixList = " + mixList);


        System.out.println("\n//////////////////////////////////////////////////\n");

        Object[] returnArray = mixList.toArray();

        System.out.println("mixList.toArray() = " + Arrays.toString(returnArray));



    }

}
