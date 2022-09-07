package com.days.day69;

import java.util.HashMap;
import java.util.Map;

public class Capitals {
    public static void main(String[] args) {
        // America-Washington, Germany-Berlin , Italy-Roma, Spain-Madrid

        Map<String, String> capitalOf = new HashMap<>();
        capitalOf.put("America", "Washington");
        capitalOf.put("Germany", "Berlin");
        capitalOf.put("Italy", "Roma");
        capitalOf.put("Spain", "Madrid");

        System.out.println("America = " + capitalOf.get("America"));
        System.out.println("Spain = " + capitalOf.get("Spain"));

        System.out.println("capitalOf.values() = " + capitalOf.values());
        System.out.println("capitalOf.keySet() = " + capitalOf.keySet());

        System.out.println("capitalOf = " + capitalOf);
        //for each loop print all the values and keys

        for (String str : capitalOf.keySet()) {
            System.out.print("key =" + str);
            System.out.println(" value = " + capitalOf.get(str));
        }
        System.out.println("capitalOf.size() = " + capitalOf.size());
        System.out.println("capitalOf.containsValue(\"Oslo\") = " + capitalOf.containsValue("Oslo"));
        System.out.println("Check all the values for Roma  = "+ capitalOf.containsValue("Roma"));
        System.out.println("capitalOf.containsKey(\"Italy\") = " + capitalOf.containsKey("Italy"));
        capitalOf.putIfAbsent("Norway","Oslo");
        capitalOf.putIfAbsent("Germany","Munich");
        capitalOf.replace("Germany","Munich");
        capitalOf.put("Germany","Berlin");
//        capitalOf.clear();
        System.out.println("capitalOf = " + capitalOf);


    }
}
