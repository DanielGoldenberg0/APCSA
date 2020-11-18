package com.company.Assignments;

import java.lang.Math;

public class Algorithms
{
    public static void main(String[] args)
    {
        printNums(5, 5);
    }

    public static void triangle(int rows)
    {
        for (int i = 0; i <= rows; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void printNums(int value, int numRounds)
    {
        for (int i = 0; i <= numRounds; i++)
        {
            int rand = 0;

            while (rand != value)
            {
                rand = (int) (Math.random() * 10);
                System.out.print(rand);
            }

            System.out.println();
        }
    }

    public static void charsInString()
    {
        String str = "an anaconda and an ant";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++)
        {
            if (str.substring(i, i + 2).equals("an"))
            {
                count++;
            }
        }

        System.out.println(count);
    }
    
    public static String alternatingString(String s1, String s2)
    {
        String newS = "";

        if (s1.length() == s2.length())
        {
            for (int i = 0; i < s1.length(); i++)
            {
                newS += s1.substring(i, i + 1);
                newS += s2.substring(i, i + 1);
            }

            return newS;
        }
        else
        {
            return "Error";
        }
    }

    public static String reverse(String s)
    {
        String reversedStr = "";

        for (int i = s.length(); i > 0; i--)
        {
            reversedStr += s.substring(i-1, i);
        }

        return reversedStr;
    }

    public static String[] reverse(String[] s)
    {
        for (int i = 0; i < s.length; i++)
        {
            String reversedStr = "";

            for (int c = s[i].length(); c > 0; c--)
            {
                reversedStr += s[i].substring(c-1, c);
            }

            s[i] = reversedStr;
        }

        return s;
    }

    public static String findLongest(String[] words)
    {
        String longest = "";

        for (int i = 0; i < words.length; i++)
        {
            if (i == 0)
            {
                continue;
            }

            if (longest.length() < words[i].length())
            {
                longest = words[i];
            }
        }

        return longest;
    }

    public static void printIng(String[] s)
    {
        for (int i = 0; i < s.length; i++)
        {
            if (s[i].length() >= 3)
            {
                if ((s[i].substring(s[i].length()-3, s[i].length()-2) +
                        s[i].substring(s[i].length()-2, s[i].length()-1) +
                        s[i].substring(s[i].length()-1)).equals("ing"))
                {
                    System.out.println(s[i]);
                }
            }
        }
    }
}
