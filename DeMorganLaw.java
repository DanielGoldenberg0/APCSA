package com.company.Topic_3;

public class DeMorganLaw
{
    public static void main(String[] args)
    {
        // 3.6 Daily Video 1

        int a = 0;
        int b = 1;

        // Equivalent
        boolean bool1 = !(a == 0 && b == 1);
        boolean bool2 = a != 0 || b != 1;

        // Equivalent
        boolean bool3 = !(a >= 0 || b <= 1);
        boolean bool4 = a < 0 && b > 1;
    }
}
