package com.company.Topic_9.Bank;

class Account
{
    private int id;
    private double amount;
    private Customer customer;

    private static int numOfAccounts = 0;

    public Account(int id, double amount, Customer customer)
    {
        this.id = id;
        this.amount = amount;
        this.customer = customer;

        numOfAccounts++;
    }

    public Account(int id, double amount)
    {
        this.id = id;
        this.amount = amount;

        numOfAccounts++;
    }

    public Account()
    {
        this.id = 999;
        this.amount = 0;
        this.customer = null;

        numOfAccounts++;
    }

    public int getNumOfAccounts() {
        return numOfAccounts;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public void deposit(double d) {
        amount += d;
    }

    public void withdrawal(double d) {
        amount -= d;
    }

    public String toString() {
        return "This is the account of " + id + ". \nThe account has " + amount;
    }
}
