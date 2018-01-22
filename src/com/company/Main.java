package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount cust1= new BankAccount("Joan", "1234", 0.00);

        BankAccount cust2 = new BankAccount("Lori", "2345", 0.00);

        BankAccount cust3 = new BankAccount("Koddie", "3456", 0.00);

        BankAccount cust4 = new BankAccount("Kym", "4567", 0.00);

        BankAccount cust5 = new BankAccount("Ted", "5678", 0.00);

        BankAccount cust6 = new BankAccount("Mark", "6789", 0.00);

        BankAccount cust7 = new BankAccount("Jake", "9876", 0.00);

        BankAccount cust8 = new BankAccount("Zech", "8765", 0.00);

        BankAccount cust9 = new BankAccount("Manny", "7654", 0.00);

        BankAccount cust10 = new BankAccount("Scott", "6543", 0.00);

        BankAccount cust11 = new BankAccount("Estella", "9394");

        BankAccount cust12 = new BankAccount("8565");


        // Create an Array
        BankAccount[]listOfAccounts = {cust1, cust2, cust3, cust4, cust5, cust6, cust7, cust8, cust9, cust10, cust11, cust12};

            for (int i = 0; i < listOfAccounts.length; i++) {
            listOfAccounts[i].deposit(57000);
                System.out.println(listOfAccounts[i].balance);

        }

        for (BankAccount specificAccount : listOfAccounts){
            System.out.println(specificAccount.accountHolderName);
            System.out.println("BONUS DAY!!!");
                specificAccount.deposit(500);
            System.out.println(specificAccount);
    }


}}
