package com.company;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

    }

    public static void recur(int n)
    {
        if (n > 10) recur(n / 10);

        System.out.println(n % 10);
    }
}
