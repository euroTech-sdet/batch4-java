package com.days.day65;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Questions {

    public static void main(String[] args) {

        System.out.println("\n//////////////////////Question-1//////////////////\n");

        // INSERTION

        ArrayList<String> colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Green");
        colours.add("Orange");
        colours.add("White");
        colours.add("Black");

        System.out.println("colours = " + colours);

        colours.add(2,"Pink");

        System.out.println("colours = " + colours);


        System.out.println("\n//////////////////////Question-2//////////////////\n");

        // UPDATE AND REMOVE

//        Stack<String> objStack = new Stack<>();

        // Create a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Blue");
        list_Strings.add("Green");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);
        // Update the third element with "Yellow"
        list_Strings.set(2, "Yellow");
        // Print the list again
        System.out.println(list_Strings);

        // REMOVE the element

        list_Strings.remove(2);

        System.out.println("list_Strings = " + list_Strings);



        System.out.println("\n//////////////////////Question-3//////////////////\n");

        if (list_Strings.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("Could not find the element");
        }



        System.out.println("\n//////////////////////Question-4//////////////////\n");

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");

        System.out.println("colors.subList(0,2) = " + colors.subList(0, 3));



        System.out.println("\n//////////////////////Question-5//////////////////\n");

        ArrayList<String> color1 = new ArrayList<>();
        color1.add("Red");
        color1.add("Blue");
        color1.add("White");
        color1.add("Pink");

        ArrayList<String> color2 = new ArrayList<>();
        color2.add("Red");
        color2.add("Blue");
        color2.add("Pink");


        ArrayList<String> returnArray = new ArrayList<String>();
        ArrayList<String> listYesNo = new ArrayList<String>();

        for (String element : color1) {

            listYesNo.add((color2.contains(element)) ? "Yes" : "No");

            if(color2.contains(element)){
                returnArray.add(element);
            }
        }

        System.out.println("returnArray = " + returnArray);
        System.out.println("listYesNo = " + listYesNo);






    }
}
