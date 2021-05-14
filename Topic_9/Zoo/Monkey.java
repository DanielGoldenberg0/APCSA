package com.company.Topic_9.Zoo;

public class Monkey extends Animal
{
    private int socialMinutes;

    public Monkey()
    {
        super();
    }

    public Monkey(boolean alive, double weight, String color)
    {
        super(alive, weight, color);
    }

    public void setSocialMinutes(int socialMinutes)
    {
        this.socialMinutes = socialMinutes;
    }

    public int getSocialMinutes()
    {
        return socialMinutes;
    }
}
