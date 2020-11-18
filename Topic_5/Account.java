package com.company.Topic_5;

class Main
{
    public static void main(String[] args)
    {
        Account a1 = new Account(8, 1000, null);
        System.out.println(a1.getAmount());

        Customer dan = new Customer("Dan", 123, a1);

        a1.deposit(4000);
        a1.withdrawal(900);

        Customer leo = new Customer("Leo", 223, a1);
        System.out.println(dan);
        System.out.println(leo.getCustomerNumber());

        Customer amy = new Customer("Amy", 432);
        Account a2 = new Account(21, 90000, amy);
        Account a3 = new Account();

        System.out.println("this bank has: " + a1.getNumOfAccounts() + " accounts.");

        printObject(leo);

        printObject("Dan has in his account " + dan.getAccount().getAmount());
        System.out.println(amy.getCustomerNumber());
        printObject(a1);
        printObject(dan);

        Account ben = new Account(10, 5, null);
        System.out.println("Ben's before penalty amount $" + ben.getAmount());
        Employee.chargeFee(ben, 20);
        System.out.println("Ben's after penalty amount $" + ben.getAmount());

        Account a6 = new Account(10, 1000, null);
        Account a7 = new Account(10, 1000, null);
        Account betterFund = null;

        Employee.chooseBestAccount(betterFund, a6, a7);

        printObject(betterFund.getAmount());
    }

    public static void printObject(Object o)
    {
        System.out.println(o);
    }
}

class Account
{
    private int id;
    private double amount;
    Customer customer;

    private static int numOfAccounts = 0;

    public Account(int id, double amount, Customer customer)
    {
        this.id = id;
        this.amount = amount;
        this.customer = customer;

        numOfAccounts++;
    }

    public Account()
    {
        this.id = 999;
        this.amount = 0;
        this.customer = null;

        numOfAccounts++;
    }

    public int getNumOfAccounts()
    {
        return numOfAccounts;
    }

    public double getAmount()
    {
        return amount;
    }

    public int getId()
    {
        return id;
    }

    public void deposit(double d)
    {
        amount += d;
    }

    public void withdrawal(double d)
    {
        amount -= d;
    }

    public String toString()
    {
        return "This is the account of " + id + ". \nThe account has " + amount;
    }
}

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

    public String getName()
    {
        return name;
    }

    public int getSSN()
    {
        return ssn;
    }

    public int getCustomerNumber()
    {
        return customerNumber;
    }

    public Account getAccount()
    {
        return account;
    }

    public String toString()
    {
        return "This is customer: " + name + " with the ID: " + ssn;
    }
}

class Employee
{
    private static final double MIN_BALANCE = 10;

    public static void chargeFee(Account a, double fee)
    {
        if (a.getAmount() < MIN_BALANCE)
        {
            a.withdrawal(fee);
        }
    }

    public static void chooseBestAccount(Account better, Account a1, Account a2)
    {
        if (a1.getAmount() > a2.getAmount())
        {
            better = a1;
        }
        else
        {
            better = a2;
        }
    }
}
