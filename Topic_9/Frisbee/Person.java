package com.company.Topic_9.Frisbee;

public class Person
{
    private String first;
    private String last;

    public Person(String first, String last)
    {
        this.first = first;
        this.last = last;
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

        return thisThrow * 2;
    }

    public String toString()
    {
        return last + ", " + first;
    }
}
