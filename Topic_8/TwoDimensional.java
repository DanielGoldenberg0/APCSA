package com.company.Topic_8;

public class TwoDimensional
{
    public static void main(String[] args)
    {
        int[][] grid = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        for (int[] row : grid)
        {
            for (int val : row)
            {
                System.out.print(val + " ");
            }
        }
    }
}
