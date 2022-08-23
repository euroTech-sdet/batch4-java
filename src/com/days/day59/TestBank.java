package com.days.day59;

public class TestBank {


    public static void main(String[] args) {


//        Akbank talhaSaving1 = new Akbank("saving", 1000);
//
//        talhaSaving1.deposit(5000);
//
//
//        Akbank talhaGold1 = new Akbank("gold", 2000);
//
//
//        System.out.println("\n//////////////////////////////////////////////////////\n");
//        Karabank muratInterest = new Karabank("InTErESt", 5000);
//        muratInterest.deposit(6000);
//        muratInterest.withdraw(11000);
//        muratInterest.withdraw(1000);
//
//        System.out.println("muratInterest.getCurrentBalance() = " + muratInterest.getCurrentBalance());

        System.out.println("\n//////////////////////////////////////////////////////\n");

        Akbank talhaInterest1 = new Akbank("interest", 1000);
//        talhaInterest1.deposit(2000);

        talhaInterest1.closeAccount();
//        talhaInterest1.closeAccount();

        talhaInterest1= new Akbank("interest", talhaInterest1.getFinalBalance());


        Akbank talhaGold2 = new Akbank("Gold", talhaInterest1.getFinalBalance() );   // THERE IS A BUG !!! FIX IT !!!



    }


}





//    String name = talhaSaving1.getClass().getName());
//
//        System.out.println("talhaSaving1.getClass().getName() = " + name.substring((name.lastIndexOf("."))+1));

