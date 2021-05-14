package com.company.Topic_10;

public class Recursion
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(fib(10));
    }

    private static int factorial(int n)
    {
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }

    private static int loopFactorial(int n)
    {
        int result = 0;

        for (int i = n; i >= 1; i--)
        {
            result = n;
            result *= i - 1;
        }

        return result;
    }

    private static int fib(int n)
    {
        if (n == 1) return 0;
        else if (n == 2) return 1;

        return fib(n-1) + fib(n-2);
    }

    private static int loopFib(int n)
    {
        int first = 1;
        int second = 1;
        int result = 0;

        if (n == 1) return 0;
        if (n == 2 || n == 3) return 1;

        if (n > 3)
        {
            for (int i = 4; i <= n; i++)
            {
                result = first + second;
                first = second;
                second = result;
            }
        }

        return result;
    }
}
