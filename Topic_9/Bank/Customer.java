package com.company.Topic_9.Bank;

class Customer
{
    private String name;
    private int ssn;
    private Account account;
    private static int customerNumber = 0;

    public Customer(String n, int s)
    {
        this.name = n;
        this.ssn = s;
        this.account = null;

        customerNumber++;
    }

    public Customer(String name, int ssn, Account account)
    {
        this.name = name;
        this.ssn = ssn;
        this.account = account;

        customerNumber++;
    }

    public String getName() {
        return name;
    }

    public int getSSN() {
        return ssn;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public Account getAccount() {
        return account;
    }

    public String toString() {
        return "This is customer: " + name + " with the ID: " + ssn;
    }
}
