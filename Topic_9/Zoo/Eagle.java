package com.company.Topic_9.Zoo;

public class Eagle extends Animal
{
    private double wingspan;

    public Eagle()
    {
        super();
    }

    public Eagle(boolean alive, double weight, String color)
    {
        super(alive, weight, color);
    }

    public void setWingspan(double wingspan)
    {
        this.wingspan = wingspan;
    }

    public double getWingspan()
    {
        return  wingspan;
    }
}
