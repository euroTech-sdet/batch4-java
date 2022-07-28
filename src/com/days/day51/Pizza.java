package com.days.day51;

public class Pizza {

    int pizzaSlices;//  it will be personal each member of family will have different pizza
    static int familyPizzaSlices = 20;


    public void eating() {// we can call static variables inside a nonstatic method

        pizzaSlices--;
        familyPizzaSlices--;


    }




}
