package com.company;

import java.util.Scanner;

public class Compunding
{
    public static void main(String[] args)
    {
        int salary;

        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is your base salary?");
        salary = scan1.nextInt();

        System.out.println("Your base salary is " + salary);

        salary += 15000;
        System.out.println("Your salary with added bonus is " + salary);

        salary -= 1000;
        System.out.println("Your salary with a deduction is " + salary);

        salary *= 2;
        System.out.println("Your salary soubled is " + salary);

        salary /= 1.5;
        System.out.println("Your salary divided by 1.5 is " + salary);

        salary %= 10;
        System.out.println("The last digit: " + salary);

        int num = 10; //32 bits
        String binNum = Integer.toBinaryString(num);
        System.out.println("Your number in binary is: " + binNum);

        // adding one more to the max value of 32 bits makes it wrap around the negatives
        // vice versa for the min value
        System.out.println("The maximum int value: " + (Integer.MAX_VALUE + 1) );
        System.out.println("The maximum int value: " + (Integer.MIN_VALUE - 1) );

        // dividing by 0 is called a rhythmic exception
    }
}
