package com.days.day51;

public class BankTest {


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);
        System.out.println("account1.balance = " + account1.balance);
        System.out.println("account2.balance = " + account2.balance);
        account1.putMoney(3000);
        System.out.println("account1.balance = " + account1.balance);
        System.out.println("account2.balance = " + account2.balance);
        System.out.println("BankAccount.bankcapital = " + BankAccount.bankcapital);
        account2.putMoney(10000);// 12000
        // capital 16000
        System.out.println("account2.balance = " + account2.balance);
        System.out.println("BankAccount.bankcapital = " + BankAccount.bankcapital);
        BankAccount account3 = new BankAccount(20000);
        System.out.println("account1.balance = " + account1.balance);//4000
        System.out.println("account2.balance = " + account2.balance);//12000
        System.out.println("account3.balance = " + account3.balance);//20000
        System.out.println("BankAccount.bankcapital = " + BankAccount.bankcapital);//36000
    }
}
