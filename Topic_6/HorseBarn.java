package com.company.Topic_6;

public class HorseBarn
{
    private Horse[] spaces;

    public int findHorseSpace(String name)
    {
        for (int i = 0; i < spaces.length; i++)
        {
            if (spaces[i].getName().equals(name))
            {
                return i;
            }
        }

        return -1;
    }

    public void consolidate()
    {
        Horse[] consolidateSpaces = new Horse[spaces.length];
        int index = 0;

        for (int i = 0; i < spaces.length; i++)
        {
            if (spaces[i] != null)
            {
                consolidateSpaces[index] = spaces[i];
                index++;
            }
        }

        spaces = consolidateSpaces;
    }

    public static void main(String[] args)
    {
        Horse h1 = new Horse("h1", 172);
        Horse h2 = new Horse("h2", 128);
        Horse h3 = new Horse("h3", 105);
        Horse h4 = new Horse("h4", 131);
    }
}

class Horse
{
    private String name;
    private int weight;

    public Horse(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }
}
