package com.company;

public class BankAccount {

    public String accountHolderName;
    public String bankAccountNumber;
    public double balance;

    public BankAccount(String accountHolderName, String bankAccountNumber, double balance) {

        this.accountHolderName = accountHolderName;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
    }
        //Method Overloading Example 1
        public BankAccount(String accountHolderName, String bankAccountNumber){

            this.accountHolderName = accountHolderName;
            this.bankAccountNumber = bankAccountNumber;
            this.balance = 0;
    }
        //Method Overloading Example 2
        public BankAccount(String bankAccountNumber){

            this.accountHolderName = "Unknown";
            this.bankAccountNumber = bankAccountNumber;
            this.balance = 0;
                }



    public void withdraw(double value){
        this.balance -= value;

    }
    public void deposit(double value){
        this.balance += value;
    }

    @Override
    public String toString() {
        return accountHolderName + "'s Account: " + this.bankAccountNumber + " - $" + this.balance;
    }
}