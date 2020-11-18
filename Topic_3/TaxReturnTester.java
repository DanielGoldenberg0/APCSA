package com.company.Topic_3;

import javax.swing.*;

public class TaxReturnTester
{
    public static void main(String[] args)
    {
        int incomeInput = -1;
        String statusInput;
        TaxReturn client = new TaxReturn();

        while (incomeInput < 0 || incomeInput >= 1000000000)
        {
            incomeInput = Integer.parseInt(JOptionPane.showInputDialog("Please enter your income: "));
            statusInput = JOptionPane.showInputDialog("Please enter \"single\" or \"married\": ");
            client = new TaxReturn(incomeInput, statusInput, 100);
        }

        TaxReturn client2 = new TaxReturn(101);

        System.out.println("Client " + client.getSSN() +" owes $" + client.getTax());
        System.out.println("Client2 " + client2.getSSN());
    }
}

class TaxReturn
{
    private double income;
    private String status;
    private int ssn;

    private static final double RATE_1 = 0.12;
    private static final double RATE_2 = 0.22;
    private static final double RATE_3 = 0.24;
    private static final double RATE_4 = 0.32;

    private static final double SINGLE_BRACKET_1 = 9875;
    private static final double SINGLE_BRACKET_2 = 40125;
    private static final double SINGLE_BRACKET_3 = 85525;
    private static final double SINGLE_BRACKET_4 = 163300;

    private static final double MARRIED_BRACKET_1 = 19750;
    private static final double MARRIED_BRACKET_2 = 80250;
    private static final double MARRIED_BRACKET_3 = 171050;
    private static final double MARRIED_BRACKET_4 = 326600;

    public TaxReturn() {}

    public TaxReturn(int ssn)
    {
        this.ssn = ssn;
    }

    /**
     * Create taxReturn for client object
     * @param income taxpayer's income as double
     * @param status taxpayer's marital status as String
     **/

    public TaxReturn(double income, String status, int ssn)
    {
        this.income = income;
        this.status = status;
        this.ssn = ssn;
    }

    public double getTax()
    {
        double tax;

        if (status.equalsIgnoreCase("married"))
        {
            if (income <= MARRIED_BRACKET_1)
            {
                tax = income * RATE_1;
            }
            else if (income <= MARRIED_BRACKET_2)
            {
                tax = RATE_1 * MARRIED_BRACKET_1 + RATE_2 * (income - MARRIED_BRACKET_1);
            }
            else if (income <= MARRIED_BRACKET_3)
            {
                tax = RATE_1 * MARRIED_BRACKET_1 + RATE_2 * (MARRIED_BRACKET_2 - MARRIED_BRACKET_1) +
                        RATE_3 * (income - MARRIED_BRACKET_2);
            }
            else
            {
                tax = RATE_1 * MARRIED_BRACKET_1 + RATE_2 * (MARRIED_BRACKET_2 - MARRIED_BRACKET_1) +
                        RATE_3 * (MARRIED_BRACKET_3 - MARRIED_BRACKET_2) +
                        RATE_4 * (income - MARRIED_BRACKET_4);
            }
        }
        else if (status.equalsIgnoreCase("single"))
        {
            if (income <= SINGLE_BRACKET_1)
            {
                tax = income * RATE_1;
            }
            else if (income <= SINGLE_BRACKET_2)
            {
                tax = RATE_1 * SINGLE_BRACKET_1 + RATE_2 * (income - SINGLE_BRACKET_1);
            }
            else if (income <= SINGLE_BRACKET_3)
            {
                tax = RATE_1 * SINGLE_BRACKET_1 + RATE_2 * (SINGLE_BRACKET_2 - SINGLE_BRACKET_1) +
                        RATE_3 * (income - SINGLE_BRACKET_2);
            }
            else
            {
                tax = RATE_1 * SINGLE_BRACKET_1 + RATE_2 * (SINGLE_BRACKET_2 - SINGLE_BRACKET_1) +
                        RATE_3 * (SINGLE_BRACKET_3 - SINGLE_BRACKET_2) +
                        RATE_4 * (income - SINGLE_BRACKET_4);
            }
        }
        else
        {
            return 0;
        }

        return tax;
    }

    public int getSSN()
    {
        return this.ssn;
    }
}
