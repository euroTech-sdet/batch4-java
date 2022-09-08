package com.days.day55;

public class Parent extends ParentOfParent {

    public Parent(){
        super();
        System.out.println("Parent Default Cons!!");
    }

    public Parent(String name) {
        super(1111);
        System.out.println("Parent Param Cons!!");
        this.name= name;
    }

    int idNumber= 1001;

    String name;

    public Parent testDriver(){
        System.out.println("Parent test!");
        return null;
    }
}
