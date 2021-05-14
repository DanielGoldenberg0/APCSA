package com.company.Topic_9.Bank;

public class Savings extends VIPAccount
{
    private double rate;

    public Savings()
    {
        super();
    }

    public Savings(int i, double a, int p, double rate)
    {
        super(i, a, p);
        this.rate = rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public double getRate()
    {
        return rate;
    }

    public void depositInterest()
    {
        double interest = super.getAmount() * rate;
        super.deposit(interest);
    }
}
