package com.company.Topic_6;

public class ArrayAssignments
{
    public static void main(String[] args)
    {
        // Question 1
        int[] fiveCounts = new int[2000];

        for (int i = 0; i < fiveCounts.length; i++)
        {
            fiveCounts[i] = i * 5 + 5;
        }

        // printArray(fiveCounts);

        // Question 2
        int[] luckySeven = new int[100];

        for (int i = 0; i < luckySeven.length; i++)
        {
            luckySeven[i] = i;

            if (i % 5 == 0 && i != 0)
            {
                luckySeven[i] = 777;
            }
        }

        // printArray(lucky7);

        // Question 6
        int[] diceRolls = new int[100];

        for (int i = 0; i < diceRolls.length; i++)
        {
            diceRolls[i] = (int) (Math.random() * 6) + 1;
        }

        // printArray(diceRolls);

        // Question 7
        int[] satScores = new int[20];

        for (int i = 0; i < satScores.length; i++)
        {
            satScores[i] = (int) (Math.random() * (100 / 0.7) + 520);
        }

        // printArray(satScores);

        // Question 8
        String[] evenRow = new String[8];
        String[] oddRow = new String[8];

        for (int i = 0; i < evenRow.length; i++)
        {
            if (i % 2 == 0)
            {
                evenRow[i] = "X";
                oddRow[i] = "O";
            }
            else
            {
                evenRow[i] = "O";
                oddRow[i] = "X";
            }
        }

        for (int i = 0; i < 7; i++)
        {
            if (i % 2 == 0)
            {
                printArray(evenRow);
            }
            else
            {
                printArray(oddRow);
            }

            System.out.println();
        }
    }

    public static void printArray(int[] arr)
    {
        for (int j : arr)
        {
            System.out.println(j);
        }
    }

    public static void printArray(String[] arr)
    {
        for (String j : arr)
        {
            System.out.print(j);
        }
    }
}
