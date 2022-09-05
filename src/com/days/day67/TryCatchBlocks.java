package com.days.day67;

public class TryCatchBlocks {


    public static void main(String[] args) throws InterruptedException  {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try{
            System.out.println("Test Started");
            System.out.println("Test running");
          //  System.out.println("Error Occurs" + (1/0));
        } catch (Exception e){
            System.out.println(" Exception Handled , go on, no worries bro!!");
        }


        System.out.println("END OF THE TEST");




    }
}
