package com.company.Topic_9.Bank;

import java.util.ArrayList;

public class BankRunner
{
    public static void main(String[] args)
    {
        Account a = new Account(8, 1000);
        Checking c = new Checking(23, 300.2, 22);
        VIPAccount v = new VIPAccount(34, 10011.4, 50);
        Savings s = new Savings(45, 5000, 100, 0.03);

        ArrayList<Account> li = new ArrayList<>();
        li.add(a);
        li.add(c);
        li.add(v);
        li.add(s);

        for (Account acc : li)
        {
            System.out.println(acc);
        }
    }
}
