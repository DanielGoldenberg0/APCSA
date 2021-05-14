package com.company.Topic_9.Zoo;

public class Animal
{
    private boolean alive;
    private double weight;
    private String color;

    public Animal()
    {
        this.alive = true;
    }

    public Animal(boolean alive, double weight, String color)
    {
        this.alive = alive;
        this.weight = weight;
        this.color = color;
    }

    public void setAlive(boolean alive)
    {
        this.alive = alive;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean getAlive()
    {
        return alive;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getColor()
    {
        return color;
    }
}
