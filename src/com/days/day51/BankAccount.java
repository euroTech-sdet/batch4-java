package com.days.day51;

public class BankAccount {
    static String bankName = "HSBC";
    String accountOwnerName;
    double balance;
    static double bankcapital;


    BankAccount(double money) {
        balance = money;
        this.bankcapital = bankcapital + money;
    }

    public void putMoney(double money) {
        balance = balance + money;
        this.bankcapital = this.bankcapital + money;
    }
    // withdraw


}
