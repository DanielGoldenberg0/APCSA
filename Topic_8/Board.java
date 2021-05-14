package com.company.Topic_8;

public class Board
{

    private String[][] squares;

    public Board()
    {
        squares = new String[10][10];

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                squares[i][j] = "-";
            }
        }
    }

    public String toString()
    {
        String board = "";

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                board += squares[i][j] + " ";
            }

            board += "\n";
        }

        return board;
    }

    public boolean addShip(int row, int col, int len, boolean horizontal)
    {
        return false;
    }

    public boolean foundShip(int len)
    {
        return false;
    }

    public int shoot(int row, int col)
    {
        return 0;
    }

    public boolean gameOver()
    {
        return false;
    }
}
