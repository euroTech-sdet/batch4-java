package com.days.day69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class PhoneTest {
    public static void main(String[] args) {
        System.out.println("TelephoneNotebook.phoneNumbers = " + TelephoneNotebook.phoneNumbers);
        TelephoneNotebook.addNumber("Ronaldo", 123456789);
        TelephoneNotebook.addNumber("Benzema", 987654321);
        TelephoneNotebook.addNumber("Michael", 222222222);
        TelephoneNotebook.addNumber("Curry", 111111111);
        System.out.println("TelephoneNotebook.phoneNumbers = " + TelephoneNotebook.phoneNumbers);
        System.out.println(TelephoneNotebook.giveMeNumberOfThe("Benzema"));
        System.out.println(TelephoneNotebook.giveMeNumberOfThe("Michael"));
        System.out.println("howManyPersonInTheNotebook() = " + TelephoneNotebook.howManyPersonInTheNotebook());
        System.out.println("phoneNumbers.keySet() = " + TelephoneNotebook.phoneNumbers.keySet());
//        [Benzema, Ronaldo, Michael]
        TelephoneNotebook.giveMeNaeOftheNumber(111111111);


    }
}
