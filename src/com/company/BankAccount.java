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

    public void withdraw(double amount){
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Funds");
        }

    }
    public void deposit(double amount){

    }

}