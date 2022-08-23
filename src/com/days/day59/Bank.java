package com.days.day59;

public class Bank {

    private String bankName;

    private double currentBalance;   //when we create an account we will start to update this value and will keep our current money in this variable field
    private double finalBalance;

    private String accountType;   // GOLD SAVING INTEREST

    private double depositBonus;
    private double withdrawExpense;
    private double returnRate;

    private boolean isAccountClosed= true;


    ///////////////////////////////////////// CONST  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public Bank(String accountType, double currentBalance) {

        if(isAccountClosed){
            this.currentBalance = currentBalance;
            this.accountType = accountType;
            System.out.println("Welcome to "+ getBankName()+ " Bank!!!");
            System.out.println("Your " + accountType + " account's current balance is " + currentBalance);

            this.isAccountClosed = false;

        } else{
            System.err.println("YOU CAN NOT OPEN AGAIN ACCOUNT WITHOUT CLOSING EXISTING ACCOUNT!!!");
        }
    }


    ///////////////////////////////////////// GETTER  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public String getBankName() {
        return bankName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getFinalBalance() {
        return finalBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public double getWithdrawExpense() {
        return withdrawExpense;
    }

    public double getReturnRate() {
        return returnRate;
    }


    ///////////////////////////////////////// SETTER  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setFinalBalance(double finalBalance) {
        this.finalBalance = finalBalance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public void setWithdrawExpense(double withdrawExpense) {
        this.withdrawExpense = withdrawExpense;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }


    /////////////////////////////////////////  FUNCTIONS      \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


    public void deposit(double depositValue) {
        if (depositValue < 0) {
            System.out.println("INVALID DEPOSIT VALUE!!");
            // future top: u can request a value again!!
        } else {
            setCurrentBalance(getCurrentBalance() + depositValue);
            System.out.println("YOU WERE DEPOSIT " + depositValue + " TO YOUR " + getAccountType() + " ACCOUNT!! ");
            System.out.println("Your Current Balance= " + getCurrentBalance());
        }
    }

    public void withdraw (double withdrawValue){
        if (withdrawValue < 0) {
            System.out.println("INVALID DEPOSIT VALUE!!");
            // future task: u can request a value again!!
        } else if (withdrawValue > getCurrentBalance()) {
            System.out.println("Insufficient Fund!!");
        } else {
            setCurrentBalance(getCurrentBalance() - withdrawValue);
            System.out.println("YOU WERE WITHDRAW " + withdrawValue + " TO YOUR " + getAccountType() + " ACCOUNT!! ");
            System.out.println("Your Current Balance= " + getCurrentBalance());
        }
    }


    public void closeAccount(){
        if(!this.isAccountClosed) {
            setFinalBalance(getCurrentBalance() * getReturnRate());
            setCurrentBalance(0);
            System.out.println("ACCOUNT IS CLOSED!!!");
            System.out.println("YOUR Final Balance= " + getFinalBalance());
            this.isAccountClosed = true;
        } else {
            System.out.println("Account already closed!!!");
        }

    }


    //  FUNCTION              HOW                 WHERE / WHICH
    // Create an account --> constructor!! -->> Related objects class !!
    // Welcome messages -->  constructor!! or inst block   --> PARENT
    // Deposit Rate , ,, --->  constructor!!  -->> Related objects class !!
    // Deposit,Withdraw money   --> overriding          -->> Parent + Child

    // Close account -->  separate func --> Parent
    // Close the account and calculate final balance:
        // need to flag / checkpoint account is open or close !!
        // need to transfer money current to final balance
}
