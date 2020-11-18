package com.company.Topic_5;

public class Fraction
{
    private int numerator;
    private int denominator;

    private static int numFractions;

    public Fraction()
    {
        numerator = 1;
        denominator = 1;

        Fraction.numFractions++;
    }

    public Fraction(int n, int d)
    {
        numerator = 1;
        denominator = 1;

        if (n > 0)
        {
            numerator = n;
        }

        if (d > 0)
        {
            denominator = d;
        }

        Fraction.numFractions++;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public static int getNumFractions()
    {
        return Fraction.numFractions;
    }

    public String mixedNumber()
    {
        if (numerator <= denominator)
        {
            return numerator + "/" + denominator;
        }
        else if (numerator == 0)
        {
            return "0";
        }
        else
        {
            return numerator / denominator + " " + numerator % denominator + "/" + denominator;
        }
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }

    public void setNumerator(int n)
    {
        if (n > 0)
        {
            numerator = n;
        }
    }

    public void setDenominator(int d)
    {
        if (d > 0)
        {
            denominator = d;
        }
    }

    void add(int n, int d)
    {
        if (n > 0 && d > 0)
        {
            numerator = numerator * d + n * denominator;
            denominator *= d;
        }
    }

    void add(Fraction other)
    {
        numerator = numerator * other.denominator + other.numerator * denominator;
        denominator = denominator * other.denominator;
    }

    public void multiply(int n, int d)
    {
        if (n > 0 && d > 0)
        {
            numerator *= n;
            denominator *= d;
        }
    }

    public void multiply(Fraction other)
    {
        if (other.numerator > 0 && other.denominator > 0)
        {
            numerator *= other.numerator;
            denominator *= other.denominator;
        }
    }
}
