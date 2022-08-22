package com.days.day58;

public class HidingSample {

    int num1= 1;

    public static void staticTest(){

    }
}



class SubSample extends HidingSample{

    int num1= 9;

    public void test(){
        System.out.println("this.num1 = " + this.num1);
        System.out.println("super.num1 = " + super.num1);
    }

    public static void staticTest(){

    }

    public static void main(String[] args) {
        SubSample obj = new SubSample();

        System.out.println("obj.num1 = " + obj.num1);

        obj.staticTest();

    }
}
