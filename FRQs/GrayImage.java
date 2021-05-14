package com.company.FRQs;

public class GrayImage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    public int countWhitePixels()
    {
        int pixelCount = 0;

        for (int[] row : pixelValues)
        {
            for (int col : row)
            {
                if (col == WHITE)
                {
                    pixelCount++;
                }
            }
        }

        return pixelCount;
    }

    public void processImage()
    {
        for (int i = 0; i < pixelValues.length-2; i++)
        {
            for (int j = 0; j < pixelValues[i].length-2; j++)
            {
                int newVal = pixelValues[i][j] - pixelValues[i+2][j+2];

                if (newVal > WHITE)
                {
                    newVal = WHITE;
                }
                else if (newVal < BLACK)
                {
                    newVal = BLACK;
                }

                pixelValues[i][j] = newVal;
            }
        }
    }
}
