package com.days.day69;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Days {
    public static void main(String[] args) {
        // 1     january
        //2      february
        //3      march
//        LinkedHashMap<Integer, String> months = new LinkedHashMap<>();
        Map<Integer, String> months = new HashMap<>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        System.out.println("months.get(1) = " + months.get(1));
        System.out.println("months.get(3) = " + months.get(3));
        System.out.println("months = " + months);
        System.out.println("months.keySet() = " + months.keySet());
        System.out.println("months.values() = " + months.values());





    }
}
