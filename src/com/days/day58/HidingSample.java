package com.days.day58;

public class HidingSample {

    int num1= 1;
    String str1 = "Hi";

    public static void staticTest(){
        System.out.println("Parent Static method");
    }
}



class SubSample extends HidingSample{

    int num1= 9;  // we are hiding parent num1 variable!!!

    public void test(){
        System.out.println("this.num1 = " + this.num1);
        System.out.println("super.num1 = " + super.num1);
    }

    public static void staticTest(){  // parent class's statiscTest method hidded!!!
        System.out.println("Child Static method");
    }

    public static void main(String[] args) {
        SubSample obj = new SubSample();

        System.out.println("obj.str1 = " + obj.str1);
        System.out.println("obj.num1 = " + obj.num1);

        obj.staticTest();

    }
}
