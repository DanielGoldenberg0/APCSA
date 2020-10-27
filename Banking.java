package com.company.Topic_5;

class Main
{
    public static void main(String[] args)
    {
        Account acc = new Account();
        Customer dan = new Customer("Dan", 123, acc);
        acc.customer = dan;

        acc.deposit(100);
        acc.deposit(100);
        acc.deposit(100);
        acc.deposit(100);
        acc.withdrawl(250);

        System.out.println(acc);
        System.out.println(dan.getName());
    }
}

class Account
{
    private int id;
    private double amount;
    Customer customer;

    public Account(int i, double a, Customer c)
    {
        id = i;
        amount = a;
        customer = c;
    }

    public Account()
    {
        id = 999;
        amount = 0;
        customer = null;
    }

    public double getAmount()
    {
        return amount;
    }

    public int getId() {
        return id;
    }

    public void deposit(double d)
    {
        amount += d;
    }

    public void withdrawl(double d)
    {
        amount -= d;
    }

    public String toString()
    {
        return "This is the account of " + id + ". \nThe account has " + amount;
    }
}

package com.company.Topic_5;

public class Customer
{
    private String name;
    private int ssn;
    private Account account;

    public Customer(String n, int s, Account a)
    {
        name = n;
        ssn = s;
        account = a;
    }

    public Customer(String n, int s)
    {
        name = n;
        ssn = s;
        account = null;
    }

    public String getName()
    {
        return name;
    }

    public int getSsn()
    {
        return ssn;
    }
}

