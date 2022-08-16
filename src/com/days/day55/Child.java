package com.days.day55;

public class Child extends Parent  {

    public Child() {
        super();
        System.out.println("Child Default Cons!!");
    }

    public Child(String name) {
        super(name);
        System.out.println("Child Param Cons!!");
    }

    public Child (int referenceNumber, String name){
        super(name);
        this.referenceNumber= referenceNumber;
    }

    int idNumber = 1005;

    int referenceNumber;

    String keyword;


    public void testDriver(){
        super.testDriver();
        System.out.println("Child test!");
    }

    public void idCheck(){
        System.out.println("Child Id number:" + this.idNumber );
        System.out.println("Parent Id number:" + super.idNumber );
    }

    public void testBothDriver(){
        this.testDriver();
        super.testDriver();
    }



}
