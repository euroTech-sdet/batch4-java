package com.days.day66;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassSamples {


    public static void main(String[] args) {


        ArrayList<String> strList = new ArrayList<>();
        strList.add("AA");
        strList.add("CC");
        strList.add("FF");
        strList.add("DD");

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(11);
        intList.add(33);
        intList.add(-22);
        intList.add(0);


        ArrayList<Object> objList = new ArrayList<>();

        objList.addAll(strList);
        objList.addAll(intList);




        System.out.println("strList = " + strList);

        System.out.println("intList = " + intList);

       // List<Object> objList2 = Collections.emptyList();

        System.out.println("Collections.emptyList() = " + Collections.emptyList());


        System.out.println("Collections.max(intList) = " + Collections.max(intList));

        System.out.println("Collections.min(intList) = " + Collections.min(intList));


        Collections.reverse(intList);


        System.out.println("Reversed intList = " + intList);





    }
}
