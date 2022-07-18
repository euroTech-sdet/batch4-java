package com.days.day46;

public class Phone {

    long serialNumber ;

    String modelName;  // instance variable

    int objSpecific;


    static int totalObj;


    public Phone() {  //default cons!!
     totalObj++;
    }


    // created parametrize constructor
    public Phone(long serialNumber, String modelName, int objSpecific) {
        this.serialNumber = serialNumber;
        this.modelName = modelName;
        this.objSpecific = objSpecific;
    }

    public Phone (long serialNumber){
        this.serialNumber = serialNumber;
    }

    public void formatPhone(){
        System.out.println("FORMAT !!");
    }

    public void resetPhone(){
        System.out.println("RESET !!");
    }

    public void updateModelName(String modelName){ // parameter - local variable
        System.out.println("modelName = " + modelName);
        this.modelName = modelName;
    }
}
