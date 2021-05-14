package com.company.Labs;

import java.util.ArrayList;

public class Calculus
{
    static final double EPSILON = 0.001;
    ArrayList<Integer> coefficients;
    int count = 0;

    public Calculus(int a, int b, int c, int d, int e)
    {
        coefficients = new ArrayList<Integer>();
        coefficients.add(0, a);
        coefficients.add(0, b);
        coefficients.add(0, c);
        coefficients.add(0, d);
        coefficients.add(0, e);
    }
}
