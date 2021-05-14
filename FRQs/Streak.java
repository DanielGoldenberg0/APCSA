package com.company.FRQs;

public class Streak
{
    public static void longestStreak(String str)
    {
        int maxCount = 1;
        String letter = "";

        for (int i = 0; i < str.length(); i++)
        {
            String currLetter = str.substring(i, i+1);
            int count = 1;

            for (int k = i + 1; k < str.length(); k++)
            {
                if (currLetter.equals(str.substring(k, k+1)))
                {
                    count++;
                }
                else
                {
                    break;
                }
            }

            if (count > maxCount)
            {
                maxCount = count;
                letter = currLetter;
            }
        }

        System.out.println(letter + " " + maxCount);
    }

    public static void longestStreak2(String str)
    {
        int longest = 1;
        int count = 1;

        for (int i = 1; i < str.length(); i++)
        {
            if (str.charAt(i) == str.charAt(i-1))
            {
                count += 1;

                if (count >= longest)
                {
                    longest = count;
                }
            }
            else
            {
                count = 1;
            }
        }

        System.out.print(longest);
    }

    public static void main(String[] args)
    {
        longestStreak("affs");
    }
}
