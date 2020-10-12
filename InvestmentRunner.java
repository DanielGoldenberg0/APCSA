package com.company.Topic_4;

import java.util.Scanner;

public class InvestmentRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Client 1, what is your initial balance?");
        String initialBalanceString = input.nextLine();
        double initialBalance = Double.parseDouble(initialBalanceString);

        System.out.println("What is your desired balance?");
        String finalBalanceString = input.nextLine();
        double finalBalance = Double.parseDouble(finalBalanceString);

        Investment client = new Investment(initialBalance, 0.07);
        client.waitForBalance(finalBalance);
        System.out.println(client.getYears());
    }
}

class Investment
{
    int years;
    double balance;
    double rate;

    /**
     * @param balance the balance
     * @param rate the interest rate
     **/

    public Investment(double balance, double rate)
    {
        this.balance = balance;
        this.rate = rate;
    }

    public void waitForBalance(double targetBalance)
    {
        while (balance < targetBalance)
        {
            years++;

            double interest = balance * rate / 100;
            balance += interest;
        }
    }

    public void waitYears(int numYears)
    {
        for (int i = 0; i < numYears; i++)
        {
            double interest = balance * rate / 100;
            balance += interest;
        }

        years += numYears;
    }

    public int getYears()
    {
        return years;
    }

    public double getBalance()
    {
        return balance;
    }
}
