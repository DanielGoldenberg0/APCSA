package com.company.Projects;

public class Country
{
    private String name;
    private int population;
    private double gdp;
    private boolean industrailized;

    public Country(String name, int population, double gdp, boolean industrailized)
    {
        this.name = name;
        this.population = population;
        this.gdp = gdp;
        this.industrailized = industrailized;
    }

    public String getName()
    {
        return name;
    }

    public int getPopulation()
    {
        return population;
    }

    public double getGDP()
    {
        return gdp;
    }

    public boolean getIndustrailized()
    {
        return industrailized;
    }

    public void setPopulation(int population)
    {
        this.population = population;
    }

    public void setGDP(double gdp)
    {
        this.gdp = gdp;
    }

    public void setIndustrailized(boolean industrailized)
    {
        this.industrailized = industrailized;
    }
}
