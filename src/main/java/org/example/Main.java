package org.example;

import org.example.interfaces.AccountInterface;
import org.example.model.Bank;
import org.example.model.CurrentAccount;
import org.example.model.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount newAccount = new SavingsAccount(2100, 4.8, 3);
        SavingsAccount newAccount2 = new SavingsAccount(2100, 4.8, 3);

        bank.addAccount(newAccount);
        bank.addAccount(newAccount2);

        newAccount.withdraw(1000);
        System.out.println(newAccount.toString());
        newAccount2.deposit(1000);
        System.out.println(newAccount2.toString());


        CurrentAccount currentAccount = new CurrentAccount(1400);
        CurrentAccount currentAccount3 = new CurrentAccount(3000);
        System.out.println("***********************");
        bank.addAccount(currentAccount);
        bank.addAccount(currentAccount3);

        System.out.println(currentAccount.toString());
        System.out.println(currentAccount3.toString());


    }
}