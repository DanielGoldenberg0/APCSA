package com.company.Labs;

public class Polynomial
{
    public static double EPSILON = 0.001;

    private int fourth;
    private int third;
    private int second;
    private int first;
    private int constant;

    public Polynomial(int fourth, int third, int second, int first, int constant)
    {
        this.fourth = fourth;
        this.third = third;
        this.second = second;
        this.first = first;
        this.constant = constant;
    }

    public Polynomial(int third, int second, int first, int constant)
    {
        this.third = third;
        this.second = second;
        this.first = first;
        this.constant = constant;
    }

    public Polynomial(int second, int first, int constant)
    {
        this.second = second;
        this.first = first;
        this.constant = constant;
    }

    public Polynomial(int first, int constant)
    {
        this.first = first;
        this.constant = constant;
    }

    public double evaluate(double x)
    {
        return fourth * Math.pow(x, 4) + third * Math.pow(x, 3) + second * Math.pow(x, 2) + first * x + constant;
    }

    public double derive(double x)
    {
        return fourth * 4 * Math.pow(x, 3) + third * 3 * Math.pow(x, 2) + second * 2 * x + first;
    }

    // Newton-Raphson algorithm
    public void findRoot(double x)
    {
        double ratio = evaluate(x) / derive(x);

        while (Math.abs(ratio) >= EPSILON)
        {
            ratio = evaluate(x) / derive(x);
            x = x - ratio;
        }

        System.out.println("The value of the root is: " + Math.round(x * 100.0) / 100.0);
    }

    public static void main(String[] args)
    {
        Polynomial polynomial = new Polynomial(2, 3, -4, -5);

        polynomial.findRoot(-7);
    }
}
