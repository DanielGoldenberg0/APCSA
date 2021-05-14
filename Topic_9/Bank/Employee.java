package com.company.Topic_9.Bank;

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