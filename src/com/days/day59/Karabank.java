package com.days.day59;

public class Karabank extends Bank{

    public Karabank(String accountType, double currentBalance) {
        super(accountType.toUpperCase(),currentBalance+100);

        switch (getAccountType()){
            case "GOLD":
                setDepositBonus(80);
                setWithdrawExpense(90);
                setReturnRate(1.4);
                break;
            case "SAVING":
                setDepositBonus(100);
                setWithdrawExpense(70);
                setReturnRate(1.1);
                break;
            case "INTEREST":
                setDepositBonus(90);
                setWithdrawExpense(80);
                setReturnRate(1.2);
                break;

            default:
                System.out.println("INVALID ACCOUNT TYPE!!!");
                // future dep: ask again account name or stop execution!!
                break;
        }
    }



    /////////////////////////////////////////  FUNCTIONS      \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


    @Override
    public void deposit(double depositValue) {
        if(depositValue<3000){
            super.deposit(depositValue);
        } else{
            super.deposit(depositValue + getDepositBonus());
        }
    }

    @Override
    public void withdraw(double withdrawValue) {
        if(withdrawValue < 2000){
            super.withdraw(withdrawValue);
        } else {
            super.withdraw(withdrawValue + getWithdrawExpense());
        }
    }
}
