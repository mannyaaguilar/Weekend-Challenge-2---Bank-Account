package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount cust1= new BankAccount("Joan", "1234", 57000);
        cust1.deposit(57000);

        BankAccount cust2 = new BankAccount("Lori", "2345", 57000);
        cust2.deposit(57000);

        BankAccount cust3 = new BankAccount("Koddie", "3456", 57000);
        cust3.deposit(57000);

        BankAccount cust4 = new BankAccount("Kym", "4567", 57000);
        cust4.deposit(57000);

        BankAccount cust5 = new BankAccount("Ted", "5678", 57000);
        cust5.deposit(57000);

        BankAccount cust6 = new BankAccount("Mark", "6789", 57000);
        cust6.deposit(57000);

        BankAccount cust7 = new BankAccount("Jake", "9876", 57000);
        cust7.deposit(57000);

        BankAccount cust8 = new BankAccount("Zech", "8765", 57000);
        cust8.deposit(57000);

        BankAccount cust9 = new BankAccount("Manny", "7654", 57000);
        cust9.deposit(57000);

        System.out.println(cust1.accountHolderName + "'s Account Balance is:$" + cust1.balance);
        System.out.println(cust2.accountHolderName + "'s Account Balance is:$" + cust2.balance);
        System.out.println(cust3.accountHolderName + "'s Account Balance is:$" + cust3.balance);
        System.out.println(cust4.accountHolderName + "'s Account Balance is:$" + cust4.balance);
        System.out.println(cust5.accountHolderName + "'s Account Balance is:$" + cust5.balance);
        System.out.println(cust6.accountHolderName + "'s Account Balance is:$" + cust6.balance);
        System.out.println(cust7.accountHolderName + "'s Account Balance is:$" + cust7.balance);
        System.out.println(cust8.accountHolderName + "'s Account Balance is:$" + cust8.balance);
        System.out.println(cust9.accountHolderName + "'s Account Balance is:$" + cust9.balance);


    }


}
