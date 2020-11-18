package com.company.Topic_4;

import java.util.Scanner;

public class StringShortener
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine().toLowerCase();

        int repeatsRemoved = 0;
        int vowelsRemoved = 0;
        String shortStr1 = "";

        // Algorithm #1
        for (int i = 0; i < str.length(); i++)
        {
            String letter = str.substring(i, i + 1);

            if (i != 0 && !str.substring(i - 1, i).equals(" ") && (letter.equals("a") || letter.equals("e")
                    || letter.equals("i") || letter.equals("o") || letter.equals("u")))
            {
                vowelsRemoved++;
            }
            else if (i > 0 && letter.equals(str.substring(i - 1, i)))
            {
                repeatsRemoved++;
            }
            else
            {
                shortStr1 += letter;
            }
        }

        String shortStr2 = "";
        int numLetters = 0;

        // Algorithm #2
        for (int i = 0; i < str.length(); i++)
        {
            String letter = str.substring(i, i + 1);

            if (!letter.equals(" "))
            {
                boolean used = false;

                for (int j = 0; j < i; j++)
                {
                    if (str.substring(j, j + 1).equals(letter))
                    {
                        used = true;
                    }
                }

                if (!used)
                {
                    numLetters++;
                    int count = 0;

                    for (int j = i; j < str.length(); j++)
                    {
                        if (str.substring(j, j + 1).equals(letter))
                        {
                            count++;
                        }
                    }

                    shortStr2 += count + letter;
                }
            }
        }

        System.out.println("Repeats removed: " + repeatsRemoved);
        System.out.println("Vowels removed: " + vowelsRemoved);
        System.out.println("Algorithm 1 message: " + shortStr1);

        System.out.println();

        System.out.println("Number of letters: " + numLetters);
        System.out.println("Algorithm 2 message: " + shortStr2);
    }
}
