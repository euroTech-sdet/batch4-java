package com.days.day53;

public class StaticBlocks {


    static int num;

    int insNumber;

// Instance block!!
    {
        System.out.println("Instance block !!");
        insNumber = 10;
        System.out.println("insNumber = " + insNumber);
    }

    {
        System.out.println("Instance block2 !!");

    }

    static {
       num=5;
        System.out.println("Static block !!");
        System.out.println("num in static = " + num);
    }
    static {
        System.out.println("Static block222 !!");
    }

    public StaticBlocks(){
        System.out.println("Default Const.");
    }

    public static void main(String[] args) {

        StaticBlocks obj = new StaticBlocks();
        System.out.println("MAIN METHOD - obj.insNumber = " + obj.insNumber);

        StaticBlocks obj2 = new StaticBlocks();

        System.out.println("Start Main Method");

        num = 6;

        System.out.println("num in main method = " + num);

        System.out.println("End Point Method");
    }







    public  void test(){
        {

        }
    }

}
