package com.company.Topic_9.Bank;

public class Checking extends Account
{
    private int checks;

    public Checking()
    {
        super();
        checks = 10;
    }

    public Checking(int id, double amount, int checks)
    {
        super(id, amount);
        this.checks = checks;
    }

    public void writeCheck(double d)
    {
        checks--;
        super.withdrawal(d);
    }

    public String toString()
    {
        return super.toString() + " with checks " + checks;
    }
}
