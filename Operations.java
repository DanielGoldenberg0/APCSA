package com.company;

import java.util.Scanner;

public class Operations
{
    public static void main(String[] args)
    {
        double num1, num2;
        double add, sub, mult, div, mod;

        Scanner scan1 = new Scanner(System.in);
        System.out.print("Number 1: ");
        num1 = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Number 2: ");
        num2 = scan2.nextInt();

        add = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        System.out.println("Sum: " + add);
        System.out.println("Difference: " + sub);
        System.out.println("Product: " + mult);
        System.out.println("Quotient: " + div);
        System.out.println("Remainder: " + mod);

        // Round positive number
        double toRound = 0.55;
        System.out.println("Rounded number: " + (int) (toRound + 0.5));

        // Round negative number
        toRound = -0.55;
        System.out.println("Rounded number: " + (int) (toRound - 0.5));
    }
}
