package com.company.Topic_9.Frisbee;

public class UltimatePlayer extends Person
{
    private static int jerseyCounter = 0;
    private int jerseyNumber;
    private String position;

    public UltimatePlayer(String first, String last, String position)
    {
        super(first, last);

        if (position.equals("handler") || position.equals("cutter"))
        {
            this.position = position;
        }
        else
        {
            this.position = "handler";
        }

        jerseyCounter++;
        this.jerseyNumber = jerseyCounter;
    }

    public String getPosition()
    {
        return position;
    }

    public int throwDisk(int pow)
    {
        int thisThrow;

        if (pow <= 1)
        {
            thisThrow = 1;
        }
        else if (pow >= 10)
        {
            thisThrow = 10;
        }
        else
        {
            thisThrow = pow;
        }

        return thisThrow * 4;
    }

    public String toString()
    {
        return super.toString() +
                "\n   Jersey #: " + this.jerseyNumber +
                "\n   Position: " + this.position;
    }
}
